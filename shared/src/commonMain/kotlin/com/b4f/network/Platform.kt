package com.b4f.network

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform