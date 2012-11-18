namespace java com.yogento.api.models.user
namespace py yogento.api.models.user

include "thryft/util/date_time.thrift"

struct User {
    required date_time.DateTime ctime;
    optional string display_name;
    optional string email;
    required string password;
    required set<string> roles;
    required string username;
}
