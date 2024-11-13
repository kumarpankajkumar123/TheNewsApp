package com.example.themeunderstanding.Activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.themeunderstanding.R;

public class UiDesign extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui_design);

        getWindow().setNavigationBarColor(Color.TRANSPARENT);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean isFirstTime = getSharedPreferences("Onboarding", MODE_PRIVATE).getBoolean("isFirstTime", true);
                Intent intent = new Intent(UiDesign.this, isFirstTime ? ViewPager2.class : MainActivity.class);
                startActivity(intent);
                finish();
            }
        },2000);

    }
}