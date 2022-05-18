package com.adel.kitsu.presentation.ui.fragments.anime

import com.adel.kitsu.data.repositories.AnimeRepositoryImpl
import com.adel.kitsu.presentation.base.BaseViewModel
import com.adel.kitsu.presentation.models.anime.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AnimeViewModel @Inject constructor(
    private val animeRepositoryImpl: AnimeRepositoryImpl
) : BaseViewModel() {

    fun fetchAnime() =
        animeRepositoryImpl.fetchPagedAnime().gatherPagingRequest {
            it.toUI()
        }


}