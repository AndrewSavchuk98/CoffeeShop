package com.savchuk.coffeeshop.data.sources

import com.savchuk.coffeeshop.data.entities.ProductRemote
import com.savchuk.coffeeshop.data.entities.SectionRemote

interface ProductDataSource {
    suspend fun getSections(): List<SectionRemote>

    suspend fun getProductById(productId: Int): ProductRemote

    suspend fun getProducts(): List<ProductRemote>
}