package com.adel.kitsu.presentation.models.anime

import com.adel.kitsu.domain.models.anime.CoverImageModel

data class CoverImageUI(
    val tiny: String,
    val small: String,
    val large: String,
    val original: String,
    val meta: MetaXUI
)

fun CoverImageModel.toUI() = CoverImageUI(tiny, small, large, original, meta.toUI())
