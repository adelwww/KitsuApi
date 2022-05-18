package com.adel.kitsuapi.presentation.ui.fragments.manga.detailed

import com.adel.kitsuapi.domain.useCases.FetchDetailedMangaUseCase
import com.adel.kitsuapi.presentation.base.BaseViewModel
import com.adel.kitsuapi.presentation.models.manga.SingleMangaUI
import com.adel.kitsuapi.presentation.models.manga.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class DetailedMangaViewModel @Inject constructor(
    private val fetchDetailedMangaUseCase: FetchDetailedMangaUseCase
) : BaseViewModel() {

    private val _detailedMangaState = mutableUiStateFlow<SingleMangaUI>()
    var detailedMangaState = _detailedMangaState.asStateFlow()

    fun fetchDetailedManga(id: String) =
        fetchDetailedMangaUseCase(id).gatherRequest(_detailedMangaState) { it.toUI() }
}