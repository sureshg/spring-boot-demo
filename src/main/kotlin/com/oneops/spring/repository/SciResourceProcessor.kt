package com.oneops.spring.repository

import com.oneops.spring.domain.Scientist
import org.springframework.hateoas.Link
import org.springframework.hateoas.Resource
import org.springframework.hateoas.ResourceProcessor
import org.springframework.stereotype.Component

/**
 * [Scientist] hateoas resource processor
 *
 * @author Suresh
 */
@Component
class SciResourceProcessor : ResourceProcessor<Resource<Scientist>> {

    override fun process(resource: Resource<Scientist>?) = resource?.apply {
        add(Link("https://upload.wikimedia.org/wikipedia/commons/${content.surname}.jpg", "profile-image"))
    }
}