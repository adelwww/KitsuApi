package com.adel.kitsuapi.presentation.models.manga

import com.adel.kitsuapi.domain.models.manga.MediaRelationshipsModel

data class MediaRelationshipsUI(
    val links: LinksXXXXXXXUI
)

fun MediaRelationshipsModel.toUI() = MediaRelationshipsUI(links.toUI())