package com.example.harpatel.androidworkshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button add_btn;
        add_btn = (Button) findViewById(R.id.add_btn);

        Button sub_btn = (Button) findViewById(R.id.sub_btn);
        Button multi_btn = (Button) findViewById(R.id.multi_btn);
        Button div_btn = (Button) findViewById(R.id.div_btn);

        final EditText num_one = (EditText) findViewById(R.id.num_one);
        final EditText num_two = (EditText) findViewById(R.id.num_two);

        final TextView ans = (TextView) findViewById(R.id.ans);

        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int num1 = Integer.parseInt(num_one.getText().toString());
                int num2 = Integer.parseInt(num_two.getText().toString());

                int result = num1 + num2;

                ans.setText(result+"");

            }
        });

        sub_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int num1 = Integer.parseInt(num_one.getText().toString());
                int num2 = Integer.parseInt(num_two.getText().toString());

                int result = num1 - num2;

                ans.setText(result+"");

            }

        });


        multi_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int num1 = Integer.parseInt(num_one.getText().toString());
                int num2 = Integer.parseInt(num_two.getText().toString());

                int result = num1 * num2;

                ans.setText(result+"");

            }
        });

        div_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int num1 = Integer.parseInt(num_one.getText().toString());
                int num2 = Integer.parseInt(num_two.getText().toString());

                int result = num1 / num2;

                ans.setText(result+"");
            }
        });

    }
}
