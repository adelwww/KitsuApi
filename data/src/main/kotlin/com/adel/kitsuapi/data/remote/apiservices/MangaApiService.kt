package com.adel.kitsuapi.data.remote.apiservices

import com.adel.kitsuapi.data.remote.dtos.manga.MangaListDto
import com.adel.kitsuapi.data.remote.dtos.manga.SingleMangaDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MangaApiService {
    @GET("manga")
    suspend fun fetchManga(
        @Query("page[limit]") limit: Int,
        @Query("page[offset]") offset: Int
    ): MangaListDto

    @GET("manga/{id}")
    suspend fun fetchDetailedManga(@Path("id") id: String): SingleMangaDto


}