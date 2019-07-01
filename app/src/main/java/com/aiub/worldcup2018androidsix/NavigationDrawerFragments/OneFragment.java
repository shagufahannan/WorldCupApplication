package com.aiub.worldcup2018androidsix.NavigationDrawerFragments;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aiub.worldcup2018androidsix.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class OneFragment extends Fragment {

    private ViewPager viewPager;
   private TabLayout tabLayout;
    public OneFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_one, container, false);

        viewPager=view.findViewById( R.id.viewPager );
        tabLayout=view.findViewById( R.id.tabLayout );
        return view;
    }

}
