package com.rey.newskatta.presentation.bookmark

import com.rey.newskatta.domain.model.Article
import com.rey.newskatta.domain.usecases.news.SelectArticles

data class BookmarkState(
    val articles: List<Article> = emptyList()
)