package com.savchuk.andrew.nestedrecyclertest.domain.entities

import com.savchuk.andrew.home.domain.entities.Product

data class SectionEntities(
    val id: Int,
    val title: String,
    val list: List<Product>
) : java.io.Serializable