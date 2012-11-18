namespace java com.yogento.api.models.mail.template
namespace py yogento.api.models.mail.template

include "yochimp/models/template/template_type.thrift"

struct MailTemplateType {
    required template_type.TemplateType mail_chimp_template_type;
}
