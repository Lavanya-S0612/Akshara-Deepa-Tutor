package com.example.aksharadeepatutor.screens

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aksharadeepatutor.data.getChaptersForSubject

@Composable
fun ChapterScreen(
    context: Context,
    subjectName: String,
    onStartQuiz: (String) -> Unit,
    onBack: () -> Unit
) {
    val chapters = getChaptersForSubject(subjectName)
    val sharedPreferences = context.getSharedPreferences("chapter_progress", Context.MODE_PRIVATE)

    val checkedStates = remember(subjectName) {
        mutableStateListOf<Boolean>().apply {
            chapters.forEach { chapter ->
                val savedValue = sharedPreferences.getBoolean("$subjectName-$chapter", false)
                add(savedValue)
            }
        }
    }

    var selectedChapter by remember(subjectName) {
        mutableStateOf(chapters.firstOrNull() ?: "")
    }

    val completedCount = checkedStates.count { it }
    val progress = if (chapters.isNotEmpty()) {
        completedCount / chapters.size.toFloat()
    } else {
        0f
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE3F2FD))
            .verticalScroll(rememberScrollState())
            .padding(20.dp),
        verticalArrangement = Arrangement.Top
    ) {
        Text(
            text = "📖 $subjectName Chapters",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF0D47A1)
        )

        Spacer(modifier = Modifier.height(20.dp))

        LinearProgressIndicator(
            progress = { progress },
            modifier = Modifier.fillMaxWidth(),
            color = Color(0xFF1565C0),
            trackColor = Color(0xFFBBDEFB)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Progress: ${(progress * 100).toInt()}%",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF0D47A1)
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Selected: $selectedChapter",
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFEF6C00)
        )

        Spacer(modifier = Modifier.height(20.dp))

        chapters.forEachIndexed { index, chapter ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        selectedChapter = chapter
                    },
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = checkedStates[index],
                    onCheckedChange = { checked ->
                        checkedStates[index] = checked
                        selectedChapter = chapter

                        sharedPreferences.edit()
                            .putBoolean("$subjectName-$chapter", checked)
                            .apply()
                    }
                )

                Text(
                    text = chapter,
                    fontSize = 16.sp,
                    fontWeight = if (selectedChapter == chapter) FontWeight.Bold else FontWeight.Normal,
                    color = if (selectedChapter == chapter) Color(0xFF0D47A1) else Color.Black,
                    modifier = Modifier.weight(1f)
                )
            }

            Spacer(modifier = Modifier.height(6.dp))
        }

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {
                onStartQuiz(selectedChapter)
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFEF6C00),
                contentColor = Color.White
            )
        ) {
            Text(text = "📝 Start Quiz")
        }

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedButton(
            onClick = onBack,
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = Color(0xFF0D47A1)
            )
        ) {
            Text(text = "⬅ Back to Subjects")
        }
    }
}

