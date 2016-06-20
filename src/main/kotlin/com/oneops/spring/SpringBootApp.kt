@file:JvmName("SpringBootApp")

package com.oneops.spring

import com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.oneops.spring.domain.Scientist
import com.oneops.spring.domain.User
import com.oneops.spring.repository.ScientistRepository
import com.oneops.spring.repository.UserRepository
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Primary
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder

/**
 * Spring boot application.
 *
 * @author Suresh
 */
@SpringBootApplication
open class Application {

    val log = LoggerFactory.getLogger(Application::class.java)

    /**
     * Default Object mapper bean.
     */
    @Bean @Primary
    open fun jsonObjectMapper() = Jackson2ObjectMapperBuilder().modulesToInstall(KotlinModule()).build<ObjectMapper>().apply {
        setSerializationInclusion(NON_NULL)
    }

    @Bean
    open fun init(userRepo: UserRepository, sciRepo: ScientistRepository) = CommandLineRunner {
        log.info("Initializing the SpringBoot app. Args: ${it.joinToString(",")}")
        for (i in 0..18) {
            val surName = surnames.random
            userRepo.save(User(firstName = adjectives.random, lastName = surName))
            sciRepo.save(Scientist(surname = surName))
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

