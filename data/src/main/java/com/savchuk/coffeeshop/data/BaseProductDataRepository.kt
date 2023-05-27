package com.savchuk.coffeeshop.data

import com.savchuk.coffeeshop.data.entities.ProductRemote
import com.savchuk.coffeeshop.data.entities.SectionRemote
import com.savchuk.coffeeshop.data.sources.ProductDataSource
import javax.inject.Inject

class BaseProductDataRepository @Inject constructor(
    private val productDataSource: ProductDataSource
) :
    ProductDataRepository {
    override suspend fun getSections(): List<SectionRemote> {
        TODO("Not yet implemented")
    }

    override suspend fun getProductById(productId: Int): ProductRemote {
        TODO("Not yet implemented")
    }

    override suspend fun getProducts(): List<ProductRemote> {
        return productDataSource.getProducts()
    }
}