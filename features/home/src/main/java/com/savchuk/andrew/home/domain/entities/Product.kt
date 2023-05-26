package com.savchuk.andrew.home.domain.entities

import androidx.annotation.DrawableRes

data class Product(
    val id: Int = -1,
    val title: String,
    val imageRes: Int
) : java.io.Serializable