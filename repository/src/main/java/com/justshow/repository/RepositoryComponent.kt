package com.justshow.repository

import com.justshow.network.GithubService
import com.justshow.network.NetworkComponent
import dagger.BindsInstance
import dagger.Component

@Component(
    dependencies = [NetworkComponent::class],
    modules = [RepositoryModule::class]
)
interface RepositoryComponent {
    fun githubRepo(): GithubRepo

    @Component.Factory
    interface Factory {
        fun create(networkComponent: NetworkComponent): RepositoryComponent
    }
}