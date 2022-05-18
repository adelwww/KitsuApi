package com.adel.kitsu.presentation.models.anime

import com.adel.kitsu.domain.models.anime.TinyModel

data class TinyUI(
    val width: Int?,
    val height: Int?
)

fun TinyModel.toUI() = TinyUI(
    width, height
)