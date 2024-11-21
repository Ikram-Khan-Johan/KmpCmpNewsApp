package org.johan.project
import android.widget.Toast
class AndroidToast : ToastUI {
    override val toast: String = "Android Toast"
    override fun showToast(text: String) {
        Toast.makeText(AppContext.context, text, Toast.LENGTH_SHORT).show()

    }
}

actual fun geToast(): ToastUI = AndroidToast()