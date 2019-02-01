package com.mikezliu.shared

import kotlinx.serialization.Optional
import kotlinx.serialization.Serializable

@Serializable
data class TestObject(
    @Optional var name: String? = null)