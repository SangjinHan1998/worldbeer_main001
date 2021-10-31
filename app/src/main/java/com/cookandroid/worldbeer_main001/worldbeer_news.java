package com.cookandroid.worldbeer_main001;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class worldbeer_news extends AppCompatActivity {

    private ImageButton News001;
    private ImageButton News002;
    private ImageButton News003;
    private ImageButton News004;
    private ImageButton News005;

    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btn_4;
    Button btn_5;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.worldbeer_news003);

        News001 = findViewById(R.id.BtnNews001);
        News002 = findViewById(R.id.BtnNews002);
        News003 = findViewById(R.id.BtnNews003);
        News004 = findViewById(R.id.BtnNews004);
        News005 = findViewById(R.id.BtnNews005);


        News001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),NewsButton001.class);
                startActivity(intent);
            }
        });

        News002.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),NewsButton002.class);
                startActivity(intent);
            }
        });

        News003.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),NewsButton003.class);
                startActivity(intent);
            }
        });

        News004.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),NewsButton004.class);
                startActivity(intent);
            }
        });

        News005.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),NewsButton005.class);
                startActivity(intent);
            }
        });

    // 하단 버튼




        // 버튼 1. 홈

        Button btn_1 = (Button) findViewById(R.id.btn_1);
        btn_1.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        // 버튼 2. 메뉴

        Button btn_2 = (Button) findViewById(R.id.btn_2);
        btn_2.setOnClickListener(new View.OnClickListener()

        {


            @Override
            public void onClick (View view){
                Intent intent = new Intent(getApplicationContext(), worldbeer_menu.class);
                startActivity(intent);
            }
        });

        // 버튼 3. 뉴스

        Button btn_3 = (Button) findViewById(R.id.btn_3);
        btn_3.setOnClickListener(new View.OnClickListener()

        {


            @Override
            public void onClick (View view){
                Intent intent = new Intent(getApplicationContext(), worldbeer_news.class);
                startActivity(intent);
            }
        });

        // 버튼 4. 지도

        Button btn_4 = (Button) findViewById(R.id.btn_4);
        btn_4.setOnClickListener(new View.OnClickListener()

        {


            @Override
            public void onClick (View view){
                Intent intent = new Intent(getApplicationContext(), worldbeer_map.class);
                startActivity(intent);
            }
        });

        // 버튼 5. 회원

        Button btn_5 = (Button) findViewById(R.id.btn_5);
        btn_5.setOnClickListener(new View.OnClickListener()

        {


            @Override
            public void onClick (View view){
                Intent intent = new Intent(getApplicationContext(), worldbeer_member.class);
                startActivity(intent);
            }
        });
    }

}
