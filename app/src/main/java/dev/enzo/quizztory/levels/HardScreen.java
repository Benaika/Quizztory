package dev.enzo.quizztory.levels;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import dev.enzo.quizztory.HQuestionnaires;
import dev.enzo.quizztory.R;

public class HardScreen extends AppCompatActivity implements View.OnClickListener {

    TextView noOfQuestions, tvQuestions;
    Button btnOptionA,btnOptionB,btnOptionC,btnOptionD,btnSubmit;

    int score = 0;
    int totalQuestions = HQuestionnaires.questions.length;
    int currentQuestionIndex = 0;
    String selectedAnswer = "";
    int brownOrangeColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard_screen);

        // Retrieving the color value for 'brownOrangeColor' from the app's resources,
        // using the resource identifier 'R.color.brown_orange'.
        brownOrangeColor = getResources().getColor(R.color.brown_orange);

        // Initializing UI elements for a quiz app:
        noOfQuestions = findViewById(R.id.txt_numberOfQuestions);
        tvQuestions = findViewById(R.id.tv_questions);
        btnOptionA = findViewById(R.id.txt_optionA);
        btnOptionB = findViewById(R.id.txt_optionB);
        btnOptionC = findViewById(R.id.txt_optionC);
        btnOptionD = findViewById(R.id.txt_optionD);
        btnSubmit = findViewById(R.id.btnSubmit);

        // Customizing the background color of the submit button to a light beige shade
        // using the color resource defined in the app's resources (R.color.light_beige).
        btnSubmit.setBackgroundColor(this.getColor(R.color.light_beige));

        // Setting click listeners for option buttons (A, B, C, D) and the submit button,
        // directing user interactions to a common handler (this) for streamlined code and consistent behavior.
        btnOptionA.setOnClickListener(this);
        btnOptionB.setOnClickListener(this);
        btnOptionC.setOnClickListener(this);
        btnOptionD.setOnClickListener(this);
        btnSubmit.setOnClickListener(this);

        // Setting the text of the 'noOfQuestions' TextView to display the total number of questions in the quiz.
        // Converts 'totalQuestions' from a numerical value to a String for proper display.
        noOfQuestions.setText(String.valueOf(totalQuestions));

        loadNewQuestion();
    }

    @Override
    public void onClick(View v) {
        // Setting the background color of option buttons (A, B, C, D) to the 'brownOrangeColor',
        // creating a consistent visual style for the multiple-choice answer buttons.
        btnOptionA.setBackgroundColor(brownOrangeColor);
        btnOptionB.setBackgroundColor(brownOrangeColor);
        btnOptionC.setBackgroundColor(brownOrangeColor);
        btnOptionD.setBackgroundColor(brownOrangeColor);

        // Handling button clicks in the quiz app:
        // If the clicked button is the submit button:
        //    - Check if the selected answer is correct, update the score if so.
        //    - Move to the next question and load it.
        // If the clicked button is an answer option:
        //    - Store the selected answer.
        //    - Change the background color of the clicked option button to black.
        Button clikedButton = (Button) v;
        if(clikedButton.getId() == R.id.btnSubmit){

            if(selectedAnswer.equals(HQuestionnaires.answers[currentQuestionIndex])){
                score++;
            }
            currentQuestionIndex++;
            loadNewQuestion();

        }else {
            selectedAnswer = clikedButton.getText().toString();
            clikedButton.setBackgroundColor(Color.BLACK);
        }
    }
    void loadNewQuestion(){
        // Loading a new question in the quiz:
        // If the current question index equals the total number of questions, finish the quiz.
        // Otherwise, update the question and answer options displayed on the screen.
        if(currentQuestionIndex == totalQuestions){
            finishQuiz();
            return;
        }
        tvQuestions.setText(HQuestionnaires.questions[currentQuestionIndex]);
        btnOptionA.setText(HQuestionnaires.choices[currentQuestionIndex][0]);
        btnOptionB.setText(HQuestionnaires.choices[currentQuestionIndex][1]);
        btnOptionC.setText(HQuestionnaires.choices[currentQuestionIndex][2]);
        btnOptionD.setText(HQuestionnaires.choices[currentQuestionIndex][3]);
    }

    void finishQuiz(){
        // Function to finish the quiz and display a dialog with the user's pass status and score.
        // - 'passStatus': String variable to determine if the user passed or failed based on the score.
        // - If the score is greater than 60% of the total questions, the user is considered "Passed."
        // - Display an AlertDialog with title indicating pass status, message showing the score,
        //   and options to either restart the quiz or go to the homepage.
        // - The dialog is set as non-cancelable to ensure the user makes a choice.
        String passStatus = "";
        if(score > totalQuestions * 0.60){
            passStatus = "Passed";
        }else {
            passStatus = "Failed";
        }
        new AlertDialog.Builder(this)
                .setTitle(passStatus)
                .setMessage("Score is " + score + " out of " + totalQuestions)
                .setPositiveButton("Restart", (dialog, which) -> restartQuiz())
                .setNegativeButton("Homepage", (dialog, which) -> homepage())
                .setCancelable(false)
                .show();
    }

    void restartQuiz(){
        // Restarting the quiz:
        // Resetting the score and current question index to start the quiz anew.
        // Loading a new question to initiate the quiz.
        score = 0;
        currentQuestionIndex = 0;
        loadNewQuestion();
    }
    void homepage(){
        // Navigating to the homepage:
        // Creating an intent to launch the DifficultyScreen activity.
        // Starting the new activity and finishing the current one to return to the homepage.
        Intent intent = new Intent(this, DifficultyScreen.class);
        startActivity(intent);
        finish();
    }
}