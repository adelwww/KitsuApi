package com.adel.kitsuapi.presentation.models.anime

import com.adel.kitsuapi.domain.models.anime.StreamingLinksModel

data class StreamingLinksUI(
    val links: LinksXXXXXXXXXUI
)

fun StreamingLinksModel.toUI() = StreamingLinksUI(links.toUI())
