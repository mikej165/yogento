MAGENTO_EXTENSION_VERSION = "1.0.1.0"
MAGENTO_VERSIONS = ('13', '17',)


magento_dir_checks = []
deploy = []
deploy_depends = []
for magento_version in MAGENTO_VERSIONS:
    magento_dir_checks.append("""\
    <!-- Magento version %(magento_version)s -->
    <property name="magento%(magento_version)s_dir_path" value="C:/Users/minor/projects/xampplite-1.7.0/htdocs/magento%(magento_version)s" />
    <target name="magento%(magento_version)s_dir.check">
        <condition property="magento%(magento_version)s_dir.exists">
            <available file="${magento%(magento_version)s_dir_path}" type="dir" />
        </condition>
    </target>
    <target name="magento%(magento_version)s_dir.check_failed" depends="magento%(magento_version)s_dir.check" unless="magento%(magento_version)s_dir.exists">
        <echo>${magento%(magento_version)s_dir_path} missing"</echo>
    </target>    
""" % locals())
    deploy.append("""\
        <!-- Magento version %(magento_version)s -->
        <delete dir="${magento%(magento_version)s_dir_path}/app/code/community/Yogento">
        </delete>
        <copy todir="${magento%(magento_version)s_dir_path}/app/code/community/Yogento">
            <fileset dir="app/code/community/Yogento">
            </fileset>
        </copy>
        
        <delete file="${magento%(magento_version)s_dir_path}/app/code/community/Yogento/Yoagent/sql/yoagent_setup/mysql4-install-%(MAGENTO_EXTENSION_VERSION)s.php">
        </delete>
        <copy tofile="${magento%(magento_version)s_dir_path}/app/code/community/Yogento/Yoagent/sql/yoagent_setup/mysql4-install-%(MAGENTO_EXTENSION_VERSION)s.php">
            <fileset file="app/code/community/Yogento/Yoagent/sql/yoagent_setup/install-%(MAGENTO_EXTENSION_VERSION)s.php">
            </fileset>
        </copy>
        
        <delete file="${magento%(magento_version)s_dir_path}/app/etc/modules/Yogento_Yoagent.xml">
        </delete>
        <copy tofile="${magento%(magento_version)s_dir_path}/app/etc/modules/Yogento_Yoagent.xml">
            <fileset file="app/etc/modules/Yogento_Yoagent.xml">
            </fileset>
        </copy>""" % locals())
    deploy_depends.append("magento%(magento_version)s_dir.check" % locals())
magento_dir_checks = "\n".join(magento_dir_checks)
deploy = "\n".join(deploy)
deploy_depends = ','.join(deploy_depends)

build_xml = """\
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE project>
<project name="yogento-php-agent" default="deploy" basedir=".">
%(magento_dir_checks)s
    <target name="deploy" depends="%(deploy_depends)s">
%(deploy)s
    </target>
</project>
""" % locals()

print build_xml
