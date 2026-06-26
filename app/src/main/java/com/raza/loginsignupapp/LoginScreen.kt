package com.raza.loginsignupapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun LoginScreen() {

    val darkBlue = Color(color = 0xFF0B2545)
    val lightBlue = Color(color = 0xFF3F72AF)
    Box(modifier = Modifier.fillMaxSize().background(color = Color.White)) {
        Image(
            painter = painterResource(id = R.drawable.students),
            contentDescription = "Students"
        )
        Text(text = "Skip",
            color = Color.White,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.TopEnd)
                .padding(top = 40.dp, end = 24.dp)
                .clickable(onClick = { /*Pending*/})
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Spacer(modifier = Modifier.height(height = 70.dp) )
            Box(
                modifier = Modifier.background(color = darkBlue, shape = CircleShape)
                    .size(size = 160.dp)
                    .border(width = 4.dp, color = Color.White, shape = CircleShape),
                contentAlignment = Alignment.Center
            ) {
               Icon(
                   imageVector = Icons.Default.Menu,
                   contentDescription = "Logo",
                   tint = Color.White,
                   modifier = Modifier.size(size = 90.dp).rotate(degrees = -30f)
               )
            }
            Spacer(modifier = Modifier.height(height = 16.dp) )
            Text(
                text = "Welcome Back!",
                color = Color.White,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(height = 90.dp) )
            Column(
                modifier = Modifier.fillMaxSize()
                    .padding(all = 24.dp)
            ) {
                Text(text = "Email Address",
                color = Color.Gray,
                    )
                TextField(
                    value = "",
                    onValueChange = { }
                )
            }
        }
    }
}
