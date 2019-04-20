## 说明文档
    
 
### 1.两种方式添加内容布局
    
##### (1).直接在布局中添加数个view或viewgroup
```
<com.ywj.verticalviewpager.VerticalViewPager
    android:id="@+id/verticalViewPager"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical">
    
        <TextView
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:background="#0ff"
            android:gravity="center"
            android:text="00000" />

    </LinearLayout>

    <TextView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="#0ff"
        android:gravity="center"
        android:text="000002" />
</com.ywj.verticalviewpager.VerticalViewPager>
```
##### (2).在代码中动态添加
```
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    VerticalViewPager verticalViewPager = findViewById(R.id.verticalViewPager);

    verticalViewPager.addView(View.inflate(this, R.layout.layout_view1, null));
    verticalViewPager.addView(View.inflate(this, R.layout.layout_view2, null));
}
```
### 2.事件监听

```
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
```
    

### LICENSE
```
Copyright 2017 Will

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
