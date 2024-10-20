package com.rey.newskatta.presentation.bookmark

import com.rey.newskatta.domain.model.Article

data class BookmarkState(
    val articles: List<Article> = emptyList()
)