package com.baozilichao.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initView1();

    }

    private void initView() {
        Log.e("dgdfg", "initView: " + 111111);
    }

    private void initView1() {
        Log.e("dgdfg", "initView: " + 111111);
    }
}
