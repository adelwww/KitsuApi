package com.adel.kitsuapi.data.remote.dtos.auth

import com.google.gson.annotations.SerializedName

data class AuthDto(
    @SerializedName("grant_type")
    val grantType: String = "password",
    @SerializedName("username")
    val username: String,
    @SerializedName("password")
    val password: String
)
