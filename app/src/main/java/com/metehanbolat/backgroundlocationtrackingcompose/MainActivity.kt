package com.metehanbolat.backgroundlocationtrackingcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.backgroundlocationtrackingcompose.ui.theme.BackgroundLocationTrackingComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BackgroundLocationTrackingComposeTheme {

            }
        }
    }
}
