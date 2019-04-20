package com.yl.verticalviewpager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private VerticalViewPager verticalViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        verticalViewPager = findViewById(R.id.verticalViewPager);


        verticalViewPager.addView(View.inflate(this, R.layout.layout_view1, null));

        View v2 = View.inflate(this, R.layout.layout_view2, null);
        verticalViewPager.addView(v2);

        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("eeee", "v2 setOnClickListener");
            }
        });




        verticalViewPager.setOnPageChangeListener(new VerticalViewPager.OnPageChangeListener() {
            @Override
            public void onPageChanged(int index) {
                Log.e("eeee", "onPageChanged "+index);
            }
        });
    }
}
