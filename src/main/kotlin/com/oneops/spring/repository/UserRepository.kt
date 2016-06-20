package com.oneops.spring.repository

import com.oneops.spring.domain.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

/**
 * User Spring Data repository.
 *
 * @author Suresh
 */
interface UserRepository : JpaRepository<User, Long> {

    fun findByFirstName(firstName: String): List<User>

    fun findByLastName(lastName: String): List<User>

    @Query("from User where first_name = :firstName")
    fun findByNameCustomQuery(@Param("firstName") firstName: String): List<User>
}
