package com.adel.kitsuapi.presentation.models.anime

import com.adel.kitsuapi.domain.models.anime.MediumModel

data class MediumUI(
    val width: Int?,
    val height: Int?
)

fun MediumModel.toUI() = MediumUI(width, height)
