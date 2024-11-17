package org.johan.project

import android.os.Build

class AndroidPlatform : Platform {
    override val name: String = "Hello World : Android ${Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()