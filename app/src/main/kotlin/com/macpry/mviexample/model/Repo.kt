package com.macpry.mviexample.model

import com.google.gson.annotations.SerializedName

/* Copyright © Maciej Przybyl * All rights reserved. */

data class Repo(

        @SerializedName("name")
        val name: String,

        @SerializedName("id")
        val id: Long
)