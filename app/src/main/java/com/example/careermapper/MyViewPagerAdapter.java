package com.example.careermapper;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.careermapper.fragmentactivity.FirstFragment;
import com.example.careermapper.fragmentactivity.SecondFragment;
import com.example.careermapper.fragmentactivity.ThirdFragment;
import com.example.careermapper.fragmentactivity.FirstFragment;
import com.example.careermapper.fragmentactivity.SecondFragment;
import com.example.careermapper.fragmentactivity.ThirdFragment;

public class MyViewPagerAdapter extends FragmentStateAdapter {
    public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
            default:
                return new FirstFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }

}
