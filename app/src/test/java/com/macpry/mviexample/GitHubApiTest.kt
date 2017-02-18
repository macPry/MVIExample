package com.macpry.mviexample

import com.jakewharton.retrofit2.adapter.rxjava2.Result
import com.macpry.mviexample.api.model.RepoResponse
import io.reactivex.subscribers.TestSubscriber
import org.junit.Test

/* Copyright © Maciej Przybyl * All rights reserved. */

class GitHubApiTest {

    @Test
    fun shouldReturnReposFromGitHubApi() {
        val testSubscriber = TestSubscriber<Result<RepoResponse>>()
        fakeGitHubApi.repositories().subscribe(testSubscriber)
        testSubscriber.assertValue(successRepoResponse)
    }
}