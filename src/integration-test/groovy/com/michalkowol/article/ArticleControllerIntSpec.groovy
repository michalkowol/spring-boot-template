package com.michalkowol.article

import com.michalkowol.IntegrationSpec
import com.michalkowol.demodata.ArticleFixtures
import org.springframework.test.web.servlet.ResultActions
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders

import static net.javacrumbs.jsonunit.spring.JsonUnitResultMatchers.json
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

class ArticleControllerIntSpec extends IntegrationSpec {

    def "should return article"() {
        given:
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders
                .get("/articles")
                .accept(APPLICATION_JSON_VALUE)

        when:
        ResultActions result = mvc.perform(request)

        then:
        List<Map<String, ?>> expectedResult = [
                [
                        id   : ArticleFixtures.FOO.id.toString(),
                        title: ArticleFixtures.FOO.title
                ],
                [
                        id   : ArticleFixtures.BAR.id.toString(),
                        title: ArticleFixtures.BAR.title
                ]
        ]
        result
                .andExpect(status().isOk())
                .andExpect(json().isEqualTo(expectedResult))
    }
}
