package com.adel.kitsuapi.presentation.models.anime

import com.adel.kitsuapi.domain.models.anime.SingleAnimeModel

data class SingleAnimeUI(
    val data: AnimeDataUI
)

fun SingleAnimeModel.toUI() = SingleAnimeUI(data.toUI())
