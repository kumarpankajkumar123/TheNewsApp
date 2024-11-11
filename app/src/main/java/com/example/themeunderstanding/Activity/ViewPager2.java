package com.example.themeunderstanding.Activity;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.example.themeunderstanding.Adaptor.ViewPagerAdaptorClass;
import com.example.themeunderstanding.R;

import java.util.ArrayList;
import java.util.List;

public class ViewPager2 extends AppCompatActivity {

    androidx.viewpager2.widget.ViewPager2 view_pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager2);

        view_pager = findViewById(R.id.view_pager);
        ViewPagerAdaptorClass adaptor = new ViewPagerAdaptorClass(getSupportFragmentManager(),getLifecycle());
        view_pager.setAdapter(adaptor);

    }
}