package com.adel.kitsuapi.di

import com.adel.kitsuapi.data.repositories.AnimeRepositoryImpl
import com.adel.kitsuapi.data.repositories.AuthenticationRepositoryImpl
import com.adel.kitsuapi.data.repositories.MangaRepositoryImpl
import com.adel.kitsuapi.domain.repositories.AnimeRepository
import com.adel.kitsuapi.domain.repositories.AuthenticationRepository
import com.adel.kitsuapi.domain.repositories.MangaRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoriesModule {
    @Binds
    abstract fun bindAnimeRepository(
        animeRepositoryImpl: AnimeRepositoryImpl
    ): AnimeRepository

    @Binds
    abstract fun bindMangaRepository(mangaRepositoryImpl: MangaRepositoryImpl): MangaRepository

    @Binds
    abstract fun bindAuthenticationRepository(authenticationRepositoryImpl: AuthenticationRepositoryImpl): AuthenticationRepository
}