package com.adel.kitsu.presentation.models.anime

import com.adel.kitsu.domain.models.anime.CastingsModel

data class CastingsUI(
    val links: LinksXXXUI
)

fun CastingsModel.toUI() = CastingsUI(links.toUI())
