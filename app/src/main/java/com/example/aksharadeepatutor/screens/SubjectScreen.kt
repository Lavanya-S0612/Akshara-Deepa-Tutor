package com.example.aksharadeepatutor.screens

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
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SubjectScreen(
    onSubjectClick: (String) -> Unit,
    onBack: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE8F5E9))
            .padding(20.dp),
        verticalArrangement = Arrangement.Top
    ) {
        Text(
            text = "📚 Syllabus Tracker",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1B5E20)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Choose a subject",
            fontSize = 16.sp,
            color = Color(0xFF555555)
        )

        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = { onSubjectClick("Science") },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF00897B),
                contentColor = Color.White
            )
        ) {
            Text(text = "🔬 Science")
        }

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = { onSubjectClick("Mathematics") },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFE65100),
                contentColor = Color.White
            )
        ) {
            Text(text = "➗ Mathematics")
        }

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = { onSubjectClick("Social Science") },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF1565C0),
                contentColor = Color.White
            )
        ) {
            Text(text = "🌍 Social Science")
        }

        Spacer(modifier = Modifier.height(28.dp))

        OutlinedButton(
            onClick = onBack,
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = Color(0xFF444444)
            )
        ) {
            Text(text = "⬅ Back to Dashboard")
        }
    }
}



