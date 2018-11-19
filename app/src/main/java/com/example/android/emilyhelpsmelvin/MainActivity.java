package com.example.android.emilyhelpsmelvin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;

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
    int gender = 1;
    RadioGroup rg;
    ImageView rudolphBubble1;
    ImageView melvinBubble1;
    ImageView rudolphBubble2;
    ImageView santaBubble2;
    TextView letter3;
    ImageView boyBubble4;
    TextView boyText4;
    ImageView girlBubble4;
    TextView girlText4;
    TextView boyText6;
    ImageView boyBubble6;
    TextView girlText6;
    ImageView girlBubble6;
    TextView melvinText8;
    ImageView melvinBubble8;
    TextView rudolphtext8;
    ImageView rudolphBubble8;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.start);
        rg = findViewById(R.id.rg1);
        nameText1 = findViewById(R.id.nameText1);

        nameText1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                String reader = nameText1.getText().toString();

                Log.i("name", reader);


            }
        });


    }


    public void reset(View view) {


        setContentView(R.layout.start);
        gender = 0;


        rg.clearCheck();
        Log.i("Gender", Integer.toString(gender));


    }


    public void enterName(View view) {


        setContentView(R.layout.melvin1);
        melvinSpeaks1 = findViewById(R.id.melvinSpeak1);
        melvinText1 = findViewById(R.id.melvinText1);
        rudolphSpeaks1 = findViewById(R.id.rudolphSpeak1);
        rudolphText1 = findViewById(R.id.rudolphText1);
        melvinBubble1 = findViewById(R.id.melvinBubble1);
        rudolphBubble1 = findViewById(R.id.rudolphBubble1);
        reset = findViewById(R.id.resetButton);
        melvinText1.setVisibility(View.INVISIBLE);
        rudolphText1.setVisibility(View.INVISIBLE);
        rudolphBubble1.setVisibility(View.INVISIBLE);
        melvinBubble1.setVisibility(View.INVISIBLE);


    }

    public void onRadioButtonClicked(View view) {
        if (rg.getCheckedRadioButtonId() == R.id.boyButton) {
            gender = 1;

        } else if (rg.getCheckedRadioButtonId() == R.id.girlButton) {
            gender = 2;
        }
    }


    public void reset1() {
        melvinText1.setVisibility(View.INVISIBLE);
        rudolphText1.setVisibility(View.INVISIBLE);
        rudolphBubble1.setVisibility(View.INVISIBLE);
        melvinBubble1.setVisibility(View.INVISIBLE);


    }

    public void reset2() {
        rudolphText2.setVisibility(View.INVISIBLE);
        santaText2.setVisibility(View.INVISIBLE);
        santaBubble2.setVisibility(View.INVISIBLE);
        rudolphBubble2.setVisibility(View.INVISIBLE);
    }

    public void melvinSpeak1(View view) {


        melvinText1.setVisibility(View.VISIBLE);
        melvinBubble1.setVisibility(View.VISIBLE);


    }


    public void rudolphSpeak1(View view) {

        rudolphText1.setVisibility(View.VISIBLE);
        rudolphBubble1.setVisibility(View.VISIBLE);


    }

    public void rudolphSpeak2(View view) {

        String reader = nameText1.getText().toString();


        if (gender == 1) {

            rudolphText2.setText("Hi Father Christmas, Melvin can't sleep and I want to write a letter to " + reader + " to see if he will give his dummy to him.");
        } else {
            rudolphText2.setText("Hi Father Christmas, Melvin can't sleep and I want to send a letter to " + reader + " to see if she will give her dummy to him.");
        }
        rudolphText2.setVisibility(View.VISIBLE);
        rudolphBubble2.setVisibility(View.VISIBLE);

    }


    

    public void santaSpeak2(View view) {

        String reader = nameText1.getText().toString();

        if (gender == 1) {

            santaText2.setText(reader + " is a big boy now, I am sure he would love to help Melvin.");
        } else {
            santaText2.setText(reader + " is a big girl now. I am sure she would love to help Melvin.");
        }

        santaText2.setVisibility(View.VISIBLE);
        santaBubble2.setVisibility(View.VISIBLE);


    }

    public void page1(View view) {
        setContentView(R.layout.melvin1);
        melvinSpeaks1 = findViewById(R.id.melvinSpeak1);
        melvinText1 = findViewById(R.id.melvinText1);
        rudolphSpeaks1 = findViewById(R.id.rudolphSpeak1);
        rudolphText1 = findViewById(R.id.rudolphText1);
        melvinBubble1 = findViewById(R.id.melvinBubble1);
        rudolphBubble1 = findViewById(R.id.rudolphBubble1);
        reset = findViewById(R.id.resetButton);
        reset1();
    }


    public void page2(View view) {


        setContentView(R.layout.northpole);

        rudolphText2 = findViewById(R.id.rudolphText2);
        santaText2 = findViewById(R.id.santaText2);
        rudolphSpeak2 = findViewById(R.id.rudolphSpeak2);
        santaSpeak2 = findViewById(R.id.santaSpeak2);
        rudolphBubble2 = findViewById(R.id.rudolphBubble2);
        santaBubble2 = findViewById(R.id.santaBubble2);

        melvinSpeaks1.setVisibility(View.INVISIBLE);
        rudolphSpeaks1.setVisibility(View.INVISIBLE);
        rudolphText2.setVisibility(View.INVISIBLE);
        santaText2.setVisibility(View.INVISIBLE);
        rudolphBubble2.setVisibility(View.INVISIBLE);
        santaBubble2.setVisibility(View.INVISIBLE);
    }


    public void page3(View view) {
        setContentView(R.layout.letter2);

        String reader = nameText1.getText().toString();
        letter3 = findViewById(R.id.letterText);

        letter3.setText("Dear " + reader + ",                              Melvin the baby reindeer is struggling to sleep at night time. I wanted to ask if he could have your dummy to help him sleep. In return I will leave you a very special present. Love from Father Christmas and Rudolph");
        letter3.setVisibility(View.INVISIBLE);


    }

    public void letter(View v) {
        letter3.setVisibility(View.VISIBLE);

    }

    public void back2(View view) {

        setContentView(R.layout.northpole);

        rudolphText2 = findViewById(R.id.rudolphText2);
        santaText2 = findViewById(R.id.santaText2);
        rudolphBubble2 = findViewById(R.id.rudolphBubble2);
        santaBubble2 = findViewById(R.id.santaBubble2);
        rudolphSpeak2 = findViewById(R.id.rudolphSpeak2);
        santaSpeak2 = findViewById(R.id.santaSpeak2);
        reset2();


    }


    public void page4(View view) {
        if (gender == 1) {
            setContentView(R.layout.boy3);
            boyBubble4 = findViewById(R.id.boyBubble4);
            boyText4 = findViewById(R.id.boyText4);
            boyBubble4.setVisibility(View.INVISIBLE);
            boyText4.setVisibility(View.INVISIBLE);

        } else {
            setContentView(R.layout.girl3);
            girlText4 = findViewById(R.id.girlText4);
            girlBubble4 = findViewById(R.id.girlBubble4);
            girlBubble4.setVisibility(View.INVISIBLE);
            girlText4.setVisibility(View.INVISIBLE);
        }
    }

    public void girlSpeak4(View v) {

        girlBubble4.setVisibility(View.VISIBLE);
        girlText4.setVisibility(View.VISIBLE);
    }

    public void boySpeak4(View v) {

        boyBubble4.setVisibility(View.VISIBLE);
        boyText4.setVisibility(View.VISIBLE);
    }

    public void page3Back(View view) {
        setContentView(R.layout.letter2);
    }

    public void page4Back(View view) {
        if (gender == 1) {
            setContentView(R.layout.boy3);

        } else {
            setContentView(R.layout.girl3);
        }

    }

    public void page5(View view) {

        setContentView(R.layout.xmas_sky4);
    }


    public void page6(View v) {

        if (gender == 1) {
            setContentView(R.layout.boy_blanket5);
            boyBubble6 = findViewById(R.id.boyBubble6);
            boyText6 = findViewById(R.id.boyText6);
            boyText6.setVisibility(View.INVISIBLE);
            boyBubble6.setVisibility(View.INVISIBLE);
        } else {
            setContentView(R.layout.girl_blanket5);
            girlText6 = findViewById(R.id.girlText6);
            girlBubble6 = findViewById(R.id.girlBubble6);
            girlText6.setVisibility(View.INVISIBLE);
            girlBubble6.setVisibility(View.INVISIBLE);

        }

    }

    public void girlSpeak6(View v) {

        girlBubble6.setVisibility(View.VISIBLE);
        girlText6.setVisibility(View.VISIBLE);
    }

    public void boySpeak6(View view) {
        boyText6.setVisibility(View.VISIBLE);
        boyBubble6.setVisibility(View.VISIBLE);
    }

    public void page6Back(View view) {
        setContentView(R.layout.xmas_sky4);
    }

    public void page7Back(View v) {
        if (gender == 1) {
            setContentView(R.layout.boy_blanket5);
            boyText6.setVisibility(View.INVISIBLE);
            boyBubble6.setVisibility(View.INVISIBLE);
        } else {
            setContentView(R.layout.girl_blanket5);
            girlText6.setVisibility(View.INVISIBLE);
            girlBubble6.setVisibility(View.INVISIBLE);
        }

    }

    public void page8(View v) {
        setContentView(R.layout.melvin_sleep6);
        melvinBubble8 = findViewById(R.id.melvinBubble8);
        melvinText8 = findViewById(R.id.melvinText8);
        rudolphBubble8 = findViewById(R.id.rudolphBubble8);
        rudolphtext8 = findViewById(R.id.rudolphText8);
        rudolphtext8.setVisibility(View.INVISIBLE);
        rudolphBubble8.setVisibility(View.INVISIBLE);
        melvinBubble8.setVisibility(View.INVISIBLE);
        melvinText8.setVisibility(View.INVISIBLE);


    }

    public void melvinSpeak8(View view) {
        melvinText8.setVisibility(View.VISIBLE);
        melvinBubble8.setVisibility(View.VISIBLE);

    }

    public void rudolphSpeak8(View view) {

        String reader = nameText1.getText().toString();
        rudolphtext8.setText("Thank you " + reader + " Melvin is fast asleep now. I hope you love your blanket.");

        rudolphBubble8.setVisibility(View.VISIBLE);
        rudolphtext8.setVisibility(View.VISIBLE);

    }



}

