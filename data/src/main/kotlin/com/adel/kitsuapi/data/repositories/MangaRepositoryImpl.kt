package com.adel.kitsuapi.data.repositories

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.map
import com.adel.kitsuapi.data.remote.apiservices.MangaApiService
import com.adel.kitsuapi.data.remote.dtos.manga.toDomain
import com.adel.kitsuapi.data.remote.pagingsources.MangaPagingSource
import com.adel.kitsuapi.data.repositories.base.BaseRepository
import com.adel.kitsuapi.domain.repositories.MangaRepository
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class MangaRepositoryImpl @Inject constructor(
    private val mangaApiService: MangaApiService
) : BaseRepository(), MangaRepository {

    fun fetchPagedManga() = Pager(
        PagingConfig(
            pageSize = 20,
            initialLoadSize = 10
        )
    ) { MangaPagingSource(mangaApiService) }.flow.map { data -> data.map { it.toDomain() } }

    override fun fetchDetailedManga(id: String) = sendRequest {
        mangaApiService.fetchDetailedManga(id).toDomain()
    }
}