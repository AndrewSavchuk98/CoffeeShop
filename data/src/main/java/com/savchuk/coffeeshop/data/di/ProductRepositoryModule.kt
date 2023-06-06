package com.savchuk.coffeeshop.data.di

import com.savchuk.coffeeshop.data.BaseProductDataRepository
import com.savchuk.coffeeshop.data.ProductDataRepository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
@Singleton
interface ProductRepositoryModule {

    @Binds
    @Singleton
    fun bindProductRepository(
        repository: BaseProductDataRepository
    ):ProductDataRepository
}