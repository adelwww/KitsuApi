package com.adel.kitsu.presentation.models.anime

import com.adel.kitsu.domain.models.anime.StreamingLinksModel

data class StreamingLinksUI(
    val links: LinksXXXXXXXXXUI
)

fun StreamingLinksModel.toUI() = StreamingLinksUI(links.toUI())
