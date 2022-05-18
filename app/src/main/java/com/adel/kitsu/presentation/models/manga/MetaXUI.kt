package com.adel.kitsu.presentation.models.manga

import com.adel.kitsu.domain.models.manga.MetaXModel

data class MetaXUI(
    val dimensionsXUI: DimensionsXUI
)

fun MetaXModel.toUI() = MetaXUI(dimensionsXModel.toUI())
