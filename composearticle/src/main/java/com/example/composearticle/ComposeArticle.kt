package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.GreetingsTheme

class ComposeArticle : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
                ) {
                    Greeting(
                        title = getString(R.string.article_title),
                        subtitle = getString(R.string.article_subtitle),
                        content = getString(R.string.article_content)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(title: String, subtitle: String, content: String) {
    val postImage = painterResource(id = R.drawable.bg_compose_background)

    Column(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = postImage,
            contentDescription = "Imagem com a logo do compose e outros elementro de ui",
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.Fit
        )
        Text(text = title, fontSize = 24.sp, modifier = Modifier.padding(16.dp))
        Text(
            text = subtitle,
            fontSize = 16.sp,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        )
        Text(text = content, fontSize = 16.sp, modifier = Modifier.padding(16.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GreetingsTheme {
        Greeting(
            title = "Titulo",
            subtitle = "Subtitulo",
            content = "Conteúdo"
        )
    }
}