package com.adel.kitsuapi.data.remote.apiservices

import com.adel.kitsuapi.data.remote.dtos.auth.AuthDto
import com.adel.kitsuapi.data.remote.dtos.auth.TokenDto
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthenticationApiService {
    @POST("token")
    suspend fun authenticate(
        @Body authDto: AuthDto
    ): TokenDto

}