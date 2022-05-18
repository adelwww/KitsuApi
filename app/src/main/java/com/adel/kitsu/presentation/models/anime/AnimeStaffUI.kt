package com.adel.kitsu.presentation.models.anime

import com.adel.kitsu.domain.models.anime.AnimeStaffModel

data class AnimeStaffUI(
    val links: LinksXXXXXXXXXXXXUI
)

fun AnimeStaffModel.toUI() = AnimeStaffUI(links.toUI())
