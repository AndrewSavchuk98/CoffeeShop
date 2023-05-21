package com.savchuk.andrew.home.presentation

import androidx.lifecycle.ViewModel
import com.savchuk.andrew.home.domain.entities.Product
import com.savchuk.andrew.home.domain.usecases.GetFeaturesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getProductUseCase: GetFeaturesUseCase,
    private val homeRouter: HomeRouter
) : ViewModel() {

    fun launchDetailProduct(productId: Int){
        homeRouter.launchProductDetail(productId)
    }

    fun launchProductMore(){
        homeRouter.launchMoreProducts()
    }
}