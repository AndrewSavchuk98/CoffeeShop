package com.savchuk.coffeeshop.data.di

import com.savchuk.coffeeshop.data.sources.FirebaseDataSource
import com.savchuk.coffeeshop.data.sources.ProductDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface ProductDataSourceModule {

    @Binds
    @Singleton
    fun bindProductDataSource(
        productDataSource: FirebaseDataSource
    ): ProductDataSource
}