package com.example.aksharadeepatutor.screens

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun StudentProfileScreen(
    context: Context,
    onContinue: () -> Unit
) {
    val sharedPreferences = context.getSharedPreferences("student_profile", Context.MODE_PRIVATE)

    var studentName by remember {
        mutableStateOf(sharedPreferences.getString("student_name", "") ?: "")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFF8E1))
            .padding(20.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "👩‍🎓 Student Profile",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFE65100)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Start your SSLC learning journey",
            fontSize = 17.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF444444)
        )

        Spacer(modifier = Modifier.height(6.dp))

        Text(
            text = "Enter your name to personalize the app",
            fontSize = 15.sp,
            color = Color(0xFF666666)
        )

        Spacer(modifier = Modifier.height(28.dp))

        OutlinedTextField(
            value = studentName,
            onValueChange = {
                studentName = it
            },
            label = {
                Text(text = "Student Name")
            },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {
                sharedPreferences.edit()
                    .putString("student_name", studentName)
                    .apply()

                onContinue()
            },
            modifier = Modifier.fillMaxWidth(),
            enabled = studentName.isNotBlank(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFE65100),
                contentColor = Color.White
            )
        ) {
            Text(text = "➡ Continue")
        }
    }
}
