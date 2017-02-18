package com.macpry.mviexample

import com.macpry.mviexample.model.Repo
import org.junit.Test
import org.junit.Assert.*

/* Copyright © Maciej Przybyl * All rights reserved. */

class ModelTest {

    @Test
    fun shouldCreateRepoWithProperties() {
        val repo = Repo("someName", 66)
        assertEquals(repo.name, "someName")
        assertEquals(repo.id, 66)
    }
}