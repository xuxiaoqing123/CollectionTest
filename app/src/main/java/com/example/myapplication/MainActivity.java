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

import androidx.core.app.ActivityCompat;
import androidx.core.widget.TextViewCompat;
import top.canyie.pine.Pine;
import top.canyie.pine.callback.MethodHook;

public class MainActivity extends Activity {
    private static final String TAG = "MainActivity";

    TextView tv;

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

    }
}
