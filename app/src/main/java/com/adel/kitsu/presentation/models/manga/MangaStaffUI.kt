package com.adel.kitsu.presentation.models.manga

import com.adel.kitsu.domain.models.manga.MangaStaffModel

data class MangaStaffUI(
    val links: LinksXXXXXXXXXXUI
)

fun MangaStaffModel.toUI() = MangaStaffUI(links.toUI())
