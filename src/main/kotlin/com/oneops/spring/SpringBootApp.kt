@file:JvmName("SpringBootApp")

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


import com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.oneops.spring.domain.User
import com.oneops.spring.repository.UserRepository
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder

/**
 * Spring boot application.
 *
 * @author Suresh
 */
@SpringBootApplication
open class Application {

    val log = LoggerFactory.getLogger(Application::class.java)

    @Bean
    open fun objectMapper() = Jackson2ObjectMapperBuilder().modulesToInstall(KotlinModule()).build<ObjectMapper>().apply {
        setSerializationInclusion(NON_NULL)
    }

    @Bean
    open fun init(repo: UserRepository) = CommandLineRunner {
        log.info("Initializing the SpringBoot app. Args: ${it.joinToString(",")}")
        for (i in 0..18) {
            repo.save(User(firstName = adjectives.random, lastName = surnames.random))
        }
        log.info("User creation completed!")
    }
}

/**
 * Bootstrap the Application.
 */
fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}

