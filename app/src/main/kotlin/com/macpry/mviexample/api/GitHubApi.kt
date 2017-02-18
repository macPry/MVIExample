package com.macpry.mviexample.api

import com.macpry.mviexample.api.model.RepoResponse

/* Copyright © Maciej Przybyl * All rights reserved. */

interface GitHubApi {
    fun repositories(): RepoResponse
}