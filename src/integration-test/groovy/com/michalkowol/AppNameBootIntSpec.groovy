package com.michalkowol

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.ApplicationContext

class AppNameBootIntSpec extends IntegrationSpec {

    @Autowired
    ApplicationContext applicationContext

    def "it should boot application"() {
        expect:
        applicationContext != null
    }
}
