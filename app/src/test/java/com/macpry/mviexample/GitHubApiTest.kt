package com.macpry.mviexample

import org.junit.Test
import org.junit.Assert.*

/* Copyright © Maciej Przybyl * All rights reserved. */

class GitHubApiTest {

    @Test
    fun shouldReturnReposFromGitHubApi() {
        assertEquals(fakeGitHubApi.repositories(), repoResponse)
    }
}