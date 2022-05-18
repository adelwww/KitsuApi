package com.adel.kitsuapi.presentation.models.anime

import com.adel.kitsuapi.domain.models.anime.AnimeDataModel
import com.adel.kitsuapi.presentation.base.BaseDiffModel

data class AnimeDataUI(
    override val id: String,
    val type: String?,
    val links: LinksUI?,
    val animeDto: AnimeUI,
    val relationships: RelationshipsUI?
) : BaseDiffModel

fun AnimeDataModel.toUI() =
    AnimeDataUI(id, type, links?.toUI(), animeDto.toUI(), relationships?.toUI())
