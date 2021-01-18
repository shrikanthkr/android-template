package com.justshow.repository

import com.justshow.network.GithubService
import javax.inject.Inject

class GithubRepoImpl @Inject constructor(service: GithubService) : GithubRepo {
    //TODO add fun repolist(username: String) to fetch the list of repositories from github
}