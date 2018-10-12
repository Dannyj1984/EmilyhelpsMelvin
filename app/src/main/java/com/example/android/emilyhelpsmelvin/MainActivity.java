package com.example.android.emilyhelpsmelvin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Set;

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
    EditText nameText1;
    String reader;
    int gender = 1;
    RadioGroup rg;
    ImageView rudolph1;
    ImageView melvin1;
    ImageView rudolph2;
    ImageView santa2;
    TextView letter3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.start);
        rg = findViewById(R.id.rg1);
        nameText1 = findViewById(R.id.nameText1);


    }


    public void reset(View view) {


                setContentView(R.layout.start);
                gender = 0;
                reader = "";
                rg.clearCheck();
                Log.i("Gender", Integer.toString(gender));
                Log.i("name", reader);


            }


            public void enterName(View view) {


                setContentView(R.layout.melvin);
                melvinSpeaks1 = findViewById(R.id.melvinSpeak1);
                melvinText1 = findViewById(R.id.melvinText1);
                rudolphSpeaks1 = findViewById(R.id.rudolphSpeak1);
                rudolphText1 = findViewById(R.id.rudolphText1);
                melvin1 = findViewById(R.id.melvinBubble);
                rudolph1 = findViewById(R.id.rudolphBubble);
                reset = findViewById(R.id.resetButton);
                melvinText1.setVisibility(View.INVISIBLE);
                rudolphText1.setVisibility(View.INVISIBLE);
                rudolph1.setVisibility(View.INVISIBLE);
                melvin1.setVisibility(View.INVISIBLE);



            }
            public void onRadioButtonClicked(View view) {
        if (rg.getCheckedRadioButtonId()== R.id.boyButton) {
            gender = 1;

        } else {
            gender = 2;
        }
            }



            public void reset1() {
                melvinText1.setVisibility(View.INVISIBLE);
                rudolphText1.setVisibility(View.INVISIBLE);


            }

            public void reset2() {
                rudolphText2.setVisibility(View.INVISIBLE);
                santaText2.setVisibility(View.INVISIBLE);
                santa2.setVisibility(View.INVISIBLE);
                rudolph2.setVisibility(View.INVISIBLE);
            }

            public void melvinSpeak1(View view) {


                melvinText1.setVisibility(View.VISIBLE);
                melvin1.setVisibility(View.VISIBLE);
                rudolphText1.setVisibility(View.INVISIBLE);

            }


            public void rudolphSpeak1(View view) {

                rudolphText1.setVisibility(View.VISIBLE);
                rudolph1.setVisibility(View.VISIBLE);


            }

            public void rudolphSpeak2(View view) {

                reader = nameText1.getText().toString();


                if (gender == 1) {

                    rudolphText2.setText("Hi Father Christmas, Melvin can't sleep and I want to write a letter to " + reader + " to see if he will give his dummy to him.");
                } else {
                    rudolphText2.setText("Hi Father Christmas, Melvin can't sleep and I want to send a letter to " + reader + " to see if she will give her dummy to him.");
                }
                rudolphText2.setVisibility(View.VISIBLE);
                rudolph2.setVisibility(View.VISIBLE);

            }


            //todo sort out gender he and she

            public void santaSpeak2(View view) {

                if (gender == 1) {

                    santaText2.setText(reader + " is a big boy now, I am sure he would love to help Melvin.");
                } else {
                    santaText2.setText(reader + " is a big girl now. I am sure she would love to help Melvin.");
                }

                santaText2.setVisibility(View.VISIBLE);
                santa2.setVisibility(View.VISIBLE);


            }

            public void page1(View view) {
                setContentView(R.layout.melvin);
                melvinSpeaks1 = findViewById(R.id.melvinSpeak1);
                melvinText1 = findViewById(R.id.melvinText1);
                rudolphSpeaks1 = findViewById(R.id.rudolphSpeak1);
                rudolphText1 = findViewById(R.id.rudolphText1);
                reset = findViewById(R.id.resetButton);
                reset1();
            }


            public void page2(View view) {


                setContentView(R.layout.northpole);

                rudolphText2 = findViewById(R.id.rudolphText2);
                santaText2 = findViewById(R.id.santaText2);
                rudolphSpeak2 = findViewById(R.id.rudolphSpeak2);
                santaSpeak2 = findViewById(R.id.santaSpeak2);
                rudolph2 = findViewById(R.id.rudolphBubble2);
                santa2 = findViewById(R.id.santaBubble2);

                melvinSpeaks1.setVisibility(View.INVISIBLE);
                rudolphSpeaks1.setVisibility(View.INVISIBLE);
                rudolphText2.setVisibility(View.INVISIBLE);
                santaText2.setVisibility(View.INVISIBLE);
                rudolph2.setVisibility(View.INVISIBLE);
                santa2.setVisibility(View.INVISIBLE);
            }


            public void page3(View view) {
                setContentView(R.layout.letter);
                letter3 = findViewById(R.id.letterText);

                letter3.setText("Dear " + reader + ",                              Melvin the baby reindeer is struggling to sleep at night time. I wanted to ask if he could have your dummy to help him sleep. In return I will leave you a very special present. Love from Father Christmas and Rudolph");


            }

            public void back2(View view) {

                setContentView(R.layout.northpole);

                rudolphText2 = findViewById(R.id.rudolphText2);
                santaText2 = findViewById(R.id.santaText2);
                rudolphSpeak2 = findViewById(R.id.rudolphSpeak2);
                santaSpeak2 = findViewById(R.id.santaSpeak2);
                reset2();


            }


            public void page4(View view) {
                if (gender == 1) {
                    setContentView(R.layout.boy);
                } else {
                    setContentView(R.layout.girl);
                }
            }

            public void page3Back(View view) {
                setContentView(R.layout.letter);
            }

            public void page4Back(View view) {
                if (gender == 1) {
                    setContentView(R.layout.boy);
                } else {
                    setContentView(R.layout.girl);
                }

            }

            public void page5(View view) {

                setContentView(R.layout.xmas_sky);
            }


        }

