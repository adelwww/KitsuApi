package com.adel.kitsu.domain.repositories

import com.adel.kitsu.domain.either.Either
import com.adel.kitsu.domain.models.manga.SingleMangaModel
import kotlinx.coroutines.flow.Flow

interface MangaRepository {
    fun fetchDetailedManga(id: String): Flow<Either<String, SingleMangaModel>>
}