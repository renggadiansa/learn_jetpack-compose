package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Text(
                        text = "0",
                        fontSize = 30.sp
                    )
                    Button(onClick = {

                    }) {
                        Text(text = "Click me")

                    }
                }
                
                
                // A surface container using the 'background' color from the theme
                   // Greeting("Android")
            }
        }
    }
}

//@Composable
//fun Greeting(name: String) {
//    LazyRow(modifier = Modifier.fillMaxSize()) {
//        items(10) {i ->
//            Icon(imageVector = Icons.Default.Add,
//                contentDescription = null,
//                modifier = Modifier.size(100.dp)
//            )
//        }
//    }






//    Image(painter = painterResource(id = R.drawable.ic_launcher_foreground) ,
//        contentDescription = null,
//    modifier = Modifier.background(Color.Black))



//    Box (
//        modifier = Modifier
//            .size(400.dp),
//    ){
//        Text(
//            text = "Hello $name!",
//            color = Color.Blue,
//            fontSize = 30.sp,
//            modifier = Modifier
//                .align(Alignment.BottomEnd)
//        )
//        Text(
//            text = "Some other text",
//            color = Color.Red,
//            fontSize = 30.sp,
//        )
//    }
//}

//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    JetpackComposeTheme {
//       // Greeting("Rengga")
//    }
//}