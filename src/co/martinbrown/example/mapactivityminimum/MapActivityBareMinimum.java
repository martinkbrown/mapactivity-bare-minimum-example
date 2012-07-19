package co.martinbrown.example.mapactivityminimum;

import android.os.Bundle;

import com.google.android.maps.MapActivity;

public class MapActivityBareMinimum extends MapActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    @Override
    protected boolean isRouteDisplayed() {
        return false;
    }


}