package org.johan.project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform