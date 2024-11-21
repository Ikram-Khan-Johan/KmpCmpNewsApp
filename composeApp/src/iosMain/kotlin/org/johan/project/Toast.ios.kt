package org.johan.project

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import platform.UIKit.UIAlertController
import platform.UIKit.UIAlertControllerStyleActionSheet
import platform.UIKit.UIApplication
import platform.UIKit.UIViewController

class IOSToast : ToastUI {
    override val toast: String = "Hello iOS Toast"
    override fun showToast(text: String) {
        val alert = UIAlertController.alertControllerWithTitle(
            title = "Logo status",
            message = text,
            preferredStyle = UIAlertControllerStyleActionSheet
        )
//        alert.addAction(
//            UIAlertAction.actionWithTitle(
//                "OK",
//                style = UIAlertActionStyleDefault,
//                handler = null
//            )
//        )

        // Presenting alert on the current view controller
        getRootViewController()?.presentViewController(alert, animated = true, completion = {

              CoroutineScope(Dispatchers.Main).launch {
                 kotlinx.coroutines.delay(2000 ) // Delay for the specified time
                  // Dismiss the alert
                  alert.dismissViewControllerAnimated(true, completion = null)
              }
        })
    }

    private fun getRootViewController(): UIViewController? {
        return UIApplication.sharedApplication.keyWindow?.rootViewController
    }
}
actual fun geToast(): ToastUI = IOSToast()