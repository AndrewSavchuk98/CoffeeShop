package com.savchuk.coffeeshop.data

import com.savchuk.coffeeshop.data.entities.ProductRemote
import com.savchuk.coffeeshop.data.entities.SectionRemote
import com.savchuk.coffeeshop.data.sources.ProductDataSource

class BaseProductDataRepository(private val productDataSource: ProductDataSource) :
    ProductDataRepository {
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