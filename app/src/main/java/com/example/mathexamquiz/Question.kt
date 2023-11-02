package com.example.mathexamquiz

import androidx.annotation.StringRes

data class Question(@StringRes val textResId: Int, val answerChoices: List<String>, val correctAnswerIndex: Int)

object QuestionRepository{
    val questions = listOf(
        Question(
            R.string.question_text_1,
            listOf("120","128","72","80"),
            2
        ),
        Question(
            R.string.question_text_2,
            listOf("9","12","0.125","8/64"),
            0
        ),
        Question(
            R.string.question_text_3,
            listOf("16","8","0","12"),
            1
        ),
        Question(
            R.string.question_text_4,
            listOf("2564","8","64","512"),
            3
        ),
        Question(
            R.string.question_text_5,
            listOf("12","64","8","1"),
            2
        ),
    )
}


