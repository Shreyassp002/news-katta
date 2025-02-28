package com.rey.newskatta.presentation.onboarding

import androidx.annotation.DrawableRes
import com.rey.newskatta.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int,
)

val pages = listOf(
    Page(
        title = "Welcome to NewsKatta",
        description = "Stay updated with the latest news from around the world.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Personalized News",
        description = "Get news tailored to your interests and preferences.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Stay Informed",
        description = "Receive notifications for breaking news and important updates.",
        image = R.drawable.onboarding3
    )
)