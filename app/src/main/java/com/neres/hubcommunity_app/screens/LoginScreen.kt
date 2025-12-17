package com.neres.hubcommunity_app.screens


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.Unspecified
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import com.neres.hubcommunity_app.R

@Composable
fun LoginScreen (paddingValues: PaddingValues){

    var email by remember { mutableStateOf("") }
    var senha by remember { mutableStateOf("") }

    var emailError by remember { mutableStateOf("")}
    var senhaError by remember { mutableStateOf("") }

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(paddingValues),
        horizontalAlignment = Alignment.CenterHorizontally
        ){

        Spacer(modifier = Modifier.height(50.dp))

        Image(
            painter = painterResource(id = R.drawable.iconscreenlogin),
            contentDescription = "Logo do app",
            contentScale = ContentScale.Fit
        )

            Text(text = "Crie sua conta", fontSize = 17.sp, fontWeight = FontWeight.ExtraBold)

            Spacer(modifier = Modifier.height(20.dp))

        TextField(
            value = email,
            onValueChange = {email = it},
            label = {

                Text(
                    text = emailError.ifEmpty { "Email" },
                    color = if(emailError.isNotEmpty()) Red else Unspecified,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
            },

            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                errorIndicatorColor = Color.Transparent,
            ),

            textStyle = LocalTextStyle.current,
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 42.dp)

        )

        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = senha,
            onValueChange = {senha = it},
            label = {

                Text(
                    text = senhaError.ifEmpty { "Senha" },
                    color = if(senhaError.isNotEmpty()) Red else Unspecified,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
            },

            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                errorIndicatorColor = Color.Transparent,
            ),

            textStyle = LocalTextStyle.current,
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 42.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 58.dp),
            shape = RoundedCornerShape(40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF6E5FC5),
                contentColor = Color.White
            )
        ){
            Text("Entrar")
        }
    }
}