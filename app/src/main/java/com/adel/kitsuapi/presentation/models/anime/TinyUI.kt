package com.adel.kitsuapi.presentation.models.anime

import com.adel.kitsuapi.domain.models.anime.TinyModel

data class TinyUI(
    val width: Int?,
    val height: Int?
)

fun TinyModel.toUI() = TinyUI(
    width, height
)