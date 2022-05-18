package com.adel.kitsuapi.presentation.models.manga

import com.adel.kitsuapi.domain.models.manga.CastingsModel

data class CastingsUI(
    val links: LinksXXXUI
)

fun CastingsModel.toUI() = CastingsUI(
    links.toUI()
)
