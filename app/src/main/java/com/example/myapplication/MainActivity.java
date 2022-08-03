package com.example.myapplication;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.fastjson.JSONObject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import androidx.core.app.ActivityCompat;
import androidx.core.widget.TextViewCompat;
import top.canyie.pine.Pine;
import top.canyie.pine.callback.MethodHook;

public class MainActivity extends Activity {
    private static final String TAG = "MainActivity";

    TextView tv;

//    private static ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<Integer, Integer>();
    private static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "Activity onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.hello);

    }

    @Override
    protected void onResume() {
        Log.d(TAG, "Activity onResume");
        super.onResume();

        testConcurrentHashMap();
    }

    /**
     * 验证ConcurrentHashMap
     *
     */
    private void testConcurrentHashMap() {
        new Thread("Thread1"){
            @Override
            public void run() {
                map.put(3, 33);
//                System.out.println(map);
            }
        }.run();

        new Thread("Thread2"){
            @Override
            public void run() {
                map.put(4, 44);
//                System.out.println(map);
            }
        }.run();

        new Thread("Thread3"){
            @Override
            public void run() {
                map.put(7, 77);
//                System.out.println(map);
            }
        }.run();
        System.out.println(map);
    }
}
