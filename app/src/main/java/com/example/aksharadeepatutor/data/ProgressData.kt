package com.example.aksharadeepatutor.data

import android.content.Context

fun calculateOverallProgress(context: Context): Int {
    val subjects = listOf("Science", "Mathematics", "Social Science")

    var totalChapters = 0
    var completedChapters = 0

    subjects.forEach { subject ->
        val chapters = getChaptersForSubject(subject)
        totalChapters += chapters.size

        chapters.forEach { chapter ->
            if (isChapterCompleted(context, subject, chapter)) {
                completedChapters++
            }
        }
    }

    if (totalChapters == 0) {
        return 0
    }

    return ((completedChapters.toFloat() / totalChapters.toFloat()) * 100).toInt()
}

fun calculateSubjectProgress(context: Context, subjectName: String): Int {
    val chapters = getChaptersForSubject(subjectName)

    if (chapters.isEmpty()) {
        return 0
    }

    val completedChapters = chapters.count { chapter ->
        isChapterCompleted(context, subjectName, chapter)
    }

    return ((completedChapters.toFloat() / chapters.size.toFloat()) * 100).toInt()
}

fun isChapterCompleted(context: Context, subjectName: String, chapterName: String): Boolean {
    val sharedPreferences = context.getSharedPreferences("chapter_progress", Context.MODE_PRIVATE)
    return sharedPreferences.getBoolean("$subjectName-$chapterName", false)
}

fun resetProgress(context: Context) {
    val sharedPreferences = context.getSharedPreferences("chapter_progress", Context.MODE_PRIVATE)
    sharedPreferences.edit().clear().apply()
}
