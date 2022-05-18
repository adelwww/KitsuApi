package com.adel.kitsu.presentation.ui.fragments.manga

import com.adel.kitsu.data.repositories.MangaRepositoryImpl
import com.adel.kitsu.presentation.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MangaViewModel @Inject constructor(
    private val mangaRepositoryImpl: MangaRepositoryImpl

) : BaseViewModel() {
    fun fetchManga() = mangaRepositoryImpl.fetchPagedManga().gatherPagingRequest { it.toUI() }
}