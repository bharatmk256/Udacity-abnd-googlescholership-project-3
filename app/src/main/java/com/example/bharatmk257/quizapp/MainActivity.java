package com.example.bharatmk257.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    String won;
    int score1, score2, score3, score4, score5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //QUESTION TWO ANSWERING
    public void questionTwoRadio(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radio1:
                if (checked) {
                    score2 = 0;
                    break;
                }
            case R.id.radio2:
                if (checked) {
                    score2 = 0;
                    break;
                }
            case R.id.radio3:
                if (checked) {
                    score2 = 20;
                    break;
                }
            case R.id.radio4:
                if (checked) {
                    score2 = 0;
                    break;
                }
        }
    }

    //QUESTION THREE ANSWERING
    public void questionThreeRadio(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radio5:
                if (checked) {
                    score3 = 0;
                    break;
                }
            case R.id.radio6:
                if (checked) {
                    score3 = 0;
                    break;
                }
            case R.id.radio7:
                if (checked) {
                    score3 = 20;
                    break;
                }
            case R.id.radio8:
                if (checked) {
                    score3 = 0;
                    break;
                }
        }
    }

    //QUESTION FOUR ANSWERING
    public void questionFourRadio(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radio9:
                if (checked) {
                    score4 = 20;
                    break;
                }
            case R.id.radio10:
                if (checked) {
                    score4 = 0;
                    break;
                }
            case R.id.radio11:
                if (checked) {
                    score4 = 0;
                    break;
                }
            case R.id.radio12:
                if (checked) {
                    score4 = 0;
                    break;
                }
        }
    }

    public void getScore(View view) {

        //QUESTION 1 SCORING AND ANSWER
        CheckBox CheckBoxOne = (CheckBox) findViewById(R.id.checkbox_1);
        boolean hasChecked1 = CheckBoxOne.isChecked();

        CheckBox CheckBoxTwo = (CheckBox) findViewById(R.id.checkbox_2);
        boolean hasChecked2 = CheckBoxTwo.isChecked();

        CheckBox CheckBoxThree = (CheckBox) findViewById(R.id.checkbox_3);
        boolean hasChecked3 = CheckBoxThree.isChecked();

        CheckBox CheckBoxFour = (CheckBox) findViewById(R.id.checkbox_4);
        boolean hasChecked4 = CheckBoxFour.isChecked();

        if (hasChecked1 && hasChecked2 && hasChecked4) {
            score1 = 20;
        } else score1 = 0;

        //QUESTION 4 SCORING AND ANSWER
        EditText ansEditText = (EditText) findViewById(R.id.EditText_Q5);
        String ansFive = ansEditText.getText().toString();


        if (ansFive.toLowerCase().equals("google")) {
            score5 = 20;
        } else score5 = 0;

        if (score == 100){
            won = "Yey You Won Score Is " + score;
        }else {
            won = "Please Check Again Your Ans Score Is " + score;
        }

        //SCORING FINAL
        score = score1 + score2 + score3 + score4 + score5;
        Toast.makeText(getApplicationContext(), won, Toast.LENGTH_SHORT).show();
        displayScore(score);

    }

    private void displayScore(int number) {
        TextView scoreTextView = (TextView) findViewById(R.id.score);
        scoreTextView.setText(""+number);
    }

}

