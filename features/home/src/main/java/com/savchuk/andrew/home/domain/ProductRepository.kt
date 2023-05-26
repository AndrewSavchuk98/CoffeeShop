package com.savchuk.andrew.home.domain

import com.savchuk.andrew.home.domain.entities.SectionEntities

interface ProductRepository {

    suspend fun getSectionProducts(): List<SectionEntities>
}