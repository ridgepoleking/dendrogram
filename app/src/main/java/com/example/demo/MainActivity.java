package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.demo.util.PColumn;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static List<Long> mData;        //  数据值
    private static List<String> mNames;     //  数据姓名

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  柱形图--参考CSDN-anthor:^phoenix
        initSQLiteTwo();
        PColumn pColumn = new PColumn(mData,mNames);    //  将数据源传递给自定义柱形图类
    }
    private void initSQLiteTwo() {
        //初始化数据
        mData = new ArrayList<>();
        mNames = new ArrayList<>();
        mData = new ArrayList<>();
        mNames = new ArrayList<>();

        mData.add((long) 60);
        mData.add((long) 40);
        mData.add((long) 80);
        mData.add((long) 20);
        mNames.add("java");
        mNames.add("php");
        mNames.add("android");
        mNames.add("c");
    }
}
