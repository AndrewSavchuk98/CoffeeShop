package com.savchuk.andrew.home.presentation

interface HomeRouter {

    fun launchMoreProducts(sectionId: Int)

    fun launchProductDetail(productId: String)
}