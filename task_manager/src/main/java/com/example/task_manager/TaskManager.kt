package com.example.task_manager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task_manager.ui.theme.GreetingsTheme

class TaskManager : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TaskManager(
                        taskCompletedImage = painterResource(id = R.drawable.ic_task_completed),
                        taskCompletedImageDescription = stringResource(R.string.task_completed),
                        taskCompletedText = stringResource(R.string.all_tasks_completed),
                        niceWorkText = stringResource(R.string.nice_work)
                    )
                }
            }
        }
    }
}

@Composable
fun TaskManager(
    taskCompletedImage: Painter,
    taskCompletedImageDescription: String,
    taskCompletedText: String,
    niceWorkText: String
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = taskCompletedImage,
            contentDescription = taskCompletedImageDescription
        )
        Text(
            text = taskCompletedText,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        Text(text = niceWorkText, fontSize = 16.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun TaskManagerPreview() {
    GreetingsTheme {
        TaskManager(
            taskCompletedImage = painterResource(id = R.drawable.ic_task_completed),
            taskCompletedImageDescription = stringResource(R.string.task_completed),
            taskCompletedText = stringResource(R.string.all_tasks_completed),
            niceWorkText = stringResource(R.string.nice_work)
        )
    }
}