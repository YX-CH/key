package com.zero.keymanager

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zero.keymanager.ui.theme.KeyManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        this.window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION)

        enableEdgeToEdge()
        setContent {
            KeyManagerTheme {
                Scaffold {
                    Box(Modifier.fillMaxSize().padding(it)){
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            TitleBar("定义主密码")
                            Spacer(Modifier.height(120.dp))
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun TitleBar( name: String,modifier: Modifier = Modifier){
    Row (modifier.fillMaxWidth().padding(16.dp), horizontalArrangement = Arrangement.Center){
        Text(text = name, fontSize = 23.sp, fontWeight = FontWeight.ExtraBold)
    }
}

@Preview
@Composable
fun PreviewTitleBar(){
    TitleBar("请输入主密码", Modifier)
}