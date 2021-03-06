grails.servlet.version = "3.0"
grails.project.work.dir = "target/work"
grails.project.target.level = 1.6
grails.project.source.level = 1.6

grails.project.dependency.resolver = "maven"
grails.project.dependency.resolution = {
    inherits "global"
    log "error"
    checksums true
    legacyResolve false

    repositories {
        inherits true

        grailsPlugins()
        grailsHome()
        mavenLocal()
        grailsCentral()
        mavenCentral()
        mavenRepo "http://repo.grails.org/grails/core"
    }

    dependencies {
        runtime 'mysql:mysql-connector-java:5.1.29'

        compile 'jfree:jfreechart:1.0.4'
        compile 'net.homeip.yusuke:twitter4j:2.0.10'
        compile 'rome:rome:1.0'
        compile 'commons-httpclient:commons-httpclient:3.1'
        compile 'com.google.code.maven-play-plugin.spy:memcached:2.4.2'

        test "org.grails:grails-datastore-test-support:1.0-grails-2.4"
    }

    plugins {
        build ":tomcat:7.0.55"

        compile ":scaffolding:2.1.2"
        compile ':cache:1.1.7'
        compile ":cache-ehcache:1.0.1"

        compile ":asset-pipeline:1.9.9"
        compile ":less-asset-pipeline:1.10.0"
        compile ":quartz:1.0.2"
        compile ":quartz-monitor:1.0"
        compile ":spring-security-core:2.0-RC4"
        compile ":google-chart:0.5.2"
        compile ":mail:1.0.7"
        compile ":runtime-logging:0.4"
        compile ":searchable:0.6.9"
        compile ":iwebkit:0.5"
        compile ":scaffolding:2.1.2"
        compile ":google-analytics:2.3.3"
        compile ":fields:1.4"
        compile ":executor:0.3"

//        runtime ":hibernate4:4.3.5.5"
        runtime ":hibernate:3.6.10.17"
        runtime ":database-migration:1.4.0"
        runtime ":jquery:1.11.1"
        runtime ':twitter-bootstrap:3.2.0.2'
        runtime ':font-awesome-resources:4.2.0.0'
    }
}
