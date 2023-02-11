package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme
import org.w3c.dom.NameList as NameList

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                var name by remember {
                    mutableStateOf("")
                }
                var names by remember {
                    mutableStateOf(listOf<String>())
                }
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        OutlinedTextField(
                            value = name,
                            onValueChange = { text ->
                                name = text
                            },
                            modifier = Modifier
                                .weight(1f)
                        )
                        Spacer(modifier = Modifier.width(16.dp))
                        Button(onClick = {
                            if (name.isNotBlank()) {
                                names = names + name
                                name = ""
                            }
                        }) {
                            Text(text = "Add")
                        }
                    }
                    NameList(names = names)
                }
            }
        }
    }
}


                @Composable
                fun NameList(names:
                             List<String>,
                modifier: Modifier = Modifier) {
                    LazyColumn (modifier){
                        items(names) { currentName ->
                            Text(text = currentName,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(16.dp)
                            )
                            Divider()
                        }
                    }
                }









//                var count by remember {
//                    mutableStateOf(0)
//                }
//                Column(
//                    verticalArrangement = Arrangement.Center,
//                    horizontalAlignment = Alignment.CenterHorizontally,
//                    modifier = Modifier.fillMaxSize()
//                ) {
//                    Text(
//                        text = count.toString(),
//                        fontSize = 30.sp
//                    )
//                    Button(onClick = {
//                       count++
//                    }) {
//                        Text(text = "Click me")
//
//                    }
//                }
                
                
                // A surface container using the 'background' color from the theme
                   // Greeting("Android")
//            }
//        }
//    }
//}

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