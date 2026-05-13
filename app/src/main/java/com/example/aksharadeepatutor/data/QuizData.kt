package com.example.aksharadeepatutor.data

data class QuizQuestion(
    val question: String,
    val options: List<String>,
    val correctAnswer: String
)

fun getQuizQuestionsForChapter(subjectName: String, chapterName: String): List<QuizQuestion> {
    return when (subjectName) {
        "Science" -> getScienceQuizQuestions(chapterName)
        "Mathematics" -> getMathQuizQuestions(chapterName)
        "Social Science" -> getSocialScienceQuizQuestions(chapterName)
        else -> emptyList()
    }
}
