grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"

grails.project.dependency.resolution = {

    inherits("global") {
    }

    log "warn" 

    repositories {	
		mavenCentral()
		grailsPlugins()
        grailsHome()
        grailsCentral()
    }

	dependencies {
        build 'org.apache.httpcomponents:httpclient:4.1.2'
        compile 'net.java.dev.jets3t:jets3t:0.8.1'
		compile 'com.amazonaws:aws-java-sdk:1.2.12', {
            excludes 'stax-api'
        }
     }

	plugins {

		build(":tomcat:$grailsVersion", ':release:1.0.0.RC3') {
            export = false
        }
        
	}
}
