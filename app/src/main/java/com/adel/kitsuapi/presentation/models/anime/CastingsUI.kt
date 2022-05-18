package com.adel.kitsuapi.presentation.models.anime

import com.adel.kitsuapi.domain.models.anime.CastingsModel

data class CastingsUI(
    val links: LinksXXXUI
)

fun CastingsModel.toUI() = CastingsUI(links.toUI())
