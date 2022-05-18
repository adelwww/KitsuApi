package com.adel.kitsu.presentation.models.manga

import com.adel.kitsu.domain.models.manga.MetaXXModel

data class MetaXXUI(
    val count: Int
)

fun MetaXXModel.toUI() = MetaXXUI(count)
