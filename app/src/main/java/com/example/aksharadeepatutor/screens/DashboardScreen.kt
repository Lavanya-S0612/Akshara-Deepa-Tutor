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
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aksharadeepatutor.data.calculateOverallProgress
import com.example.aksharadeepatutor.data.resetProgress

@Composable
fun DashboardScreen(
    context: Context,
    onOpenSyllabus: () -> Unit,
    onOpenDailyQuiz: () -> Unit,
    onOpenStrengthMap: () -> Unit,
    onOpenAboutProject: () -> Unit
) {
    var refreshKey by remember { mutableIntStateOf(0) }

    val overallProgress = calculateOverallProgress(context) + refreshKey - refreshKey
    val progressValue = overallProgress / 100f

    val profilePreferences = context.getSharedPreferences("student_profile", Context.MODE_PRIVATE)
    val studentName = profilePreferences.getString("student_name", "Student") ?: "Student"

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF6F8FB))
            .padding(20.dp),
        verticalArrangement = Arrangement.Top
    ) {
        Text(
            text = "📘 Akshara Deepa Tutor",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF2D1B69)
        )

        Spacer(modifier = Modifier.height(6.dp))

        Text(
            text = "Welcome, $studentName",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF444444)
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = "Your SSLC self-study companion",
            fontSize = 16.sp,
            color = Color(0xFF555555)
        )

        Spacer(modifier = Modifier.height(28.dp))

        Text(
            text = "📊 Overall Progress",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        LinearProgressIndicator(
            progress = { progressValue },
            modifier = Modifier.fillMaxWidth(),
            color = Color(0xFF2D1B69),
            trackColor = Color(0xFFD8D3EA)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "$overallProgress% completed",
            fontSize = 15.sp
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "🎯 Daily Goal",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF2D1B69)
        )

        Spacer(modifier = Modifier.height(6.dp))

        Text(
            text = "Complete at least one topic today",
            fontSize = 16.sp,
            color = Color(0xFF555555)
        )

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = onOpenSyllabus,
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF6A1B9A),
                contentColor = Color.White
            )
        ) {
            Text(text = "📚 Open Syllabus Tracker")
        }

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = onOpenDailyQuiz,
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFEF6C00),
                contentColor = Color.White
            )
        ) {
            Text(text = "📝 Start Daily Quiz")
        }

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = onOpenStrengthMap,
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF2E7D32),
                contentColor = Color.White
            )
        ) {
            Text(text = "📈 View Strength Map")
        }

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = onOpenAboutProject,
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF1565C0),
                contentColor = Color.White
            )
        ) {
            Text(text = "ℹ️ About Project")
        }

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedButton(
            onClick = {
                resetProgress(context)
                refreshKey++
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = Color(0xFFC62828)
            )
        ) {
            Text(text = "🔄 Reset Progress")
        }
    }
}
