package com.macpry.mviexample

import com.macpry.mviexample.api.GitHubApi
import com.macpry.mviexample.api.model.Repo
import com.macpry.mviexample.api.model.RepoResponse
import com.macpry.mviexample.api.model.User
import com.macpry.mviexample.api.model.UserResponse

/* Copyright © Maciej Przybyl * All rights reserved. */

val repo1 = Repo("repoName", 66)
val repo2 = Repo("repoName2", 666)
val repoResponse = RepoResponse(listOf(repo1, repo2))

val user1 = User("userName", 33)
val user2 = User("userName2", 111)
val userResponse = UserResponse(listOf(user1, user2))

val fakeGitHubApi = FakeGitHubApi()

class FakeGitHubApi : GitHubApi {
    override fun repositories(): RepoResponse {
        return repoResponse
    }
}