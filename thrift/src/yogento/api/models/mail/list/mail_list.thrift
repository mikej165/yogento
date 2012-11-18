namespace java com.yogento.api.models.mail.list
namespace py yogento.api.models.mail.list

include "yochimp/models/list/list.thrift"

struct MailList {
    required list.List mail_chimp_list;
}
