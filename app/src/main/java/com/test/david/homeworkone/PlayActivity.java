package com.test.david.homeworkone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.net.Uri;

public class PlayActivity extends AppCompatActivity implements PlayFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        getFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, PlayFragment.newInstance(null, null))
                .addToBackStack(null)
                .commit();
    }

    public void onFragmentInteraction(Uri uri){

    }
}
