package com.adel.kitsuapi.presentation.models.anime

import com.adel.kitsuapi.domain.models.anime.AnimeStaffModel

data class AnimeStaffUI(
    val links: LinksXXXXXXXXXXXXUI
)

fun AnimeStaffModel.toUI() = AnimeStaffUI(links.toUI())
