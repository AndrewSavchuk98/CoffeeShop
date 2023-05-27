package com.savchuk.coffeeshop.navigation

import androidx.annotation.IdRes
import androidx.annotation.NavigationRes

interface DestinationProvider {
    /**
     * Get the destination ID of the initial start screen.
     */
    @IdRes
    fun provideStartDestinationId(): Int


}