package com.macpry.mviexample.api

import com.jakewharton.retrofit2.adapter.rxjava2.Result
import com.macpry.mviexample.api.model.RepoResponse
import io.reactivex.Flowable
import retrofit2.http.GET

/* Copyright © Maciej Przybyl * All rights reserved. */

interface GitHubApi {

    @GET("search/repositories")
    fun repositories(): Flowable<Result<RepoResponse>>
}