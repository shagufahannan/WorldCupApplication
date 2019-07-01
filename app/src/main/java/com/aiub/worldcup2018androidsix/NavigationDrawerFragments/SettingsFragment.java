package com.aiub.worldcup2018androidsix.NavigationDrawerFragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.aiub.worldcup2018androidsix.Activities.NotificationsActivity;
import com.aiub.worldcup2018androidsix.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SettingsFragment extends Fragment {

    private static final String TAG=SettingsFragment.class.getSimpleName();
    private TextView teamText;

    public SettingsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate( R.layout.fragment_settings, container, false );
        teamText=view.findViewById( R.id.teamsText );
        teamText.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent( getActivity(), NotificationsActivity.class);
                startActivity( intent );

            }
        } );
        return view;
    }

}
