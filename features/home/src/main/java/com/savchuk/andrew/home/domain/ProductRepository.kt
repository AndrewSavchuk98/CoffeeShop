package com.savchuk.andrew.home.domain

import com.savchuk.andrew.home.domain.entities.Product
import com.savchuk.andrew.home.domain.entities.SectionEntities

interface ProductRepository {

    suspend fun getSectionProducts(): List<SectionEntities>

    suspend fun getProducts(): List<Product>

    suspend fun getProduct(productId: String): Product
}