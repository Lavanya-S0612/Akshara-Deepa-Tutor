package com.example.aksharadeepatutor.screens

import androidx.compose.foundation.background
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
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
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
import com.example.aksharadeepatutor.data.getQuizQuestionsForChapter

@Composable
fun QuizScreen(
    subjectName: String,
    chapterName: String,
    onBack: () -> Unit
) {
    val questions = getQuizQuestionsForChapter(subjectName, chapterName)

    var currentQuestionIndex by remember { mutableIntStateOf(0) }
    var showResult by remember { mutableStateOf(false) }
    var showReview by remember { mutableStateOf(false) }

    val selectedAnswers = remember(chapterName) {
        mutableStateListOf<String>().apply {
            repeat(questions.size) {
                add("")
            }
        }
    }

    if (questions.isEmpty()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFFFF3E0))
                .padding(20.dp),
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                text = "📝 Quiz Not Added Yet",
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFE65100)
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "Questions for this chapter will be added soon.",
                fontSize = 16.sp
            )

            Spacer(modifier = Modifier.height(24.dp))

            OutlinedButton(
                onClick = onBack,
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = Color(0xFFE65100)
                )
            ) {
                Text(text = "⬅ Back to Chapters")
            }
        }

        return
    }

    if (showReview) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFFFF3E0))
                .verticalScroll(rememberScrollState())
                .padding(20.dp),
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                text = "✅ Review Answers",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFE65100)
            )

            Spacer(modifier = Modifier.height(16.dp))

            questions.forEachIndexed { index, question ->
                val isCorrect = selectedAnswers[index] == question.correctAnswer

                Text(
                    text = "Q${index + 1}. ${question.question}",
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF333333)
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = "Your Answer: ${if (selectedAnswers[index].isEmpty()) "Not answered" else selectedAnswers[index]}",
                    fontSize = 15.sp,
                    color = if (isCorrect) Color(0xFF2E7D32) else Color(0xFFC62828)
                )

                Text(
                    text = "Correct Answer: ${question.correctAnswer}",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF2E7D32)
                )

                Spacer(modifier = Modifier.height(18.dp))
            }

            OutlinedButton(
                onClick = onBack,
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = Color(0xFFE65100)
                )
            ) {
                Text(text = "⬅ Back to Chapters")
            }
        }

        return
    }

    if (showResult) {
        val score = questions.indices.count { index ->
            selectedAnswers[index] == questions[index].correctAnswer
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFFFF3E0))
                .padding(20.dp),
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                text = "🏆 Quiz Result",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFE65100)
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = chapterName,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Your Score: $score / ${questions.size}",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = if (score >= 4) Color(0xFF2E7D32) else Color(0xFFC62828)
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = if (score >= 4) "Great! You mastered this chapter." else "Revise this chapter once more.",
                fontSize = 16.sp,
                color = Color(0xFF444444)
            )

            Spacer(modifier = Modifier.height(28.dp))

            Button(
                onClick = {
                    showReview = true
                },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF2E7D32),
                    contentColor = Color.White
                )
            ) {
                Text(text = "✅ Review Answers")
            }

            Spacer(modifier = Modifier.height(12.dp))

            OutlinedButton(
                onClick = onBack,
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = Color(0xFFE65100)
                )
            ) {
                Text(text = "⬅ Back to Chapters")
            }
        }

        return
    }

    val currentQuestion = questions[currentQuestionIndex]

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFF3E0))
            .padding(20.dp),
        verticalArrangement = Arrangement.Top
    ) {
        Text(
            text = "📝 $chapterName",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFE65100)
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Question ${currentQuestionIndex + 1} of ${questions.size}",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF333333)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = currentQuestion.question,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF333333)
        )

        Spacer(modifier = Modifier.height(18.dp))

        currentQuestion.options.forEach { option ->
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = selectedAnswers[currentQuestionIndex] == option,
                    onClick = {
                        selectedAnswers[currentQuestionIndex] = option
                    }
                )

                Text(
                    text = option,
                    fontSize = 16.sp,
                    color = Color(0xFF333333)
                )
            }

            Spacer(modifier = Modifier.height(6.dp))
        }

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {
                if (currentQuestionIndex < questions.size - 1) {
                    currentQuestionIndex++
                } else {
                    showResult = true
                }
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFE65100),
                contentColor = Color.White
            )
        ) {
            Text(
                text = if (currentQuestionIndex < questions.size - 1) {
                    "Next"
                } else {
                    "Submit Quiz"
                }
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedButton(
            onClick = onBack,
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = Color(0xFFE65100)
            )
        ) {
            Text(text = "⬅ Back to Chapters")
        }
    }
}
