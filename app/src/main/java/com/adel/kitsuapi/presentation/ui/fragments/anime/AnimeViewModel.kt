package com.adel.kitsuapi.presentation.ui.fragments.anime

import com.adel.kitsuapi.data.repositories.AnimeRepositoryImpl
import com.adel.kitsuapi.presentation.base.BaseViewModel
import com.adel.kitsuapi.presentation.models.anime.toUI
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