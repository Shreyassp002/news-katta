package com.rey.newskatta.domain.usecases.news

import androidx.paging.PagingData
import com.rey.newskatta.domain.model.Article
import com.rey.newskatta.domain.repository.NewsRepository
import com.rey.newskatta.presentation.search.SearchEvent
import kotlinx.coroutines.flow.Flow

class SearchNews(
    private val newsRepository: NewsRepository
) {
    operator fun invoke(searchQuery: String, sources: List<String>): Flow<PagingData<Article>> {
        return newsRepository.searchNews(seachQuery = searchQuery, sources = sources)
    }
}