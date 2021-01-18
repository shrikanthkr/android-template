package com.justshow.justshow.di

import android.content.Context
import com.justshow.justshow.JustShowApplication
import com.justshow.repository.GithubRepo
import com.justshow.repository.RepositoryComponent
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Component(
    dependencies = [RepositoryComponent::class],
    modules = [AndroidSupportInjectionModule::class, RepoListModule::class]
)
@Singleton
interface SingletonComponent : AndroidInjector<JustShowApplication> {

    fun githubRepo(): GithubRepo

    @Component.Factory
    interface Factory {
        fun create(
            repositoryComponent: RepositoryComponent,
            @BindsInstance applicationContext: Context
        ): SingletonComponent
    }
}