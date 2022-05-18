package com.adel.kitsu.presentation.models.anime

import com.adel.kitsu.domain.models.anime.MetaModel

data class MetaUI(
    val dimensions: DimensionsUI
)

fun MetaModel.toUI() = MetaUI(
    dimensionsModel.toUI()
)