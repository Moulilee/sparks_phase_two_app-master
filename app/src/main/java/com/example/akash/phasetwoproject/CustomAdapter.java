package com.example.akash.phasetwoproject;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.akash.phasetwoproject.fragment.EducationalDetailsFragment;
import com.example.akash.phasetwoproject.fragment.PersonalDetailsFragment;
import com.example.akash.phasetwoproject.fragment.ProfessionalDetailsFragment;

import java.util.List;

public class CustomAdapter extends FragmentStatePagerAdapter {

    private static final int ITEMS = 3;
    private List<Fragment> mFragmentList;
    private List<String> mFragmentTitleList;

    public CustomAdapter(FragmentManager fm, List<Fragment> fragments, List<String> title) {
        super(fm);
        this.mFragmentList = fragments;
        this.mFragmentTitleList = title;
    }

    @Override
    public Fragment getItem(int i) {
        return mFragmentList.get(i);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitleList.get(position);
    }
}
