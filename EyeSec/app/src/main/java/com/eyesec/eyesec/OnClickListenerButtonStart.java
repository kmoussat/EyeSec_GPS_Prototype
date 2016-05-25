package com.eyesec.eyesec;

/**
 * Created by Ken on 12/05/2016.
 */

/*
public class OnClickListenerButtonStart {
}
*/

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class OnClickListenerButtonStart implements OnClickListener {

    final String TAG = "OnClickListenerButtonStart.java";

    MainActivity mainActivity;
    Context context;

    @Override
    public void onClick(View view) {

        Log.e(TAG, "Started getting user location.");

        // to get the context and main activity
        this.context = view.getContext();
        this.mainActivity = ((MainActivity) context);

        // disable the START button, enable the STOP button
        mainActivity.buttonStart.setEnabled(false);
        mainActivity.buttonStop.setEnabled(true);



        // start listening to location updates
        mainActivity.locationHelper.getLocation(mainActivity, mainActivity.locationResult);

    }

}