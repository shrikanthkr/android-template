package com.justshow.justshow.di

import androidx.lifecycle.ViewModel
import com.justshow.justshow.RepoListViewModel
import com.justshow.justshow.fragments.RepoListFragment
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

/**
 * Dagger module for the Statistics feature.
 */
@Module
abstract class RepoListModule {

    @ContributesAndroidInjector(
        modules = [
            ViewModelBuilder::class
        ]
    )
    internal abstract fun repoListFragment(): RepoListFragment

    @Binds
    @IntoMap
    @ViewModelKey(RepoListViewModel::class)
    abstract fun bindViewModel(viewmodel: RepoListViewModel): ViewModel
}