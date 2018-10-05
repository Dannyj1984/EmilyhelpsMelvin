package com.example.android.emilyhelpsmelvin;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Rudolph extends MainActivity {


    public void rudolphSpeak1 (View view) {
        melvinText1.setVisibility(View.INVISIBLE);
        rudolphText1.setVisibility(View.VISIBLE);

    }

    public void rudolphSpeak2 (View view) {

        rudolphText2.setVisibility(View.VISIBLE);
        santaText2.setVisibility(View.INVISIBLE);
    }

}
