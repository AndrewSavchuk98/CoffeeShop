package com.savchuk.coffeeshop.data

import kotlinx.serialization.Serializable

@Serializable
data class Coffee(
    val id: Int = 0,
    val image_url: Int = 0,
    val name: String = "",
    val price: Int = 0
)