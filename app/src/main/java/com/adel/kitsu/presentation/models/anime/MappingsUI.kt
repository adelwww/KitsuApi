package com.adel.kitsu.presentation.models.anime

import com.adel.kitsu.domain.models.anime.MappingsModel

data class MappingsUI(
    val links: LinksXXXXXUI
)

fun MappingsModel.toUI() = MappingsUI(links.toUI())