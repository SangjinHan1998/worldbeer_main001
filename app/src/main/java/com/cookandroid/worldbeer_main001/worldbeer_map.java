package com.cookandroid.worldbeer_main001;

import android.content.Intent;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class worldbeer_map extends AppCompatActivity {

    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btn_4;
    Button btn_5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.worldbeer_map004);

        // 네이버지도 링크




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

        //네이버
        TextView nabtn = (TextView) findViewById(R.id.mapLink);
        String text = "네이버지도 ";
        nabtn.setText(text);

        Linkify.TransformFilter linktest = new Linkify.TransformFilter() {
            @Override
            public String transformUrl(Matcher match, String url) {
                return "";
            }
        };
        Pattern pattern = Pattern.compile("네이버지도");
        Linkify.addLinks(nabtn, pattern, "https://m.place.naver.com/place/31825964/location?subtab=location", null, linktest);

    }

}
