package com.macpry.mviexample.api.model

import com.google.gson.annotations.SerializedName

/* Copyright © Maciej Przybyl * All rights reserved. */

data class RepoResponse(

        @SerializedName("items")
        val repoList: List<Repo>
)