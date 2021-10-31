package com.cookandroid.worldbeer_main001;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;


public class worldbeer_menu extends AppCompatActivity {

    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btn_4;
    Button btn_5;


    TabLayout tabLayout;
    ViewPager2 pager2;
    MenuAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.worldbeer_menu002);


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


    // ViewpagerAdapter


        tabLayout = findViewById(R.id.tab_layout);
        pager2 = findViewById(R.id.view_pager2);

        FragmentManager fm = getSupportFragmentManager();
        adapter = new MenuAdapter(fm, getLifecycle());
        pager2.setAdapter(adapter);

        tabLayout.addTab(tabLayout.newTab().setText("튀김/볶음"));
        tabLayout.addTab(tabLayout.newTab().setText("마른안주"));
        tabLayout.addTab(tabLayout.newTab().setText("국물안주"));
        tabLayout.addTab(tabLayout.newTab().setText("세계맥주"));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {    // 선택 o -> 선택

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {    // 선택 o -> 선택 o

            }


        });

        pager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));

            }
        });
    }
}
