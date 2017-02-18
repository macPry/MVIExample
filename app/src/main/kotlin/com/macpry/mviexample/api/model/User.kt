package com.macpry.mviexample.api.model

import com.google.gson.annotations.SerializedName

/* Copyright © Maciej Przybyl * All rights reserved. */

data class User(

        @SerializedName("login")
        val name: String,

        @SerializedName("id")
        val id: Long
)