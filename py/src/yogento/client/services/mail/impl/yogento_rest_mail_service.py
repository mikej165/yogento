from datetime import datetime
from itertools import ifilterfalse
from time import mktime
import __builtin__
import thryft.protocol.json_protocol
import thryft.protocol.string_map_protocol
import urllib
import urllib2
import yogento.api.models.mail.campaign.mail_campaign
import yogento.api.models.mail.campaign.mail_campaign_stats
import yogento.api.models.mail.list.mail_list
import yogento.api.models.mail.template.mail_template
import yogento.api.models.mail.template.mail_template_info
import yogento.api.models.mail.template.mail_template_type
import yogento.api.services.mail.mail_service
import yogento.client.services._yogento_rest_service


class YogentoRestMailService(yogento.client.services._yogento_rest_service._YogentoRestService, yogento.api.services.mail.mail_service.MailService):
    def __init__(self, api_url, headers=None):
        api_url = api_url.rstrip('/')
        if not api_url.endswith('/rest/'):
            api_url += '/rest/'
        yogento.client.services._yogento_rest_service._YogentoRestService.__init__(self, api_url=api_url, headers=headers)

    def _delete_mail_campaign(self, **kwds):
        try:
            self._request('DELETE', '/mail/campaign', data=None, query=thryft.protocol.string_map_protocol.StringMapProtocol().writeMixed(dict((key, value) for key, value in kwds.iteritems() if value is not None)).to_string_map())
            return True
        except urllib2.HTTPError, e:
            if e.code == 404:
                return False
            else:
                raise

    def _get_mail_campaign(self, **kwds):
        __return_value = self._request('GET', '/mail/campaign', data=None, query=thryft.protocol.string_map_protocol.StringMapProtocol().writeMixed(dict((key, value) for key, value in kwds.iteritems() if value is not None)).to_string_map())
        iprot = thryft.protocol.json_protocol.JsonProtocol(__return_value)
        return yogento.api.models.mail.campaign.mail_campaign.MailCampaign.read(iprot)

    def _get_mail_campaigns(self, **kwds):
        __return_value = self._request('GET', '/mail/campaigns', data=None, query=thryft.protocol.string_map_protocol.StringMapProtocol().writeMixed(dict((key, value) for key, value in kwds.iteritems() if value is not None)).to_string_map())
        iprot = thryft.protocol.json_protocol.JsonProtocol(__return_value)
        return frozenset([yogento.api.models.mail.campaign.mail_campaign.MailCampaign.read(iprot) for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))

    def _get_mail_campaign_stats(self, cid):
        __return_value = self._request('GET', '/mail/campaign_stats' + urllib.quote(cid, safe=''), data=None, query=None)
        iprot = thryft.protocol.json_protocol.JsonProtocol(__return_value)
        return yogento.api.models.mail.campaign.mail_campaign_stats.MailCampaignStats.read(iprot)

    def _get_mail_lists(self):
        __return_value = self._request('GET', '/mail/lists', data=None, query=None)
        iprot = thryft.protocol.json_protocol.JsonProtocol(__return_value)
        return frozenset([yogento.api.models.mail.list.mail_list.MailList.read(iprot) for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))

    def _get_mail_templates(self, **kwds):
        __return_value = self._request('GET', '/mail/templates', data=None, query=thryft.protocol.string_map_protocol.StringMapProtocol().writeMixed(dict((key, value) for key, value in kwds.iteritems() if value is not None)).to_string_map())
        iprot = thryft.protocol.json_protocol.JsonProtocol(__return_value)
        return frozenset([yogento.api.models.mail.template.mail_template.MailTemplate.read(iprot) for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))

    def _get_mail_template_info(self, **kwds):
        __return_value = self._request('GET', '/mail/template_info', data=None, query=thryft.protocol.string_map_protocol.StringMapProtocol().writeMixed(dict((key, value) for key, value in kwds.iteritems() if value is not None)).to_string_map())
        iprot = thryft.protocol.json_protocol.JsonProtocol(__return_value)
        return yogento.api.models.mail.template.mail_template_info.MailTemplateInfo.read(iprot)

    def _post_mail_campaign(self, **kwds):
        __return_value = self._request('POST', '/mail/campaign', data=str(thryft.protocol.json_protocol.JsonProtocol().writeMixed(dict((key, value) for key, value in kwds.iteritems() if value is not None))), query=None)
        iprot = thryft.protocol.json_protocol.JsonProtocol(__return_value)
        return yogento.api.models.mail.campaign.mail_campaign.MailCampaign.read(iprot)

    def _put_mail_campaign(self, **kwds):
        __return_value = self._request('PUT', '/mail/campaign', data=str(thryft.protocol.json_protocol.JsonProtocol().writeMixed(dict((key, value) for key, value in kwds.iteritems() if value is not None))), query=None)
        iprot = thryft.protocol.json_protocol.JsonProtocol(__return_value)
        return yogento.api.models.mail.campaign.mail_campaign.MailCampaign.read(iprot)

