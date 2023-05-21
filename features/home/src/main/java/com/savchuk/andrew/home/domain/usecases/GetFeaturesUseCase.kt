package com.savchuk.andrew.home.domain.usecases

import com.savchuk.andrew.home.domain.ProductRepository
import javax.inject.Inject

class GetFeaturesUseCase @Inject constructor(private val repository: ProductRepository) {

    suspend operator fun invoke() {
        repository.getFeaturesProducts()
    }
}