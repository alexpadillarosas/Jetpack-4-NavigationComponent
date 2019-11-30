package com.blueradix.android.jetpack_4_navigationcomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements  DragonsFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //this is to return to the regular AppTheme, so do it before super call, do not forget to modify
        //the manifest to add android:theme="@style/SplashTheme" to the main activity. also create SplashTheme
        //in styles.xml adding the splash image there.
        setTheme(R.style.AppTheme);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        /*
        This code has been commented out to avoid loading main_fragment.xml as now we will use
        the navigation component.
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }
         */


    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
