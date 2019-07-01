package com.aiub.worldcup2018androidsix.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.aiub.worldcup2018androidsix.ViewPagerFragments.MatchScheduleFragment;
import com.aiub.worldcup2018androidsix.ViewPagerFragments.MatchesFragment;
import com.aiub.worldcup2018androidsix.ViewPagerFragments.TablesFragment;

public class WCFragmentPagerAdapter extends FragmentPagerAdapter {
    public WCFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
                return new MatchScheduleFragment();
            case 1:
                return new MatchesFragment();
            case 2:
                return new TablesFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
@Override

public CharSequence getPageTiltle (int position)
