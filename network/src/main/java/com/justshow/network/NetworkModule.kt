package com.justshow.network

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.create
import javax.inject.Singleton


@Module
object NetworkModule {

    @Provides
    fun retrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .build()
    }

    @Provides
    fun githubService(retrofit: Retrofit): GithubService {
        return retrofit.create()
    }

}