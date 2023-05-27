package com.savchuk.andrew.home.domain.entities

data class SectionEntities(
    val id: Int,
    val title: String,
    val list: List<Product>
) : java.io.Serializable