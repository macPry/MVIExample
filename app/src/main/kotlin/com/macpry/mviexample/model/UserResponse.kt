package com.macpry.mviexample.model

import com.google.gson.annotations.SerializedName

/* Copyright © Maciej Przybyl * All rights reserved. */

data class UserResponse(

        @SerializedName("items")
        val userList: List<User>
)