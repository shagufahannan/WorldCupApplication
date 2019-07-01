package com.aiub.worldcup2018androidsix.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.aiub.worldcup2018androidsix.R;

public class SettingsActivity extends AppCompatActivity {
    private static final String TAG=SettingsActivity.class.getSimpleName();
    private TextView teamText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        teamText=findViewById( R.id.teamsText );
    }
}
