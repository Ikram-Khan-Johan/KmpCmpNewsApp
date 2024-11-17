package org.johan.project

import platform.UIKit.UIDevice

class IOSPlatform: Platform {
    override val name: String = "Hello World : " + UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

actual fun getPlatform(): Platform = IOSPlatform()