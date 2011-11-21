log4j = {
    // Example of changing the log pattern for the default console
    // appender:
    //
    //appenders {
    //    console name:'stdout', layout:pattern(conversionPattern: '%c{2} %m%n')
    //}

    error  'org.codehaus.groovy.grails.web.servlet',  //  controllers
           'org.codehaus.groovy.grails.web.pages', //  GSP
           'org.codehaus.groovy.grails.web.sitemesh', //  layouts
           'org.codehaus.groovy.grails.web.mapping.filter', // URL mapping
           'org.codehaus.groovy.grails.web.mapping', // URL mapping
           'org.codehaus.groovy.grails.commons', // core / classloading
           'org.codehaus.groovy.grails.plugins', // plugins
           'org.codehaus.groovy.grails.orm.hibernate', // hibernate integration
           'org.springframework',
           'org.hibernate',
           'net.sf.ehcache.hibernate'

    warn   'org.mortbay.log'
}

grails.doc.authors = 'Lucas Teixeira'
grails.doc.license = 'Apache License'
grails.doc.title = 'Grails AWS Plugin'

grails {	
	plugin {
		aws {
			credentials {
				//accessKey = "access-key"
				//secretKey = "secret-key"
				properties = "/Users/blanq01/Desktop/AwsCredentials.properties"		
			}
			s3 {
				bucket = "grails-aws-test-bucket-20110515"
				rrs    = true
				acl    = "public"
			}
			ses {
				from     = "lucastex@gmail.com"
				//enabled  = false
			}
		}
	}
}
grails.views.default.codec="none" // none, html, base64
grails.views.gsp.encoding="UTF-8"
