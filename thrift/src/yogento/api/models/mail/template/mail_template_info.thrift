namespace java com.yogento.api.models.mail.template
namespace * yogento.api.models.mail.template

include "yochimp/models/template/template_info.thrift"

struct MailTemplateInfo {
    required template_info.TemplateInfo mail_chimp_template_info;
}
