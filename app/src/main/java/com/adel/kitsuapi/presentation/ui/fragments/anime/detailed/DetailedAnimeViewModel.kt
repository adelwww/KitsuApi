package com.adel.kitsuapi.presentation.ui.fragments.anime.detailed

import com.adel.kitsuapi.domain.useCases.FetchSingleAnimeUseCase
import com.adel.kitsuapi.presentation.base.BaseViewModel
import com.adel.kitsuapi.presentation.models.anime.SingleAnimeUI
import com.adel.kitsuapi.presentation.models.anime.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class DetailedAnimeViewModel @Inject constructor(
    private val fetchSingleAnimeUseCase: FetchSingleAnimeUseCase,
) : BaseViewModel() {
    private val _singleAnimeState = mutableUiStateFlow<SingleAnimeUI>()
    var singleAnimeState = _singleAnimeState.asStateFlow()


    fun fetchSingleAnime(id: String) =
        fetchSingleAnimeUseCase(id).gatherRequest(_singleAnimeState) { it.toUI() }


}