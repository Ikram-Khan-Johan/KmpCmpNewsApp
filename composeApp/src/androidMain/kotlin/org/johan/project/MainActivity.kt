package org.johan.project

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppContext.context = this
        setContent {
            App()
        }
    }
}
  @SuppressLint("StaticFieldLeak")
  object AppContext {
        lateinit var context: Context
    }

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}