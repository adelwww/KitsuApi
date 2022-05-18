package com.adel.kitsu.presentation.models.anime

import com.adel.kitsu.domain.models.anime.MediumModel

data class MediumUI(
    val width: Int?,
    val height: Int?
)

fun MediumModel.toUI() = MediumUI(width, height)
