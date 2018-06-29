package com.example.android.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton question1_choice1;
    EditText question2_answer;
    CheckBox question3_choice1;
    CheckBox question3_choice3;
    CheckBox question3_choice4;
    RadioButton question4_choice3;
    CheckBox question5_choice1;
    CheckBox question5_choice2;
    CheckBox question5_choice4;
    EditText question6_answer;
    CheckBox question7_choice2;
    CheckBox question7_choice3;
    CheckBox question7_choice4;
    RadioButton question8_choice2;
    EditText question9_answer;
    RadioButton question10_choice2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //stops the keyboard from popping up at each launch
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_main);
    }
    public void submitAnswers(View view){
        CharSequence resultDisplay;
        int no1_answer;
        int no2_answer;
        int no3_answer;
        int no4_answer;
        int no5_answer;
        int no6_answer;
        int no7_answer;
        int no8_answer;
        int no9_answer;
        int no10_answer;
        int Total;

        //Question1 correct answer = option 1: linux kernel
        Boolean answer1;
        question1_choice1 = (RadioButton)this.findViewById(R.id.question1_choice1);
        answer1 = question1_choice1.isChecked();
        if(answer1){
            no1_answer = 1;
        }else{
            no1_answer =0;
        }

        //Question2 correct answer : android not responding
        String answer2;
        question2_answer = (EditText) this.findViewById(R.id.question2_answer);
        answer2 = question2_answer.getText().toString().toLowerCase();
        if (answer2.equals("android not responding")) {
            no2_answer = 1;
        } else {
            no2_answer = 0;
        }
        //Question3 correct answers: internal/External storage, Shared preferences, network server

        Boolean answer3_choice1;
        Boolean answer3_choice3;
        Boolean answer3_choice4;
        question3_choice1 = (CheckBox) this.findViewById(R.id.question3_choice1);
        question3_choice3 = (CheckBox) this.findViewById(R.id.question3_choice3);
        question3_choice4 = (CheckBox) this.findViewById(R.id.question3_choice4);
        answer3_choice1 = question3_choice1.isChecked();
        answer3_choice3 = question3_choice3.isChecked();
        answer3_choice4 = question3_choice4.isChecked();
        if (answer3_choice1 && answer3_choice3 && answer3_choice4) {
            no3_answer = 1;
        } else {
            no3_answer = 0;
        }

    //Question4 correct answers: emulator
        Boolean answer4;
        question4_choice3 = (RadioButton)this.findViewById(R.id.question4_choice3);
        answer4 = question4_choice3.isChecked();
        if(answer4){
            no4_answer = 1;
        }else {
            no4_answer = 0;
        }

        // Question5 correct answer: AlertDialog, datePickerDialog, TimePickerDialog
        Boolean answer5_choice1;
        Boolean answer5_choice2;
        Boolean answer5_choice4;
        question5_choice1 = (CheckBox)this.findViewById(R.id.question5_choice1);
        question5_choice2 =(CheckBox)this.findViewById(R.id.question5_choice2);
        question5_choice4 = (CheckBox)this.findViewById(R.id.question5_choice4);
        answer5_choice1 = question5_choice1.isChecked();
        answer5_choice2 = question5_choice2.isChecked();
        answer5_choice4 = question5_choice4.isChecked();

        if(answer5_choice1 && answer5_choice2 && answer5_choice4){
            no5_answer = 1;
        }else{
            no5_answer = 0;
        }

         // Question6 correct answer: Explicit intent
        String answer6;
        question6_answer = (EditText)this.findViewById(R.id.question6_answer);
        answer6 = question6_answer.getText().toString().toLowerCase();
        if(answer6.equals("explicit intent")){
            no6_answer = 1;
            }else {
            no6_answer = 0;
        }

        //Question7 correct answers: service, intent,notification
        Boolean answer7_choice2;
        Boolean answer7_choice3;
        Boolean answer7_choice4;
        question7_choice2 = (CheckBox)this.findViewById(R.id.question7_choice2);
        question7_choice3 = (CheckBox)this.findViewById(R.id.question7_choice3);
        question7_choice4 = (CheckBox)this.findViewById(R.id.question7_choice4);
        answer7_choice2 = question7_choice2.isChecked();
        answer7_choice3 = question7_choice3.isChecked();
        answer7_choice4 = question7_choice4.isChecked();

        if(answer7_choice2 && answer7_choice3 && answer7_choice4){
            no7_answer = 1;
        }else{
            no7_answer = 0;
        }

        //Question8 correct answer: services
     Boolean answer8;
        question8_choice2 = (RadioButton)this.findViewById(R.id.question8_choice2);
        answer8 = question8_choice2.isChecked();
        if(answer8){
            no8_answer = 1;
            }else{
            no8_answer = 0;
            }

       // Question9 correct answer: IDE
       String answer9;
        question9_answer = (EditText)this.findViewById(R.id.question9_answer);
        answer9 = question9_answer.getText().toString().toLowerCase();
        if(answer9.equals("ide")){
            no9_answer = 1;
        }else{
            no9_answer = 0;
        }

        //Question10 correct answer: Android Debug Bridge
        Boolean answer10;
        question10_choice2 = (RadioButton)this.findViewById(R.id.question10_choice2);
        answer10 = question10_choice2.isChecked();
        if(answer10){
            no10_answer = 1;
        }else{
            no10_answer = 0;
        }

        Total = no1_answer + no2_answer + no3_answer + no4_answer + no5_answer + no6_answer +
                no7_answer + no8_answer + no9_answer + no10_answer;


        if (Total == 10) {
            resultDisplay = "Excellent! You scored 10/10";
        } else {
            resultDisplay = "Try again. You scored " + Total+ " / 10";
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resultDisplay, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();

    }
    public void showAnswer(View view){
        String correction = "1." + question1_choice1;
        correction += "2. " + question2_answer;
        correction += "3. " + question3_choice1 +"," +question3_choice3 +","+ question3_choice4;

    }

}

















