package com.ywj.verticalviewpager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VerticalViewPager verticalViewPager = findViewById(R.id.verticalViewPager);

        verticalViewPager.addView(View.inflate(this, R.layout.layout_view1, null));
        verticalViewPager.addView(View.inflate(this, R.layout.layout_view2, null));

        View v3 = View.inflate(this, R.layout.layout_view3, null);
        verticalViewPager.addView(v3);

        /*点击事件*/
        v3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("eeee", "v3 onClick");
            }
        });

        /*页面改变监听*/
        verticalViewPager.setOnPageChangeListener(new VerticalViewPager.OnPageChangeListener() {
            @Override
            public void onPageChanged(int index) {
                Log.e("eeee", "onPageChanged "+index);
            }
        });
    }
}
