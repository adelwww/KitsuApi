package com.adel.kitsu.presentation.models.manga

import com.adel.kitsu.domain.models.manga.MediumModel

data class MediumUI(
    val width: Int?,
    val height: Int?
)

fun MediumModel.toUI() = MediumUI(width, height)
