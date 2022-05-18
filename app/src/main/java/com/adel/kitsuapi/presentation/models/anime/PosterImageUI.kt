package com.adel.kitsuapi.presentation.models.anime

import com.adel.kitsuapi.domain.models.anime.PosterImageModel

data class PosterImageUI(
    val tiny: String,
    val small: String,
    val medium: String,

    val large: String,
    val original: String,
    val meta: MetaUI
)

fun PosterImageModel.toUI() = PosterImageUI(tiny, small, medium, large, original, meta.toUI())
