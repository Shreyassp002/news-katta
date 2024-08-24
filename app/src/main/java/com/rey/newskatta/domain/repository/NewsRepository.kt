package com.rey.newskatta.domain.repository

import androidx.paging.PagingData
import com.rey.newskatta.domain.model.Article
import kotlinx.coroutines.flow.Flow
import retrofit2.http.Query

interface NewsRepository {
    fun getNews(sources: List<String>): Flow<PagingData<Article>>

    fun searchNews(seachQuery: String, sources: List<String>): Flow<PagingData<Article>>

}