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

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 * User rest controller.
 *
 * @author Suresh
 */
@RestController
class UserController {

    @Autowired
    lateinit var repo: UserRepository

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
