package com.example.showkase

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.airbnb.android.showkase.models.Showkase
import com.example.showkase.ui.theme.ShowkaseTheme

@Preview(name = "english", group = "conversations", locale = "en", showBackground = true)
@Preview(name = "russian", group = "conversations", locale = "ru", showBackground = true)
@Preview(name = "arabic", group = "conversations", locale = "ar", showBackground = true)
@Preview(name = "0.85f", group = "conversations", fontScale = 0.85f, showBackground = true)
@Preview(name = "1.00f", group = "conversations", fontScale = 1.00f, showBackground = true)
@Preview(name = "1.15f", group = "conversations", fontScale = 1.15f, showBackground = true)
@Preview(name = "1.30f", group = "conversations", fontScale = 1.30f, showBackground = true)
@Preview(name = "LIGHT", group = "conversations", uiMode = Configuration.UI_MODE_NIGHT_NO, showBackground = true)
@Preview(name = "DARK", group = "conversations", uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Preview(name = "NEXUS", group = "conversations", showSystemUi = true, device = Devices.NEXUS_5)
@Preview(name = "PIXEL", group = "conversations", showSystemUi = true, device = Devices.PIXEL_4)
@Preview(name = "LANDSCAPE", group = "conversations", showSystemUi = true, device = Devices.AUTOMOTIVE_1024p)
annotation class TestMultiPreview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShowkaseTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Text(
                        modifier = Modifier
                            .clickable {
                                applicationContext.startActivity(Showkase.getBrowserIntent(applicationContext))
                            },
                        text = "OPEN SHOWKASE",
                    )
                }
            }
        }
    }
}

@TestMultiPreview
@Composable
fun DefaultPreview() {
    ShowkaseTheme {
        Text(text = "Android")
    }
}