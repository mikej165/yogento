from yogento.client.utils import get_logger
import logging
import urllib2


class _MagentoXmlrpcServiceTest(object):
    API_NETINFO = 'magento16.localdomain'
    API_PASSWORD = 'yogento'
    API_PATH = '/magento/index.php/api/'
    API_USERNAME = 'yogento'
    API_URL = "http://%(API_USERNAME)s:%(API_PASSWORD)s@%(API_NETINFO)s%(API_PATH)s" % locals()

    @classmethod
    def canRunTest(cls):
        try:
            urllib2.urlopen('http://' + cls.API_NETINFO).read()
        except urllib2.HTTPError:
            return True
        except:
            get_logger(cls).debug("canRunTest:", exc_info=True)
            # Enable xmlrpclib verbose logging
            logging.getLogger().setLevel(logging.DEBUG)
            return False
