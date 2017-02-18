package com.macpry.mviexample

import com.macpry.mviexample.model.Repo
import com.macpry.mviexample.model.RepoResponse
import org.junit.Test
import org.junit.Assert.*

/* Copyright © Maciej Przybyl * All rights reserved. */

class ModelTest {

    val repo1 = Repo("someName", 66)
    val repo2 = Repo("someName2", 666)
    val repoResponse = RepoResponse(listOf(repo1, repo2))

    @Test
    fun shouldCreateRepoWithProperties() {
        assertEquals(repo1.name, "someName")
        assertEquals(repo1.id, 66)
    }

    @Test
    fun shouldCreateRepoResponse() {
        assertEquals(repoResponse.repoList[0].name, "someName")
        assertEquals(repoResponse.repoList[0].id, 66)
        assertEquals(repoResponse.repoList[1].name, "someName2")
        assertEquals(repoResponse.repoList[1].id, 666)
    }
}