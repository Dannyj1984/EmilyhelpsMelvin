package com.example.android.emilyhelpsmelvin;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Melvin extends MainActivity {

    Button melvinSpeaks1;
    TextView melvinText1;

    public void melvinSpeak1 (View view) {


        melvinText1.setVisibility(View.VISIBLE);
        rudolphText1.setVisibility(View.INVISIBLE);

    }
}
