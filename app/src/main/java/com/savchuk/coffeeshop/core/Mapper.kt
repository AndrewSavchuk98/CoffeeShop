package com.savchuk.coffeeshop.core

interface Mapper<D> {

    fun mapTo(): D
}