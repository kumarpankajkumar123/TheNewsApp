package com.example.themeunderstanding.Activity;

import android.content.Intent;
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
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.List;

public class ViewPager2 extends AppCompatActivity {

    androidx.viewpager2.widget.ViewPager2 view_pager;
     MaterialButton nextButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager2);

        view_pager = findViewById(R.id.view_pager);
        nextButton = findViewById(R.id.next);
//        ViewPagerAdaptorClass adaptor = new ViewPagerAdaptorClass(getSupportFragmentManager(),getLifecycle());
        ViewPagerAdaptorClass adaptor = new ViewPagerAdaptorClass(this);
        view_pager.setAdapter(adaptor);

        nextButton.setOnClickListener(v -> {
            int currentItem = view_pager.getCurrentItem();
            if (currentItem < adaptor.getItemCount() - 1) {
                view_pager.setCurrentItem(currentItem + 1); // Move to the next page
            } else {
                // Navigate to MainActivity if on the last page
                startActivity(new Intent(ViewPager2.this, MainActivity.class));
                finish();
            }
        });

       view_pager.registerOnPageChangeCallback(new androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback() {
           @Override
           public void onPageSelected(int position) {
               super.onPageSelected(position);

               if (position == adaptor.getItemCount() - 1) {
                   findViewById(R.id.next).setOnClickListener(v -> {
                       // Set a flag to avoid showing onboarding again
                       getSharedPreferences("Onboarding", MODE_PRIVATE).edit().putBoolean("isFirstTime", false).apply();
                       startActivity(new Intent(ViewPager2.this, MainActivity.class));
                       finish();
                   });
               }
           }
       });

    }
}