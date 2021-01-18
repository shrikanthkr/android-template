package com.justshow.justshow

import com.justshow.justshow.di.DaggerSingletonComponent
import com.justshow.network.NetworkComponent
import com.justshow.repository.DaggerRepositoryComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class JustShowApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        val repoComponent =
            DaggerRepositoryComponent.factory().create(NetworkComponent.create())

        return DaggerSingletonComponent
            .factory()
            .create(repoComponent, this)
    }

}