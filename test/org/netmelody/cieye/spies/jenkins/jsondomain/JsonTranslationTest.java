package org.netmelody.cieye.spies.jenkins.jsondomain;

import org.junit.Test;

import com.google.gson.Gson;

public final class JsonTranslationTest {

    @Test public void
    translatesSomeRealisticJson() {
        String json = "{\"assignedLabels\":[{}],\"mode\":\"NORMAL\",\"nodeDescription\":\"the master Jenkins node\",\"nodeName\":\"\",\"numExecutors\":2,\"description\":null,\"jobs\":[{\"name\":\"gerrit_master\",\"url\":\"http://ci.jenkins-ci.org/job/gerrit_master/\",\"color\":\"blue\"},{\"name\":\"hudson_main_matrix\",\"url\":\"http://ci.jenkins-ci.org/job/hudson_main_matrix/\",\"color\":\"disabled\"},{\"name\":\"hudson_metrics_wip\",\"url\":\"http://ci.jenkins-ci.org/job/hudson_metrics_wip/\",\"color\":\"disabled\"},{\"name\":\"infa_release.rss\",\"url\":\"http://ci.jenkins-ci.org/job/infa_release.rss/\",\"color\":\"blue\"},{\"name\":\"infra_changelog_refresh\",\"url\":\"http://ci.jenkins-ci.org/job/infra_changelog_refresh/\",\"color\":\"blue\"},{\"name\":\"infra_drupalcron\",\"url\":\"http://ci.jenkins-ci.org/job/infra_drupalcron/\",\"color\":\"blue\"},{\"name\":\"infra_github_repository_list\",\"url\":\"http://ci.jenkins-ci.org/job/infra_github_repository_list/\",\"color\":\"blue\"},{\"name\":\"infra_jenkins-ci.org_webcontents\",\"url\":\"http://ci.jenkins-ci.org/job/infra_jenkins-ci.org_webcontents/\",\"color\":\"blue\"},{\"name\":\"infra_main_svn_to_git\",\"url\":\"http://ci.jenkins-ci.org/job/infra_main_svn_to_git/\",\"color\":\"disabled\"},{\"name\":\"infra_mirroring\",\"url\":\"http://ci.jenkins-ci.org/job/infra_mirroring/\",\"color\":\"blue\"},{\"name\":\"infra_plugin-compat-tester\",\"url\":\"http://ci.jenkins-ci.org/job/infra_plugin-compat-tester/\",\"color\":\"yellow\"},{\"name\":\"infra_plugin_changes_report\",\"url\":\"http://ci.jenkins-ci.org/job/infra_plugin_changes_report/\",\"color\":\"blue\"},{\"name\":\"infra_pluginmirror\",\"url\":\"http://ci.jenkins-ci.org/job/infra_pluginmirror/\",\"color\":\"blue\"},{\"name\":\"infra_plugins_svn_to_git\",\"url\":\"http://ci.jenkins-ci.org/job/infra_plugins_svn_to_git/\",\"color\":\"disabled\"},{\"name\":\"infra_pull_m2repo\",\"url\":\"http://ci.jenkins-ci.org/job/infra_pull_m2repo/\",\"color\":\"aborted\"},{\"name\":\"infra_pull_releases\",\"url\":\"http://ci.jenkins-ci.org/job/infra_pull_releases/\",\"color\":\"disabled\"},{\"name\":\"infra_svnsync\",\"url\":\"http://ci.jenkins-ci.org/job/infra_svnsync/\",\"color\":\"disabled\"},{\"name\":\"infra_update_center\",\"url\":\"http://ci.jenkins-ci.org/job/infra_update_center/\",\"color\":\"blue\"},{\"name\":\"infra_update_center_legacy\",\"url\":\"http://ci.jenkins-ci.org/job/infra_update_center_legacy/\",\"color\":\"disabled\"},{\"name\":\"infra_update_center_mirror\",\"url\":\"http://ci.jenkins-ci.org/job/infra_update_center_mirror/\",\"color\":\"red\"},{\"name\":\"infra_update_center_stable\",\"url\":\"http://ci.jenkins-ci.org/job/infra_update_center_stable/\",\"color\":\"blue\"},{\"name\":\"jenkins_lts_branch\",\"url\":\"http://ci.jenkins-ci.org/job/jenkins_lts_branch/\",\"color\":\"blue\"},{\"name\":\"jenkins_main_trunk\",\"url\":\"http://ci.jenkins-ci.org/job/jenkins_main_trunk/\",\"color\":\"blue\"},{\"name\":\"jenkins_pom\",\"url\":\"http://ci.jenkins-ci.org/job/jenkins_pom/\",\"color\":\"blue\"},{\"name\":\"jenkins_rc_branch\",\"url\":\"http://ci.jenkins-ci.org/job/jenkins_rc_branch/\",\"color\":\"blue\"},{\"name\":\"junit-runtime-suite\",\"url\":\"http://ci.jenkins-ci.org/job/junit-runtime-suite/\",\"color\":\"red\"},{\"name\":\"lib-jenkins-maven-artifact-manager\",\"url\":\"http://ci.jenkins-ci.org/job/lib-jenkins-maven-artifact-manager/\",\"color\":\"blue\"},{\"name\":\"lib-jenkins-maven-embedder\",\"url\":\"http://ci.jenkins-ci.org/job/lib-jenkins-maven-embedder/\",\"color\":\"blue\"},{\"name\":\"lib-jira-api\",\"url\":\"http://ci.jenkins-ci.org/job/lib-jira-api/\",\"color\":\"blue\"},{\"name\":\"libs_core-js\",\"url\":\"http://ci.jenkins-ci.org/job/libs_core-js/\",\"color\":\"blue\"},{\"name\":\"libs_dom4j\",\"url\":\"http://ci.jenkins-ci.org/job/libs_dom4j/\",\"color\":\"blue\"},{\"name\":\"libs_htmlunit\",\"url\":\"http://ci.jenkins-ci.org/job/libs_htmlunit/\",\"color\":\"aborted\"},{\"name\":\"libs_jelly\",\"url\":\"http://ci.jenkins-ci.org/job/libs_jelly/\",\"color\":\"blue\"},{\"name\":\"libs_jexl\",\"url\":\"http://ci.jenkins-ci.org/job/libs_jexl/\",\"color\":\"blue\"},{\"name\":\"libs_jmdns\",\"url\":\"http://ci.jenkins-ci.org/job/libs_jmdns/\",\"color\":\"blue\"},{\"name\":\"libs_json-lib\",\"url\":\"http://ci.jenkins-ci.org/job/libs_json-lib/\",\"color\":\"red\"},{\"name\":\"libs_maven-jetty-plugin\",\"url\":\"http://ci.jenkins-ci.org/job/libs_maven-jetty-plugin/\",\"color\":\"blue\"},{\"name\":\"libs_netx\",\"url\":\"http://ci.jenkins-ci.org/job/libs_netx/\",\"color\":\"blue\"},{\"name\":\"libs_svnkit\",\"url\":\"http://ci.jenkins-ci.org/job/libs_svnkit/\",\"color\":\"red\"},{\"name\":\"libs_trilead-ssh2\",\"url\":\"http://ci.jenkins-ci.org/job/libs_trilead-ssh2/\",\"color\":\"blue\"},{\"name\":\"libs_winstone\",\"url\":\"http://ci.jenkins-ci.org/job/libs_winstone/\",\"color\":\"red\"},{\"name\":\"libs_xstream\",\"url\":\"http://ci.jenkins-ci.org/job/libs_xstream/\",\"color\":\"yellow\"},{\"name\":\"maven-interceptors\",\"url\":\"http://ci.jenkins-ci.org/job/maven-interceptors/\",\"color\":\"blue\"},{\"name\":\"plugin-compat-tester\",\"url\":\"http://ci.jenkins-ci.org/job/plugin-compat-tester/\",\"color\":\"blue\"},{\"name\":\"plugin_selenium\",\"url\":\"http://ci.jenkins-ci.org/job/plugin_selenium/\",\"color\":\"yellow\"},{\"name\":\"plugins_accurev\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_accurev/\",\"color\":\"blue\"},{\"name\":\"plugins_active-directory\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_active-directory/\",\"color\":\"blue\"},{\"name\":\"plugins_analysis-collector\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_analysis-collector/\",\"color\":\"blue\"},{\"name\":\"plugins_analysis-core\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_analysis-core/\",\"color\":\"blue\"},{\"name\":\"plugins_analysis-pom\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_analysis-pom/\",\"color\":\"blue\"},{\"name\":\"plugins_analysis-test\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_analysis-test/\",\"color\":\"blue\"},{\"name\":\"plugins_audit-trail\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_audit-trail/\",\"color\":\"blue\"},{\"name\":\"plugins_backlog\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_backlog/\",\"color\":\"blue\"},{\"name\":\"plugins_backup\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_backup/\",\"color\":\"blue\"},{\"name\":\"plugins_batch-task\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_batch-task/\",\"color\":\"yellow\"},{\"name\":\"plugins_bazaar\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_bazaar/\",\"color\":\"blue\"},{\"name\":\"plugins_bitkeeper\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_bitkeeper/\",\"color\":\"blue\"},{\"name\":\"plugins_bugzilla\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_bugzilla/\",\"color\":\"blue\"},{\"name\":\"plugins_build-publisher\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_build-publisher/\",\"color\":\"blue\"},{\"name\":\"plugins_build-timeout\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_build-timeout/\",\"color\":\"blue\"},{\"name\":\"plugins_bulk-builder\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_bulk-builder/\",\"color\":\"blue\"},{\"name\":\"plugins_ccm\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_ccm/\",\"color\":\"blue\"},{\"name\":\"plugins_changelog-history\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_changelog-history/\",\"color\":\"yellow\"},{\"name\":\"plugins_checkstyle\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_checkstyle/\",\"color\":\"blue\"},{\"name\":\"plugins_chucknorris\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_chucknorris/\",\"color\":\"blue\"},{\"name\":\"plugins_ci-game\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_ci-game/\",\"color\":\"blue\"},{\"name\":\"plugins_cifs\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_cifs/\",\"color\":\"blue\"},{\"name\":\"plugins_claim\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_claim/\",\"color\":\"blue\"},{\"name\":\"plugins_clearcase\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_clearcase/\",\"color\":\"blue\"},{\"name\":\"plugins_cloudbees-deployer-plugin\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_cloudbees-deployer-plugin/\",\"color\":\"blue\"},{\"name\":\"plugins_clover\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_clover/\",\"color\":\"blue\"},{\"name\":\"plugins_cloverphp\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_cloverphp/\",\"color\":\"blue\"},{\"name\":\"plugins_cmakebuilder\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_cmakebuilder/\",\"color\":\"blue\"},{\"name\":\"plugins_cmvc\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_cmvc/\",\"color\":\"blue\"},{\"name\":\"plugins_cobertura\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_cobertura/\",\"color\":\"blue\"},{\"name\":\"plugins_codeplex\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_codeplex/\",\"color\":\"blue\"},{\"name\":\"plugins_collabnet\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_collabnet/\",\"color\":\"yellow\"},{\"name\":\"plugins_collapsing-console-sections\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_collapsing-console-sections/\",\"color\":\"blue\"},{\"name\":\"plugins_config-autorefresh\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_config-autorefresh/\",\"color\":\"blue\"},{\"name\":\"plugins_console-column\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_console-column/\",\"color\":\"blue\"},{\"name\":\"plugins_copyartifact\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_copyartifact/\",\"color\":\"blue\"},{\"name\":\"plugins_cppunit\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_cppunit/\",\"color\":\"blue\"},{\"name\":\"plugins_crap4j\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_crap4j/\",\"color\":\"blue\"},{\"name\":\"plugins_crowd\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_crowd/\",\"color\":\"blue\"},{\"name\":\"plugins_cvs-tag\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_cvs-tag/\",\"color\":\"disabled\"},{\"name\":\"plugins_cygpath\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_cygpath/\",\"color\":\"blue\"},{\"name\":\"plugins_dashboard-view\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_dashboard-view/\",\"color\":\"blue\"},{\"name\":\"plugins_deploy\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_deploy/\",\"color\":\"blue\"},{\"name\":\"plugins_description-setter\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_description-setter/\",\"color\":\"blue\"},{\"name\":\"plugins_disk-usage\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_disk-usage/\",\"color\":\"blue\"},{\"name\":\"plugins_doclinks\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_doclinks/\",\"color\":\"blue\"},{\"name\":\"plugins_downstream-buildview\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_downstream-buildview/\",\"color\":\"blue\"},{\"name\":\"plugins_downstream-ext\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_downstream-ext/\",\"color\":\"blue\"},{\"name\":\"plugins_dropdown-viewstabbar\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_dropdown-viewstabbar/\",\"color\":\"blue\"},{\"name\":\"plugins_dry\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_dry/\",\"color\":\"blue\"},{\"name\":\"plugins_dtkit-default\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_dtkit-default/\",\"color\":\"blue\"},{\"name\":\"plugins_dtkit-frmk\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_dtkit-frmk/\",\"color\":\"blue\"},{\"name\":\"plugins_dtkit-plugins\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_dtkit-plugins/\",\"color\":\"blue\"},{\"name\":\"plugins_dumpinfo-buildwrapper\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_dumpinfo-buildwrapper/\",\"color\":\"blue\"},{\"name\":\"plugins_easyant\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_easyant/\",\"color\":\"blue\"},{\"name\":\"plugins_ec2\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_ec2/\",\"color\":\"blue\"},{\"name\":\"plugins_email-ext\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_email-ext/\",\"color\":\"blue\"},{\"name\":\"plugins_emma\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_emma/\",\"color\":\"blue\"},{\"name\":\"plugins_emotional-hudson\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_emotional-hudson/\",\"color\":\"blue\"},{\"name\":\"plugins_envfile\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_envfile/\",\"color\":\"blue\"},{\"name\":\"plugins_exclusive-execution\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_exclusive-execution/\",\"color\":\"blue\"},{\"name\":\"plugins_extended-read-permission\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_extended-read-permission/\",\"color\":\"blue\"},{\"name\":\"plugins_extra-columns\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_extra-columns/\",\"color\":\"blue\"},{\"name\":\"plugins_favorite\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_favorite/\",\"color\":\"blue\"},{\"name\":\"plugins_findbugs\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_findbugs/\",\"color\":\"blue\"},{\"name\":\"plugins_flashlog\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_flashlog/\",\"color\":\"blue\"},{\"name\":\"plugins_gallio\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_gallio/\",\"color\":\"blue\"},{\"name\":\"plugins_gant\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_gant/\",\"color\":\"blue\"},{\"name\":\"plugins_gcal\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_gcal/\",\"color\":\"blue\"},{\"name\":\"plugins_gerrit-trigger-plugin\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_gerrit-trigger-plugin/\",\"color\":\"blue\"},{\"name\":\"plugins_git-plugin\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_git-plugin/\",\"color\":\"yellow\"},{\"name\":\"plugins_global-build-stats\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_global-build-stats/\",\"color\":\"blue\"},{\"name\":\"plugins_googleanalytics\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_googleanalytics/\",\"color\":\"blue\"},{\"name\":\"plugins_googlecode\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_googlecode/\",\"color\":\"blue\"},{\"name\":\"plugins_gradle\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_gradle/\",\"color\":\"blue\"},{\"name\":\"plugins_grails\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_grails/\",\"color\":\"blue\"},{\"name\":\"plugins_greenballs\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_greenballs/\",\"color\":\"blue\"},{\"name\":\"plugins_grinder\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_grinder/\",\"color\":\"blue\"},{\"name\":\"plugins_groovy\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_groovy/\",\"color\":\"blue\"},{\"name\":\"plugins_hadoop\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_hadoop/\",\"color\":\"blue\"},{\"name\":\"plugins_harvest\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_harvest/\",\"color\":\"blue\"},{\"name\":\"plugins_hello-world\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_hello-world/\",\"color\":\"blue\"},{\"name\":\"plugins_htmlpublisher\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_htmlpublisher/\",\"color\":\"blue\"},{\"name\":\"plugins_hudsontrayapp\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_hudsontrayapp/\",\"color\":\"blue\"},{\"name\":\"plugins_instant-messaging\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_instant-messaging/\",\"color\":\"blue\"},{\"name\":\"plugins_instant-messaging-parent\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_instant-messaging-parent/\",\"color\":\"blue\"},{\"name\":\"plugins_ircbot\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_ircbot/\",\"color\":\"blue\"},{\"name\":\"plugins_ivy\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_ivy/\",\"color\":\"blue\"},{\"name\":\"plugins_jabber\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_jabber/\",\"color\":\"blue\"},{\"name\":\"plugins_japex\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_japex/\",\"color\":\"blue\"},{\"name\":\"plugins_javancss\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_javancss/\",\"color\":\"blue\"},{\"name\":\"plugins_javanet\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_javanet/\",\"color\":\"blue\"},{\"name\":\"plugins_javanet-trigger-installer\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_javanet-trigger-installer/\",\"color\":\"blue\"},{\"name\":\"plugins_javanet-uploader\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_javanet-uploader/\",\"color\":\"blue\"},{\"name\":\"plugins_javatest-report\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_javatest-report/\",\"color\":\"blue\"},{\"name\":\"plugins_jigomerge\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_jigomerge/\",\"color\":\"blue\"},{\"name\":\"plugins_jira\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_jira/\",\"color\":\"blue\"},{\"name\":\"plugins_jmx\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_jmx/\",\"color\":\"blue\"},{\"name\":\"plugins_jobConfigHistory\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_jobConfigHistory/\",\"color\":\"red\"},{\"name\":\"plugins_join\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_join/\",\"color\":\"blue\"},{\"name\":\"plugins_jprt\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_jprt/\",\"color\":\"blue\"},{\"name\":\"plugins_jsunit\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_jsunit/\",\"color\":\"blue\"},{\"name\":\"plugins_jswidgets\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_jswidgets/\",\"color\":\"yellow\"},{\"name\":\"plugins_jwsdp-sqe\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_jwsdp-sqe/\",\"color\":\"blue\"},{\"name\":\"plugins_kagemai\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_kagemai/\",\"color\":\"blue\"},{\"name\":\"plugins_labmanager\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_labmanager/\",\"color\":\"blue\"},{\"name\":\"plugins_lastfailureversioncolumn\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_lastfailureversioncolumn/\",\"color\":\"blue\"},{\"name\":\"plugins_lastsuccessversioncolumn\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_lastsuccessversioncolumn/\",\"color\":\"blue\"},{\"name\":\"plugins_locked-files-report\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_locked-files-report/\",\"color\":\"blue\"},{\"name\":\"plugins_locks-and-latches\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_locks-and-latches/\",\"color\":\"blue\"},{\"name\":\"plugins_m2release\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_m2release/\",\"color\":\"blue\"},{\"name\":\"plugins_mantis\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_mantis/\",\"color\":\"blue\"},{\"name\":\"plugins_maven-deployment-linker\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_maven-deployment-linker/\",\"color\":\"blue\"},{\"name\":\"plugins_maven-repo-cleaner\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_maven-repo-cleaner/\",\"color\":\"blue\"},{\"name\":\"plugins_maven1-snapshot-plugin\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_maven1-snapshot-plugin/\",\"color\":\"blue\"},{\"name\":\"plugins_measurement-plots\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_measurement-plots/\",\"color\":\"blue\"},{\"name\":\"plugins_mercurial\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_mercurial/\",\"color\":\"blue\"},{\"name\":\"plugins_mibsr\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_mibsr/\",\"color\":\"blue\"},{\"name\":\"plugins_msbuild\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_msbuild/\",\"color\":\"blue\"},{\"name\":\"plugins_mstest\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_mstest/\",\"color\":\"blue\"},{\"name\":\"plugins_mysql-auth\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_mysql-auth/\",\"color\":\"blue\"},{\"name\":\"plugins_naginator\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_naginator/\",\"color\":\"blue\"},{\"name\":\"plugins_nant\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_nant/\",\"color\":\"blue\"},{\"name\":\"plugins_nested-view\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_nested-view/\",\"color\":\"blue\"},{\"name\":\"plugins_network-monitor\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_network-monitor/\",\"color\":\"blue\"},{\"name\":\"plugins_next-build-number\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_next-build-number/\",\"color\":\"blue\"},{\"name\":\"plugins_notification\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_notification/\",\"color\":\"blue\"},{\"name\":\"plugins_notifo\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_notifo/\",\"color\":\"blue\"},{\"name\":\"plugins_nunit\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_nunit/\",\"color\":\"blue\"},{\"name\":\"plugins_parameterized-trigger\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_parameterized-trigger/\",\"color\":\"blue\"},{\"name\":\"plugins_perforce\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_perforce/\",\"color\":\"blue\"},{\"name\":\"plugins_performance\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_performance/\",\"color\":\"blue\"},{\"name\":\"plugins_persona\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_persona/\",\"color\":\"blue\"},{\"name\":\"plugins_phing\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_phing/\",\"color\":\"blue\"},{\"name\":\"plugins_platformlabeler\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_platformlabeler/\",\"color\":\"blue\"},{\"name\":\"plugins_plot\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_plot/\",\"color\":\"blue\"},{\"name\":\"plugins_pmd\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_pmd/\",\"color\":\"blue\"},{\"name\":\"plugins_polarion\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_polarion/\",\"color\":\"blue\"},{\"name\":\"plugins_port-allocator\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_port-allocator/\",\"color\":\"blue\"},{\"name\":\"plugins_powershell\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_powershell/\",\"color\":\"yellow\"},{\"name\":\"plugins_priority-sorter\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_priority-sorter/\",\"color\":\"blue\"},{\"name\":\"plugins_project-stats\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_project-stats/\",\"color\":\"blue\"},{\"name\":\"plugins_promoted-builds\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_promoted-builds/\",\"color\":\"blue\"},{\"name\":\"plugins_promoted-builds-simple\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_promoted-builds-simple/\",\"color\":\"blue\"},{\"name\":\"plugins_publish-over-cifs-plugin\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_publish-over-cifs-plugin/\",\"color\":\"aborted\"},{\"name\":\"plugins_publish-over-ftp-plugin\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_publish-over-ftp-plugin/\",\"color\":\"red\"},{\"name\":\"plugins_publish-over-parent\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_publish-over-parent/\",\"color\":\"aborted\"},{\"name\":\"plugins_publish-over-ssh-plugin\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_publish-over-ssh-plugin/\",\"color\":\"red\"},{\"name\":\"plugins_pucm\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_pucm/\",\"color\":\"blue\"},{\"name\":\"plugins_pvcs_scm\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_pvcs_scm/\",\"color\":\"blue\"},{\"name\":\"plugins_pview\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_pview/\",\"color\":\"blue\"},{\"name\":\"plugins_pxe\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_pxe/\",\"color\":\"blue\"},{\"name\":\"plugins_qmakebuilder\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_qmakebuilder/\",\"color\":\"blue\"},{\"name\":\"plugins_rake\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_rake/\",\"color\":\"yellow\"},{\"name\":\"plugins_redmine\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_redmine/\",\"color\":\"blue\"},{\"name\":\"plugins_release\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_release/\",\"color\":\"blue\"},{\"name\":\"plugins_repository-connector\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_repository-connector/\",\"color\":\"blue\"},{\"name\":\"plugins_rotatews\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_rotatews/\",\"color\":\"blue\"},{\"name\":\"plugins_ruby\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_ruby/\",\"color\":\"blue\"},{\"name\":\"plugins_rubyMetrics\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_rubyMetrics/\",\"color\":\"blue\"},{\"name\":\"plugins_saferestart\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_saferestart/\",\"color\":\"blue\"},{\"name\":\"plugins_sametime\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_sametime/\",\"color\":\"blue\"},{\"name\":\"plugins_sbt\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_sbt/\",\"color\":\"blue\"},{\"name\":\"plugins_schedule-failed-builds\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_schedule-failed-builds/\",\"color\":\"blue\"},{\"name\":\"plugins_scm-sync-configuration\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_scm-sync-configuration/\",\"color\":\"blue\"},{\"name\":\"plugins_scons\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_scons/\",\"color\":\"blue\"},{\"name\":\"plugins_scp\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_scp/\",\"color\":\"blue\"},{\"name\":\"plugins_script-realm\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_script-realm/\",\"color\":\"blue\"},{\"name\":\"plugins_scriptler\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_scriptler/\",\"color\":\"blue\"},{\"name\":\"plugins_secret\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_secret/\",\"color\":\"blue\"},{\"name\":\"plugins_sectioned-view\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_sectioned-view/\",\"color\":\"blue\"},{\"name\":\"plugins_seleniumhq\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_seleniumhq/\",\"color\":\"blue\"},{\"name\":\"plugins_seleniumhtmlreport\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_seleniumhtmlreport/\",\"color\":\"blue\"},{\"name\":\"plugins_setenv\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_setenv/\",\"color\":\"blue\"},{\"name\":\"plugins_sfee\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_sfee/\",\"color\":\"blue\"},{\"name\":\"plugins_sicci-for-xcode\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_sicci-for-xcode/\",\"color\":\"blue\"},{\"name\":\"plugins_sidebar-link\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_sidebar-link/\",\"color\":\"blue\"},{\"name\":\"plugins_sloccount\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_sloccount/\",\"color\":\"blue\"},{\"name\":\"plugins_sonar\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_sonar/\",\"color\":\"blue\"},{\"name\":\"plugins_sourcemonitor\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_sourcemonitor/\",\"color\":\"blue\"},{\"name\":\"plugins_ssh\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_ssh/\",\"color\":\"blue\"},{\"name\":\"plugins_ssh-slaves\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_ssh-slaves/\",\"color\":\"blue\"},{\"name\":\"plugins_subversion\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_subversion/\",\"color\":\"blue\"},{\"name\":\"plugins_svn-tag\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_svn-tag/\",\"color\":\"blue\"},{\"name\":\"plugins_svncompat14\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_svncompat14/\",\"color\":\"blue\"},{\"name\":\"plugins_swarm\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_swarm/\",\"color\":\"blue\"},{\"name\":\"plugins_tasks\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_tasks/\",\"color\":\"blue\"},{\"name\":\"plugins_testabilityexplorer\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_testabilityexplorer/\",\"color\":\"blue\"},{\"name\":\"plugins_testlink\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_testlink/\",\"color\":\"blue\"},{\"name\":\"plugins_text-finder\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_text-finder/\",\"color\":\"blue\"},{\"name\":\"plugins_tfs\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_tfs/\",\"color\":\"blue\"},{\"name\":\"plugins_throttle-concurrent-builds-plugin\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_throttle-concurrent-builds-plugin/\",\"color\":\"blue\"},{\"name\":\"plugins_token-macro\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_token-macro/\",\"color\":\"blue\"},{\"name\":\"plugins_toolenv\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_toolenv/\",\"color\":\"blue\"},{\"name\":\"plugins_trac\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_trac/\",\"color\":\"blue\"},{\"name\":\"plugins_translation\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_translation/\",\"color\":\"blue\"},{\"name\":\"plugins_twitter\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_twitter/\",\"color\":\"blue\"},{\"name\":\"plugins_unicorn\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_unicorn/\",\"color\":\"blue\"},{\"name\":\"plugins_url-change-trigger\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_url-change-trigger/\",\"color\":\"blue\"},{\"name\":\"plugins_URLSCM\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_URLSCM/\",\"color\":\"blue\"},{\"name\":\"plugins_validating-string-parameter\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_validating-string-parameter/\",\"color\":\"blue\"},{\"name\":\"plugins_viewVC\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_viewVC/\",\"color\":\"blue\"},{\"name\":\"plugins_violations\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_violations/\",\"color\":\"blue\"},{\"name\":\"plugins_virtualbox\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_virtualbox/\",\"color\":\"blue\"},{\"name\":\"plugins_vmware\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_vmware/\",\"color\":\"blue\"},{\"name\":\"plugins_vss\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_vss/\",\"color\":\"blue\"},{\"name\":\"plugins_warnings\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_warnings/\",\"color\":\"blue\"},{\"name\":\"plugins_webtestpresenter\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_webtestpresenter/\",\"color\":\"blue\"},{\"name\":\"plugins_ws7\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_ws7/\",\"color\":\"blue\"},{\"name\":\"plugins_wsclean\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_wsclean/\",\"color\":\"blue\"},{\"name\":\"plugins_xshell\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_xshell/\",\"color\":\"blue\"},{\"name\":\"plugins_xunit\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_xunit/\",\"color\":\"yellow\"},{\"name\":\"plugins_xvnc\",\"url\":\"http://ci.jenkins-ci.org/job/plugins_xvnc/\",\"color\":\"blue\"},{\"name\":\"redis\",\"url\":\"http://ci.jenkins-ci.org/job/redis/\",\"color\":\"grey\"},{\"name\":\"TESTING-HUDSON-7434\",\"url\":\"http://ci.jenkins-ci.org/job/TESTING-HUDSON-7434/\",\"color\":\"red\"},{\"name\":\"tools_maven-hpi-plugin\",\"url\":\"http://ci.jenkins-ci.org/job/tools_maven-hpi-plugin/\",\"color\":\"red\"},{\"name\":\"tools_maven-hpi-plugin-maven-2.x\",\"url\":\"http://ci.jenkins-ci.org/job/tools_maven-hpi-plugin-maven-2.x/\",\"color\":\"red\"}],\"overallLoad\":{},\"primaryView\":{\"name\":\"All\",\"url\":\"http://ci.jenkins-ci.org/\"},\"slaveAgentPort\":47278,\"useCrumbs\":true,\"useSecurity\":true,\"views\":[{\"name\":\"All\",\"url\":\"http://ci.jenkins-ci.org/\"},{\"name\":\"All Failed\",\"url\":\"http://ci.jenkins-ci.org/view/All%20Failed/\"},{\"name\":\"All Unstable\",\"url\":\"http://ci.jenkins-ci.org/view/All%20Unstable/\"},{\"name\":\"Infrastructure\",\"url\":\"http://ci.jenkins-ci.org/view/Infrastructure/\"},{\"name\":\"Jenkins core\",\"url\":\"http://ci.jenkins-ci.org/view/Jenkins%20core/\"},{\"name\":\"Libraries\",\"url\":\"http://ci.jenkins-ci.org/view/Libraries/\"},{\"name\":\"Other Projects\",\"url\":\"http://ci.jenkins-ci.org/view/Other%20Projects/\"},{\"name\":\"Plugins\",\"url\":\"http://ci.jenkins-ci.org/view/Plugins/\"}]}";
        
        new Gson().fromJson(json, Server.class);
    }
}
