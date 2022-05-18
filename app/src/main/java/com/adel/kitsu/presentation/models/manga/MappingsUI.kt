package com.adel.kitsu.presentation.models.manga

import com.adel.kitsu.domain.models.manga.MappingsModel

data class MappingsUI(
    val links: LinksXXXXXUI
)

fun MappingsModel.toUI() = MappingsUI(links.toUI())