package com.macpry.mviexample

import org.junit.Test
import org.junit.Assert.*

/* Copyright © Maciej Przybyl * All rights reserved. */

class ModelTest {

    @Test
    fun shouldCreateRepoResponse() {
        assertEquals(repoResponse.repoList[0].name, "repoName")
        assertEquals(repoResponse.repoList[0].id, 66)
        assertEquals(repoResponse.repoList[1].name, "repoName2")
        assertEquals(repoResponse.repoList[1].id, 666)
    }

    @Test
    fun shouldCreateUserResponse() {
        assertEquals(userResponse.userList[0].name, "userName")
        assertEquals(userResponse.userList[0].id, 33)
        assertEquals(userResponse.userList[1].name, "userName2")
        assertEquals(userResponse.userList[1].id, 111)
    }
}