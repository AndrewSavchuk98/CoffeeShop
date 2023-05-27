package com.savchuk.andrew.home.domain.entities

data class Product(
    val id: String = "",
    val title: String,
    val imageUrl: String
) : java.io.Serializable