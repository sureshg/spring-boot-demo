package com.oneops.spring.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType.AUTO
import javax.persistence.Id

/**
 * User entity class
 *
 * @author Suresh
 */
@Entity
data class User(
        @Id @GeneratedValue(strategy = AUTO)
        var id: Long = 0,
        var firstName: String = "",
        var lastName: String = "")
