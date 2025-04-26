package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainHeading()
        }


        }
    }

@Composable
fun MainHeading() {
    Text(text = "Hello world")
    Scaffold { innerPadding->
        Column (modifier = Modifier.padding(innerPadding))
        {


                Text(text= "hello")
                Text (text="World")


        }



    }
    Scaffold { innerPadding->
        Row (modifier = Modifier.padding(innerPadding)){
            Text(text= "hello")
            Text (text="World")

        }









    }


}


    @Composable
fun MainBody(){

}

@Composable
fun Footer(){

}