package com.adel.kitsuapi.presentation.models.anime

import com.adel.kitsuapi.domain.models.anime.MappingsModel

data class MappingsUI(
    val links: LinksXXXXXUI
)

fun MappingsModel.toUI() = MappingsUI(links.toUI())