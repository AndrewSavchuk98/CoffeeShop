package com.savchuk.andrew.presentation

import android.widget.ImageView
import coil.load
import coil.transform.RoundedCornersTransformation

fun ImageView.loadUrl(url: String) {
    load(url) {
        transformations(RoundedCornersTransformation(16f))
    }
}