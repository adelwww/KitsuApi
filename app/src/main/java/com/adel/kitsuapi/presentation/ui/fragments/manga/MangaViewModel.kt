package com.adel.kitsuapi.presentation.ui.fragments.manga

import com.adel.kitsuapi.data.repositories.MangaRepositoryImpl
import com.adel.kitsuapi.presentation.base.BaseViewModel
import com.adel.kitsuapi.presentation.models.manga.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MangaViewModel @Inject constructor(
    private val mangaRepositoryImpl: MangaRepositoryImpl

) : BaseViewModel() {
    fun fetchManga() = mangaRepositoryImpl.fetchPagedManga().gatherPagingRequest { it.toUI() }
}