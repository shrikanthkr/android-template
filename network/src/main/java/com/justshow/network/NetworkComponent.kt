package com.justshow.network

import dagger.Component

@Component(
    modules = [NetworkModule::class]
)
interface NetworkComponent {
    fun githubService(): GithubService

    companion object {
        fun create(): NetworkComponent {
            return DaggerNetworkComponent.create()
        }
    }
}