package com.example.harpatel.hellohar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.colorButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.colorAccent));

            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.RootView).setBackgroundColor(getResources().getColor(R.color.Purple));
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //grab text user inputted
                String newText = ((EditText)findViewById(R.id.editText)).getText().toString();

                if(TextUtils.isEmpty(newText)) {
                    ((TextView) findViewById(R.id.textView)).setText("Hello from Har!");
                }else{
                    ((TextView) findViewById(R.id.textView)).setText(newText);
                }

                //put text into our text view when button is pressed

            }

        });

        findViewById(R.id.RootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //reset text color
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.black));
                //reset background
                findViewById(R.id.RootView).setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                //reset Text
                ((TextView) findViewById(R.id.textView)).setText("Hello from Har!");


            }
        });
    }
}