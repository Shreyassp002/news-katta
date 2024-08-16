package com.rey.newskatta.presentation.onboarding

import androidx.annotation.DrawableRes
import com.rey.newskatta.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "Welcome to NewsKatta",
        description = "Get the latest news from around the world",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Personalized News",
        description = "Get news that matters to you",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Stay Updated",
        description = "Get news updates as they happen",
        image = R.drawable.onboarding3
    )
)
