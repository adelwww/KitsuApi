package com.adel.kitsu.presentation.models.anime

import com.adel.kitsu.domain.models.anime.SingleAnimeModel

data class SingleAnimeUI(
    val data: AnimeDataUI
)

fun SingleAnimeModel.toUI() = SingleAnimeUI(data.toUI())
