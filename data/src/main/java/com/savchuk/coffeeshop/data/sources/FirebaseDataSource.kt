package com.savchuk.coffeeshop.data.sources

import com.savchuk.coffeeshop.data.entities.ProductRemote
import com.savchuk.coffeeshop.data.entities.SectionRemote

class FirebaseDataSource: ProductDataSource {
    override suspend fun getSections(): List<SectionRemote> {
        TODO("Not yet implemented")
    }

    override suspend fun getProductById(productId: Int): ProductRemote {
        TODO("Not yet implemented")
    }

    override suspend fun getProducts(): List<ProductRemote> {
        TODO("Not yet implemented")
    }
}