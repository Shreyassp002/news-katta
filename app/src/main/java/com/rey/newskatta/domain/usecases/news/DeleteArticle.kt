package com.rey.newskatta.domain.usecases.news

import com.rey.newskatta.data.local.NewsDao
import com.rey.newskatta.domain.model.Article
import javax.inject.Inject

class DeleteArticle @Inject constructor(
    private val newsDao: NewsDao
) {

    suspend operator fun invoke(article: Article){
        newsDao.delete(article = article)
    }

}