package com.adel.kitsuapi.data.repositories

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.map
import com.adel.kitsuapi.data.remote.apiservices.AnimeApiService
import com.adel.kitsuapi.data.remote.dtos.anime.toDomain
import com.adel.kitsuapi.data.remote.pagingsources.AnimePagingSource
import com.adel.kitsuapi.data.repositories.base.BaseRepository
import com.adel.kitsuapi.domain.repositories.AnimeRepository
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class AnimeRepositoryImpl @Inject constructor(
    private val animeApiService: AnimeApiService
) : BaseRepository(), AnimeRepository {

    fun fetchPagedAnime() =
        Pager(PagingConfig(pageSize = 20, initialLoadSize = 10)) {
            AnimePagingSource(animeApiService)
        }.flow.map { data -> data.map { it.toDomain() } }

    override fun fetchAnimeDetails(id: String) = sendRequest {
        animeApiService.fetchSingleAnime(id).toDomain()
    }
}