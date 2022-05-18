package com.adel.kitsu.presentation.models.manga

import com.adel.kitsu.domain.models.manga.ReviewsModel

data class ReviewsUI(
    val links:
    LinksXXXXXXUI
)

fun ReviewsModel.toUI() = ReviewsUI(links.toUI())