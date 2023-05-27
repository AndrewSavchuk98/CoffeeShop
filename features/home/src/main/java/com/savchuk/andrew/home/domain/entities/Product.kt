package com.savchuk.andrew.home.domain.entities

import androidx.annotation.DrawableRes

data class Product(
    val id: String = "",
    val title: String,
    val imageRes: Int
) : java.io.Serializable