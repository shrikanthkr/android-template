package com.justshow.justshow

import androidx.lifecycle.ViewModel
import com.justshow.repository.GithubRepo
import javax.inject.Inject

//TODO Fetch data and provide it to the Fragment.
class RepoListViewModel @Inject constructor(githubRepo: GithubRepo) : ViewModel()