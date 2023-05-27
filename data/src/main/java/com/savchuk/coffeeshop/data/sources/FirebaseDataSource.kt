package com.savchuk.coffeeshop.data.sources

import com.google.firebase.firestore.FirebaseFirestore
import com.savchuk.coffeeshop.data.entities.ProductRemote
import com.savchuk.coffeeshop.data.entities.SectionRemote
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext
import javax.inject.Inject

class FirebaseDataSource @Inject constructor(
    private val db: FirebaseFirestore
) : ProductDataSource {
    override suspend fun getSections(): List<SectionRemote> {
        TODO("Not yet implemented")
    }

    override suspend fun getProductById(productId: Int): ProductRemote {
        TODO("Not yet implemented")
    }

    override suspend fun getProducts(): List<ProductRemote> = withContext(Dispatchers.IO) {
        val snapshot = db.collection("product").get().await()
        snapshot.documents.mapNotNull {
            it.toObject(ProductRemote::class.java)?.copy(id = it.id)
        }
    }
}