package com.savchuk.andrew.home.domain

import com.savchuk.andrew.home.domain.entities.Product

interface ProductRepository {

    suspend fun getFeaturesProducts(): List<Product>
}