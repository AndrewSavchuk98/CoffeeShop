package com.savchuk.andrew.home.domain.usecases

import com.savchuk.andrew.home.domain.ProductRepository
import com.savchuk.andrew.nestedrecyclertest.domain.entities.SectionEntities
import javax.inject.Inject

class GetSectionsUseCase @Inject constructor(private val repository: ProductRepository) {

    suspend operator fun invoke(): List<SectionEntities> {
       return repository.getSectionProducts()
    }
}