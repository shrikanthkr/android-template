package com.justshow.justshow

import android.util.Log
import androidx.lifecycle.ViewModel
import com.justshow.repository.GithubRepo
import javax.inject.Inject

class RepoListViewModel @Inject constructor(githubRepo: GithubRepo) : ViewModel() {
    private val TAG: String = "RepoListViewModel"

    //TODO something should be done here to make the api call and
    init {
        Log.d(TAG, "$githubRepo")
    }

    fun kick(){
        Log.d(TAG, "Kick")
    }
}