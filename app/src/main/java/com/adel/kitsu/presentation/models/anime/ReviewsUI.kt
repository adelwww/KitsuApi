package com.adel.kitsu.presentation.models.anime

import com.adel.kitsu.domain.models.anime.ReviewsModel

data class ReviewsUI(
    val links: LinksXXXXXXUI
)

fun ReviewsModel.toUI() = ReviewsUI(links.toUI())
