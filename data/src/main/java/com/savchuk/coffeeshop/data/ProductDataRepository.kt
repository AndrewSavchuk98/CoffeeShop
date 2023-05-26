package com.savchuk.coffeeshop.data

import com.savchuk.coffeeshop.data.entities.ProductRemote
import com.savchuk.coffeeshop.data.entities.SectionRemote

interface ProductDataRepository {

    suspend fun getSections(): List<SectionRemote>

    suspend fun getProductById(productId: Int): ProductRemote

    suspend fun getProducts(): List<ProductRemote>

}