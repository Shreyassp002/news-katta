package com.rey.newskatta.data.remote.dto

import com.rey.newskatta.domain.model.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)