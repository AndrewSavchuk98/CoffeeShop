package com.savchuk.coffeeshop.data.entities

import com.google.firebase.Timestamp
import com.google.firebase.database.PropertyName

data class ProductRemote(
    val id: String = "",
    @PropertyName(value="Category")
    val category: Int = 0,
    @PropertyName(value="Name")
    val name: String = "",
    @PropertyName(value="Image")
    val image: String = "",
    @PropertyName(value="Description")
    val description: String = "",
    @PropertyName(value="Date_created")
    val date_created: Timestamp = Timestamp.now()
)
