package com.rey.newskatta.domain.usecases.news

import com.rey.newskatta.data.local.NewsDao
import com.rey.newskatta.domain.model.Article
import kotlinx.coroutines.flow.Flow

class SelectArticles (
    private val newsDao: NewsDao
) {

    operator fun invoke(): Flow<List<Article>>{
        return newsDao.getArticles()
    }

}