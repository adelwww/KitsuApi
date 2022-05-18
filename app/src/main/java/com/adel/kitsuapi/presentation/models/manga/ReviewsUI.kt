package com.adel.kitsuapi.presentation.models.manga

import com.adel.kitsuapi.domain.models.manga.ReviewsModel

data class ReviewsUI(
    val links:
    LinksXXXXXXUI
)

fun ReviewsModel.toUI() = ReviewsUI(links.toUI())