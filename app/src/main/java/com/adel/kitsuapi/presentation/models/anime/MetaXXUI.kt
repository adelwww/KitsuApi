package com.adel.kitsuapi.presentation.models.anime

import com.adel.kitsuapi.domain.models.anime.MetaXXModel

data class MetaXXUI(
    val count: Int
)

fun MetaXXModel.toUI() = MetaXXUI(count)
