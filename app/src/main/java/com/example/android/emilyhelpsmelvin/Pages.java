package com.example.android.emilyhelpsmelvin;

import android.view.View;

public class Pages extends MainActivity {

    public void page1 (View view) {
        setContentView(R.layout.melvin);
        rudolphText1.setVisibility(View.INVISIBLE);
        melvinText1.setVisibility(View.INVISIBLE);
    }


    public void page2 (View view) {


        setContentView(R.layout.northpole);

        rudolphText2 = findViewById(R.id.rudolphText2);
        santaText2 = findViewById(R.id.santaText2);
        rudolphSpeak2 = findViewById(R.id.rudolphSpeak2);
        santaSpeak2 = findViewById(R.id.santaSpeak2);

        rudolphText2.setVisibility(View.INVISIBLE);
        santaText2.setVisibility(View.INVISIBLE);
    }

    public void santaSpeak2 (View view) {

        santaText2.setVisibility(View.VISIBLE);
        rudolphText2.setVisibility(View.INVISIBLE);

    }

    public void page3 (View view) {
        setContentView(R.layout.xmas_sky);
    }

    public void back2 (View view) {
        setContentView(R.layout.northpole);

    }
}
