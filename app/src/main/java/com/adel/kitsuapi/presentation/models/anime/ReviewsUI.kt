package com.adel.kitsuapi.presentation.models.anime

import com.adel.kitsuapi.domain.models.anime.ReviewsModel

data class ReviewsUI(
    val links: LinksXXXXXXUI
)

fun ReviewsModel.toUI() = ReviewsUI(links.toUI())
