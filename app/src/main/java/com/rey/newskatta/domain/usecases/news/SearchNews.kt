package com.rey.newskatta.domain.usecases.news

import androidx.paging.PagingData
import com.rey.newskatta.domain.model.Article
import com.rey.newskatta.domain.repository.NewsRepository
import com.rey.newskatta.presentation.search.SearchEvent
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class SearchNews @Inject constructor(
    private val newsRepository: NewsRepository
) {
    operator fun invoke(searchQuery: String, sources: List<String>): Flow<PagingData<Article>> {
        return newsRepository.searchNews(
            searchQuery = searchQuery,
            sources = sources
        )
    }
}