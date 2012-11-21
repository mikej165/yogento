from yogento.client.services.user.impl.yogento_jsonrpc_user_service import \
    YogentoJsonrpcUserService
import logging


logging.basicConfig(level=logging.DEBUG)
class _YogentoWebServiceTest(object):
    API_PASSWORD = '_yogento_web_service_test'
    API_NETINFO = None
    API_PATH = None
    API_USERNAME = '_yogento_web_service_test'
    API_URL = None
    for api_netinfo, api_path in (
        ('localhost:8080', '/yogento/api/'),
        ('yogento.com', '/api/'),
    ):
        api_url = "http://%(API_USERNAME)s:%(API_PASSWORD)s@%(api_netinfo)s%(api_path)s" % locals()
        try:
            YogentoJsonrpcUserService(api_url).get_current_user()
        except:
            logging.error("unable to contact %s", api_netinfo, exc_info=True)
            continue
        API_NETINFO = api_netinfo
        API_PATH = api_path
        API_URL = api_url
        break
