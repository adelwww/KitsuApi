package com.adel.kitsu.presentation.models.anime

import com.adel.kitsu.domain.models.anime.MetaXXModel

data class MetaXXUI(
    val count: Int
)

fun MetaXXModel.toUI() = MetaXXUI(count)
