package com.example.myapplication_speechremote;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ediText;

    Button buttonConvert;

    TextToSpeech textToSpeech;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ediText = findViewById(R.id.ediText);
        buttonConvert = findViewById(R.id.buttonConvert);
        textToSpeech = new TextToSpeech(MainActivity.this, new TextToSpeech.OnInitListener()  {
            @Override
            public void onInit(int i) {

            }
        });

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textToSpeech.speak(""+ediText.getText().toString(), TextToSpeech.QUEUE_FLUSH, null, null);

            }
        });
    }
}