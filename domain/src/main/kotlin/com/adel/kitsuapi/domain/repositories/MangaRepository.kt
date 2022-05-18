package com.adel.kitsuapi.domain.repositories

import com.adel.kitsuapi.domain.either.Either
import com.adel.kitsuapi.domain.models.manga.SingleMangaModel
import kotlinx.coroutines.flow.Flow

interface MangaRepository {
    fun fetchDetailedManga(id: String): Flow<Either<String, SingleMangaModel>>
}