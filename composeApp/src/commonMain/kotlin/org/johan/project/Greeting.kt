package org.johan.project

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
//        return platform.showToast("Hello, ${platform.name}!")
    }
}