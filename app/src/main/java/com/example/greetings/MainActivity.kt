package com.example.greetings

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greetings.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colors.background) {
                    BirthdayGreeting(getString(R.string.happy_birthday_message), "Dapedu")
                }
            }
        }
    }
}

@Composable
fun BirthdayGreeting(message: String, from: String) {
    val image = painterResource(id = R.drawable.androidparty)

    Box {
        Image(painter = image, contentDescription = "Background with cake", contentScale = ContentScale.Crop)
        Column(modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = message, modifier = Modifier.padding(top = 16.dp), fontSize = 24.sp)
            Text(text = from, modifier = Modifier.align(alignment = Alignment.End) , fontSize = 16.sp)
        }
    }
}

@Preview(showBackground = false)
@Composable
fun BirthdayGreetingPreview() {
    AppTheme {
        BirthdayGreeting(stringResource(id = R.string.happy_birthday_message), "Dapedu")
    }
}