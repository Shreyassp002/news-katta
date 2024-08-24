package com.rey.newskatta.presentation.search

import androidx.paging.PagingData
import com.rey.newskatta.domain.model.Article
import kotlinx.coroutines.flow.Flow


data class SearchState(
    val searchQuery: String = "",
    val articles: Flow<PagingData<Article>>? = null

) {
}