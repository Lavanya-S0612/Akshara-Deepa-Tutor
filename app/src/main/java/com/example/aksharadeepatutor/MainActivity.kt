package com.example.aksharadeepatutor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.aksharadeepatutor.screens.AboutProjectScreen
import com.example.aksharadeepatutor.screens.ChapterScreen
import com.example.aksharadeepatutor.screens.DashboardScreen
import com.example.aksharadeepatutor.screens.QuizScreen
import com.example.aksharadeepatutor.screens.StrengthMapScreen
import com.example.aksharadeepatutor.screens.StudentProfileScreen
import com.example.aksharadeepatutor.screens.SubjectScreen
import com.example.aksharadeepatutor.ui.theme.AksharaDeepaTutorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val appContext = this
        val profilePreferences = getSharedPreferences("student_profile", MODE_PRIVATE)
        val savedName = profilePreferences.getString("student_name", "") ?: ""

        setContent {
            AksharaDeepaTutorTheme {
                var currentScreen by remember {
                    mutableStateOf(
                        if (savedName.isBlank()) "profile" else "dashboard"
                    )
                }

                var selectedSubject by remember { mutableStateOf("") }
                var selectedChapter by remember { mutableStateOf("") }

                when (currentScreen) {
                    "profile" -> StudentProfileScreen(
                        context = appContext,
                        onContinue = {
                            currentScreen = "dashboard"
                        }
                    )

                    "dashboard" -> DashboardScreen(
                        context = appContext,
                        onOpenSyllabus = {
                            currentScreen = "subjects"
                        },
                        onOpenDailyQuiz = {
                            selectedSubject = "Science"
                            selectedChapter = "Chemical Reactions and Equations"
                            currentScreen = "quiz"
                        },
                        onOpenStrengthMap = {
                            currentScreen = "strength"
                        },
                        onOpenAboutProject = {
                            currentScreen = "about"
                        }
                    )

                    "subjects" -> SubjectScreen(
                        onSubjectClick = { subject ->
                            selectedSubject = subject
                            currentScreen = "chapters"
                        },
                        onBack = {
                            currentScreen = "dashboard"
                        }
                    )

                    "chapters" -> ChapterScreen(
                        context = appContext,
                        subjectName = selectedSubject,
                        onStartQuiz = { chapter ->
                            selectedChapter = chapter
                            currentScreen = "quiz"
                        },
                        onBack = {
                            currentScreen = "subjects"
                        }
                    )

                    "quiz" -> QuizScreen(
                        subjectName = selectedSubject,
                        chapterName = selectedChapter,
                        onBack = {
                            currentScreen = "dashboard"
                        }
                    )

                    "strength" -> StrengthMapScreen(
                        context = appContext,
                        onBack = {
                            currentScreen = "dashboard"
                        }
                    )

                    "about" -> AboutProjectScreen(
                        onBack = {
                            currentScreen = "dashboard"
                        }
                    )
                }
            }
        }
    }
}

