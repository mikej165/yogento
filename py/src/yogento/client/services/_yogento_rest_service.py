from thryft.protocol.json_protocol import JsonProtocol
from urllib2 import HTTPError
from yogento.client.services._yogento_web_service import _YogentoWebService


class _YogentoRestService(_YogentoWebService):
    # Helper classes
    class __IntSet(object):
        @classmethod
        def read(cls, iprot):
            string_set = []
            for _ in xrange(iprot.readSetBegin()[1]):
                string_set.append(iprot.readI32())
            iprot.readSetEnd()
            return frozenset(string_set)

    class __ModelSet(object):
        def __init__(self, model_class=None, models=None):
            object.__init__(self)
            self.__model_class = model_class
            self.__models = models

        def read(self, iprot):
            model_class = self.__model_class
            model_set = []
            for _ in xrange(iprot.readSetBegin()[1]):
                model = model_class.read(iprot)
                model_set.append(model)
            iprot.readSetEnd()
            return frozenset(model_set)

        def write(self, oprot):
            oprot.writeSetBegin()
            for model in self.__models:
                model.write(oprot)
            oprot.writeSetEnd()

    class __StringSet(object):
        @classmethod
        def read(cls, iprot):
            string_set = []
            for _ in xrange(iprot.readSetBegin()[1]):
                string_set.append(iprot.readString())
            iprot.readSetEnd()
            return frozenset(string_set)

    def __init__(self, api_url, headers=None):
        api_url = api_url.rstrip('/')
        if not api_url.endswith('/rest'):
            api_url += '/rest'
        _YogentoWebService.__init__(self, api_url=api_url, headers=headers)

    def _delete_model(self, url, query=None):
        try:
            self._request('DELETE', url, query=query)
            return True
        except HTTPError, e:
            if e.code == 404:
                return False
            else:
                raise

    def _delete_models(self, url, query=None):
        self._request('DELETE', url, query=query)

    def _get(self, url, api_exceptions=True, query=None):
        return self._request('GET', url, api_exceptions=api_exceptions, query=query)

    def _get_model(self, model_class, url, query=None):
        return model_class.read(JsonProtocol(self._request('GET', url, query=query)))

    def _get_model_count(self, url, query=None):
        return tuple(self._get_model(self.__IntSet, url, query=query))[0]

    def _get_model_set(self, model_class, url, query=None):
        return self._get_model(self.__ModelSet(model_class=model_class), url, query=query)

    def _get_string_set(self, url, query=None):
        return self._get_model(self.__StringSet, url, query=query)

    def _head_model(self, url, query=None):
        try:
            self._request('HEAD', url, query=query, api_exceptions=False)
            return True
        except HTTPError, e:
            if e.code == 404:
                return False
            else:
                raise

    def _post_model(self, model, url, out_model_class=None, query=None):
        oprot = JsonProtocol()
        model.write(oprot)
        model_json = str(oprot)
        response_data = \
            self._request(
                'POST',
                url,
                data=model_json,
                headers={'Content-Type': 'application/json'},
                query=query
            )
        if out_model_class is not None:
            return out_model_class.read(JsonProtocol(response_data))

    def _post_models_csv(self, models_csv, url, query=None):
        BOUNDARY = '----------lImIt_of_THE_fIle_eW_$'
#            for (key, value) in fields:
#                L.append('--' + BOUNDARY)
#                L.append('Content-Disposition: form-data; name="%s"' % key)
#                L.append('')
#                L.append(value)
#        for (key, filename, value) in files:
        body = []
        body.append('--' + BOUNDARY)
        body.append('Content-Disposition: form-data; name="%s"; filename="%s"' % ("file", "models.csv"))
        body.append('Content-Type: %s' % 'text/csv')
        body.append('')
        body.append(models_csv)
        body.append('--' + BOUNDARY + '--')
        body.append('')
        body = "\r\n".join(body)
        return \
            self._request(
                'POST',
                url,
                data=body,
                headers={'Content-Type': 'multipart/form-data; boundary=%s' % BOUNDARY},
                query=query
            )

    def _put_model(self, model, url, out_model_class=None, query=None):
        oprot = JsonProtocol()
        model.write(oprot)
        model_json = str(oprot)
        response_data = \
            self._request(
                'PUT',
                url,
                data=model_json,
                headers={'Content-Type': 'application/json'},
                query=query
            )
        if out_model_class is not None:
            return out_model_class.read(JsonProtocol(response_data))

    def _put_model_set(self, models, url, query=None):
        return self._put_model(self.__ModelSet(models=models), url, query=query)

    def _request(self, method, url, api_exceptions=True, data=None, headers=None, query=None):
        try:
            response = \
                _YogentoWebService._request(
                    self,
                    method,
                    url,
                    data=data,
                    headers=headers,
                    query=query
                )
        except HTTPError, e:
            if api_exceptions:
                # urllib2 discards the HTTP reason phrase
                # exception_class_qname = e.msg.split('.')
                exception_class_qname = e.hdrs.get('Warning')
                if exception_class_qname is None:
                    raise
                try:
                    exception_class = self._import_exception_class(exception_class_qname)
                except ImportError:
                    raise RuntimeError(exception_class_qname)
                if e.hdrs.get('content-type') == 'application/json':
                    response_data = self._read_response(e.fp)
                    if len(response_data) > 0:
                        exception = exception_class.read(JsonProtocol(response_data))
                    else:
                        exception = exception_class()
                else:
                    exception = exception_class()

                raise exception
            else:
                raise
        except Exception, e:
            self._logger.warning("error opening %s", url, exc_info=True)
            raise

        try:
            return self._read_response(response)
        finally:
            response.close()
