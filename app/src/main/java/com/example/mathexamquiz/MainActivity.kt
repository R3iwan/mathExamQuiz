package com.example.mathexamquiz

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.mathexamquiz.R


class MainActivity : ComponentActivity() {
    private lateinit var buttonChoice1: Button
    private lateinit var buttonChoice2: Button
    private lateinit var buttonChoice3: Button
    private lateinit var buttonChoice4: Button
    private lateinit var nextButton: Button
    private lateinit var prevButton: Button
    private lateinit var questionTextView: TextView
    private lateinit var answeringQuestion: TextView

    private var currentIndex = 0
    private val questions = QuestionRepository.questions[0]

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonChoice1 = findViewById(R.id.button_choice_1)
        buttonChoice2 = findViewById(R.id.button_choice_2)
        buttonChoice3 = findViewById(R.id.button_choice_3)
        buttonChoice4 = findViewById(R.id.button_choice_4)
        answeringQuestion = findViewById(R.id.answering_question)
        prevButton = findViewById(R.id.prev_button)
        nextButton = findViewById(R.id.next_button)
        questionTextView = findViewById(R.id.question_text_view)


        answeringQuestion.setText(R.string.answer_following_question)

        buttonChoice1.setOnClickListener{

            if (questions.correctAnswerIndex == 0){
                Toast.makeText(this,"True",Toast.LENGTH_LONG).show()
            } else{
                Toast.makeText(this,"False",Toast.LENGTH_LONG).show()
            }
        }
        buttonChoice2.setOnClickListener{

            if (questions.correctAnswerIndex == 1){
                Toast.makeText(this,"True",Toast.LENGTH_LONG).show()
            } else{
                Toast.makeText(this,"False",Toast.LENGTH_LONG).show()
            }
        }

        buttonChoice3.setOnClickListener{

            if (questions.correctAnswerIndex == 2){
                Toast.makeText(this,"True",Toast.LENGTH_LONG).show()
            } else{
                Toast.makeText(this,"False",Toast.LENGTH_LONG).show()
            }
        }

        buttonChoice4.setOnClickListener{

            if (questions.correctAnswerIndex == 3){
                Toast.makeText(this,"True",Toast.LENGTH_LONG).show()
            } else{
                Toast.makeText(this,"False",Toast.LENGTH_LONG).show()
            }
        }

        prevButton.setOnClickListener{
            if(currentIndex > 0){
                currentIndex --
                updateQuestion()
            }
        }

        nextButton.setOnClickListener{
            if(currentIndex < QuestionRepository.questions.size){
                currentIndex ++
                updateQuestion()
            }
        }

        updateQuestion()

    }

    private fun updateQuestion() {
        val updateQuestion = QuestionRepository.questions[currentIndex].textResId
        val updateChoices = QuestionRepository.questions[currentIndex].answerChoices
        questionTextView.setText(updateQuestion)

        buttonChoice1.setText(updateChoices[0])
        buttonChoice2.setText(updateChoices[1])
        buttonChoice3.setText(updateChoices[2])
        buttonChoice4.setText(updateChoices[3])
    }
}