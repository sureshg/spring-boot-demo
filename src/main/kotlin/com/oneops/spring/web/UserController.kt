package com.oneops.spring.web

import com.oneops.spring.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 * User rest controller.
 *
 * @author Suresh
 */
@RestController
class UserController @Autowired constructor(val repo: UserRepository) {

    @RequestMapping("/", method = arrayOf(RequestMethod.GET))
    fun findAll() = repo.findAll()

    @RequestMapping("/count")
    fun count() = mapOf("count" to repo.count())

    @RequestMapping("/first/{name}")
    fun findByFirstName(@PathVariable name: String) = repo.findByFirstName(name)

    @RequestMapping("/last/{name}")
    fun findByLastName(@PathVariable name: String) = repo.findByLastName(name)

    @RequestMapping("/last")
    fun findByName(@RequestParam() name: String) = repo.findByLastName(name)
}
