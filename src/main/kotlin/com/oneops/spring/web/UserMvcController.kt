package com.oneops.spring.web

import com.oneops.spring.repository.UserRepository
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

/**
 * User MVC controller.
 *
 * @author Suresh
 */
@Controller
@RequestMapping("/mvc")
class UserMvcController @Autowired constructor(val repo: UserRepository) {

    val log = LoggerFactory.getLogger(UserMvcController::class.java)

    @RequestMapping("users")
    fun users(@RequestParam(name = "filter", required = false, defaultValue = "") filter: String, model: Model) = let {
        log.info("Getting all users, filter: $filter")
        val users = repo.findAll().filter { it.lastName.startsWith(filter) }
        model.addAttribute("users", users)
        "users"
    }
}
