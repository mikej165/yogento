namespace java com.yogento.api.models.mail.template
namespace py yogento.api.models.mail.template

include "yochimp/models/template/template.thrift"
include "yogento/api/models/mail/template/mail_template_type.thrift"

struct MailTemplate {
    required template.Template mail_chimp_template;
    required mail_template_type.MailTemplateType type;
}
