package com.justshow.repository

import dagger.Binds
import dagger.Module

@Module
abstract class RepositoryModule {

    @Binds
    abstract fun githubRepo(githubRepoImpl: GithubRepoImpl): GithubRepo
}