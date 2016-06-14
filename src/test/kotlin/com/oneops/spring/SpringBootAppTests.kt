/**
 * Copyright 2015 Walmart, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.oneops.spring

import com.fasterxml.jackson.databind.ObjectMapper
import com.oneops.spring.repository.UserRepository
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.web.context.WebApplicationContext

/**
 * Spring boot application test
 *
 * @author Suresh
 */
@RunWith(SpringRunner::class)
@SpringBootTest
class SpringBootAppTests {

    /**
     * Logger instance
     */
    companion object {
        val log = LoggerFactory.getLogger(SpringBootAppTests::class.java)
    }

    @Autowired
    lateinit var mapper: ObjectMapper

    @Autowired
    lateinit var context: WebApplicationContext

    @Autowired
    lateinit var userRepo: UserRepository

    @Before
    fun setup() {
        log.info("***** Test setup *****")
    }

    @Test
    fun contextLoads() {
    }

    @After
    fun teardown() {
        log.info("***** Test Teardown *****")
    }
}
