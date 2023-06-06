package com.savchuk.andrew.home.presentation.entities

data class ParentModel(
    val title: String = "",
    val childList: List<ProductItemUi> = emptyList()
)
