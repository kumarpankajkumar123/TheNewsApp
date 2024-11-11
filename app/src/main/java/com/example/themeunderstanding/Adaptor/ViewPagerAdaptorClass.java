package com.example.themeunderstanding.Adaptor;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.themeunderstanding.Fragmentation.FirstFragment;
import com.example.themeunderstanding.Fragmentation.SecondFragement;
import com.example.themeunderstanding.Fragmentation.ThirdFragment;

public class ViewPagerAdaptorClass extends FragmentStateAdapter {
    public ViewPagerAdaptorClass(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        if(position == 0){
            FirstFragment first = new FirstFragment();
            return first;
        } else if (position == 1) {
            SecondFragement second = new SecondFragement();
            return second;
        }
        else {
            ThirdFragment third = new ThirdFragment();
            return third;
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
