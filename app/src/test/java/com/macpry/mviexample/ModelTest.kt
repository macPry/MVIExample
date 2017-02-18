package com.macpry.mviexample

import com.macpry.mviexample.model.Repo
import com.macpry.mviexample.model.RepoResponse
import com.macpry.mviexample.model.User
import com.macpry.mviexample.model.UserResponse
import org.junit.Test
import org.junit.Assert.*

/* Copyright © Maciej Przybyl * All rights reserved. */

class ModelTest {

    val repo1 = Repo("repoName", 66)
    val repo2 = Repo("repoName2", 666)
    val repoResponse = RepoResponse(listOf(repo1, repo2))
    val user1 = User("userName", 33)
    val user2 = User("userName2", 111)
    val userResponse = UserResponse(listOf(user1, user2))

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