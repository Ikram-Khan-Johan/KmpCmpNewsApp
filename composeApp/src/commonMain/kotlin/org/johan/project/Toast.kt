package org.johan.project


interface ToastUI {
    val toast: String
    fun showToast(text: String)
}

expect fun geToast(): ToastUI


class ToastImpl  {
    var toast: ToastUI = geToast()

   fun showToast(): String {
       return "Hello, ${toast.showToast("This is Toast")}!"
   }
}