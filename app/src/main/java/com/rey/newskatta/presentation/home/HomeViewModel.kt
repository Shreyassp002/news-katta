package com.rey.newskatta.presentation.home

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.rey.newskatta.domain.usecases.news.GetNews
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getNewsUseCase: GetNews
): ViewModel() {

    var state = mutableStateOf(HomeState())
        private set

    val news = getNewsUseCase(
        sources = listOf("bbc-news","abc-news","al-jazeera-english", "google-news-in")
    ).cachedIn(viewModelScope)

}