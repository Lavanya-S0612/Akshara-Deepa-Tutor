package com.example.aksharadeepatutor.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
fun AboutProjectScreen(onBack: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE0F7FA))
            .verticalScroll(rememberScrollState())
            .padding(20.dp),
        verticalArrangement = Arrangement.Top
    ) {
        Text(
            text = "ℹ️ About Project",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF006064)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Akshara Deepa Tutor - SSLC Education App",
            fontSize = 17.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF444444)
        )

        Spacer(modifier = Modifier.height(24.dp))

        SectionTitle("🧩 Problem Statement")
        SectionText(
            "After-school learning in rural areas is often unguided. Students may have textbooks, but they lack a simple way to track chapter mastery and identify weak subjects early."
        )

        SectionTitle("🎯 Vision")
        SectionText(
            "Akshara Deepa Tutor is a self-study companion for SSLC students. It converts the syllabus into a mission map and helps students track progress through chapter completion and quizzes."
        )

        SectionTitle("✨ Main Features")
        SectionText(
            "Student profile, syllabus tracker, chapter checklist, daily quiz, result screen, review answers, strength map, daily goal, offline progress saving, and reset progress."
        )

        SectionTitle("🌱 Impact Goals")
        SectionText(
            "The app supports quality education, digital literacy, and better learning outcomes by helping students identify gap areas early."
        )

        SectionTitle("🛠 Technology Used")
        SectionText(
            "Kotlin, Jetpack Compose, SharedPreferences, and Android Studio."
        )

        Spacer(modifier = Modifier.height(24.dp))

        OutlinedButton(
            onClick = onBack,
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = Color(0xFF006064)
            )
        ) {
            Text(text = "⬅ Back to Dashboard")
        }
    }
}

@Composable
fun SectionTitle(title: String) {
    Text(
        text = title,
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold,
        color = Color(0xFF006064)
    )

    Spacer(modifier = Modifier.height(6.dp))
}

@Composable
fun SectionText(text: String) {
    Text(
        text = text,
        fontSize = 16.sp,
        color = Color(0xFF444444)
    )

    Spacer(modifier = Modifier.height(18.dp))
}
