package com.oneops.spring.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

/**
 * Scientist entity class
 *
 * @author Suresh
 */
@Entity
data class Scientist(
        @Id @GeneratedValue
        var id: Long = 0,
        var surname: String = "")