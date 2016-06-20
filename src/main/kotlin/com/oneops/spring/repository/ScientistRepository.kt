package com.oneops.spring.repository

import com.oneops.spring.domain.Scientist
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource


/**
 * Scientist Spring Data repository.
 *
 * @author Suresh
 */
@RepositoryRestResource
interface ScientistRepository : JpaRepository<Scientist, Long> {

    fun findBySurname(@Param("sn") sn: String): List<Scientist>
}
