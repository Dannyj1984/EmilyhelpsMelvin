package com.example.android.emilyhelpsmelvin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button melvinSpeaks1;
    TextView melvinText1;
    Button rudolphSpeaks1;
    TextView rudolphText1;
    TextView santaText2;
    TextView rudolphText2;
    Button rudolphSpeak2;
    Button santaSpeak2;
    Button reset;
    TextView nameText1;
    String reader;
    int gender = 1;
    RadioGroup rg;
    RadioButton rb;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.start);
        rg = findViewById(R.id.rg1);







        nameText1 = (EditText) findViewById(R.id.nameText1);


    }

    public void onRadioButtonClicked(View view) {
        int radioButtonId = rg.getCheckedRadioButtonId();
        rb = findViewById(radioButtonId);

        if (rb.getText().equals("boy")) {
            gender = 1;
        } else {
            gender = 2;
        }
    }


        public void enterName (View view){

            setContentView(R.layout.melvin);
            melvinSpeaks1 = findViewById(R.id.melvinSpeak1);
            melvinText1 = findViewById(R.id.melvinText1);
            rudolphSpeaks1 = findViewById(R.id.rudolphSpeak1);
            rudolphText1 = findViewById(R.id.rudolphText1);
            reset = findViewById(R.id.resetButton);
            melvinText1.setVisibility(View.INVISIBLE);
            rudolphText1.setVisibility(View.INVISIBLE);


        }


        public void reset (View view){
            melvinText1.setVisibility(View.INVISIBLE);
            rudolphText1.setVisibility(View.INVISIBLE);


        }

        public void reset1 () {
            melvinText1.setVisibility(View.INVISIBLE);
            rudolphText1.setVisibility(View.INVISIBLE);


        }

        public void reset2 () {
            rudolphText2.setVisibility(View.INVISIBLE);
            santaText2.setVisibility(View.INVISIBLE);
        }


        public void rudolphSpeak1 (View view){



            reader = nameText1.getText().toString();
            if (gender == 1) {
                rudolphText1.setText("Don't worry Melvin, I will speak to father Christmas and see if we can write a letter to " + reader + " and see if he will let you have his dummy");
            } else {
                rudolphText1.setText("Don't worry Melvin, I will speak to father Christmas and see if we can write a letter to " + reader + " and see if she will let you have her dummy");
            }
            melvinText1.setVisibility(View.INVISIBLE);
            rudolphText1.setVisibility(View.VISIBLE);

            Log.i("Gender is", Integer.toString(gender));

        }

        public void rudolphSpeak2 (View view){

            rudolphText2.setText("Hi Father Christmas, Melvin can't sleep and I want to write a letter to " + reader + " to see if she will give her dummy to him.");

            rudolphText2.setVisibility(View.VISIBLE);
            santaText2.setVisibility(View.INVISIBLE);
        }

        public void melvinSpeak1 (View view){


            melvinText1.setVisibility(View.VISIBLE);
            rudolphText1.setVisibility(View.INVISIBLE);

        }

        public void page1 (View view){
            setContentView(R.layout.melvin);
            melvinSpeaks1 = findViewById(R.id.melvinSpeak1);
            melvinText1 = findViewById(R.id.melvinText1);
            rudolphSpeaks1 = findViewById(R.id.rudolphSpeak1);
            rudolphText1 = findViewById(R.id.rudolphText1);
            reset = findViewById(R.id.resetButton);
            reset1();
        }


        public void page2 (View view){


            setContentView(R.layout.northpole);

            rudolphText2 = findViewById(R.id.rudolphText2);
            santaText2 = findViewById(R.id.santaText2);
            rudolphSpeak2 = findViewById(R.id.rudolphSpeak2);
            santaSpeak2 = findViewById(R.id.santaSpeak2);

            melvinSpeaks1.setVisibility(View.INVISIBLE);
            rudolphSpeaks1.setVisibility(View.INVISIBLE);
            rudolphText2.setVisibility(View.INVISIBLE);
            santaText2.setVisibility(View.INVISIBLE);
        }

        //todo sort out gender he and she

        public void santaSpeak2 (View view){

            santaText2.setText(reader + " is a big girl now, I am sure she would love to help Melvin");

            santaText2.setVisibility(View.VISIBLE);
            rudolphText2.setVisibility(View.INVISIBLE);

        }

        public void page3 (View view){
            setContentView(R.layout.letter);
            reset2();
        }

        public void back2 (View view){

            setContentView(R.layout.northpole);

            rudolphText2 = findViewById(R.id.rudolphText2);
            santaText2 = findViewById(R.id.santaText2);
            rudolphSpeak2 = findViewById(R.id.rudolphSpeak2);
            santaSpeak2 = findViewById(R.id.santaSpeak2);
            reset2();


        }

        public void back3 (View view){
            setContentView(R.layout.letter);
        }

        public void page4 (View view){
            setContentView(R.layout.xmas_sky);
        }


    }

