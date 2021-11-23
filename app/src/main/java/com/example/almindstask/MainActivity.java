package com.example.almindstask;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageButton ib_a, ib_b, ib_c;
    TextView tv_a, tv_b, tv_c;
    ImageView iv_circle;

    int a = 0;
    int b = 0;
    int c = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ib_a = (ImageButton) findViewById(R.id.ib_a);
        ib_b = (ImageButton) findViewById(R.id.ib_b);
        ib_c = (ImageButton) findViewById(R.id.ib_c);
        tv_a = (TextView) findViewById(R.id.tv_a);
        tv_b = (TextView) findViewById(R.id.tv_b);
        tv_c = (TextView) findViewById(R.id.tv_c);
        iv_circle = (ImageView) findViewById(R.id.iv_circle);


        ib_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!ib_a.isShown()) {
                    ib_a.setVisibility(View.GONE);
                    tv_a.setVisibility(View.GONE);

                } else {
                    ib_a.setVisibility(View.VISIBLE);
                    tv_a.setVisibility(View.VISIBLE);
                }


            }
        });


        ib_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!ib_a.isShown() && !ib_b.isShown()) {
                    ib_b.setVisibility(View.GONE);
                    tv_b.setVisibility(View.GONE);

                } else {
                    ib_b.setVisibility(View.VISIBLE);
                    tv_b.setVisibility(View.VISIBLE);
                }
            }
        });

        ib_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!ib_a.isShown() && !ib_b.isShown() && !ib_c.isShown()) {
                    ib_c.setVisibility(View.GONE);
                    tv_c.setVisibility(View.GONE);

                } else {
                    ib_c.setVisibility(View.VISIBLE);
                    tv_c.setVisibility(View.VISIBLE);
                    iv_circle.setVisibility(View.VISIBLE);
                }
            }
        });


    }
}