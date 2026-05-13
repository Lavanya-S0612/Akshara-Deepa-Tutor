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
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aksharadeepatutor.data.calculateSubjectProgress

@Composable
fun StrengthMapScreen(
    context: Context,
    onBack: () -> Unit
) {
    val scienceProgress = calculateSubjectProgress(context, "Science")
    val mathProgress = calculateSubjectProgress(context, "Mathematics")
    val socialProgress = calculateSubjectProgress(context, "Social Science")

    val weakestSubject = getWeakestSubject(
        scienceProgress = scienceProgress,
        mathProgress = mathProgress,
        socialProgress = socialProgress
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF3E5F5))
            .padding(20.dp),
        verticalArrangement = Arrangement.Top
    ) {
        Text(
            text = "📈 Strength Map",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF4A148C)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Subject-wise mastery level",
            fontSize = 16.sp,
            color = Color(0xFF555555)
        )

        Spacer(modifier = Modifier.height(30.dp))

        StrengthItem(
            subject = "🔬 Science",
            progress = scienceProgress,
            color = Color(0xFF00897B)
        )

        StrengthItem(
            subject = "➗ Mathematics",
            progress = mathProgress,
            color = Color(0xFFE65100)
        )

        StrengthItem(
            subject = "🌍 Social Science",
            progress = socialProgress,
            color = Color(0xFF1565C0)
        )

        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "⚠ Gap Area: $weakestSubject needs more practice.",
            fontSize = 17.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFC62828)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Focus on this subject to improve your overall learning progress.",
            fontSize = 15.sp,
            color = Color(0xFF555555)
        )

        Spacer(modifier = Modifier.height(28.dp))

        OutlinedButton(
            onClick = onBack,
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = Color(0xFF4A148C)
            )
        ) {
            Text(text = "⬅ Back to Dashboard")
        }
    }
}

@Composable
fun StrengthItem(
    subject: String,
    progress: Int,
    color: Color
) {
    Text(
        text = "$subject: $progress%",
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold,
        color = Color(0xFF333333)
    )

    Spacer(modifier = Modifier.height(8.dp))

    LinearProgressIndicator(
        progress = { progress / 100f },
        modifier = Modifier.fillMaxWidth(),
        color = color,
        trackColor = Color(0xFFD8D3EA)
    )

    Spacer(modifier = Modifier.height(20.dp))
}

fun getWeakestSubject(
    scienceProgress: Int,
    mathProgress: Int,
    socialProgress: Int
): String {
    return when {
        scienceProgress <= mathProgress && scienceProgress <= socialProgress -> "Science"
        mathProgress <= scienceProgress && mathProgress <= socialProgress -> "Mathematics"
        else -> "Social Science"
    }
}

