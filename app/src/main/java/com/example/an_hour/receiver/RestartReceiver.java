package com.example.an_hour.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.example.an_hour.AlarmService;
import com.example.an_hour.MainActivity;

/**
 * Created by kirito on 2016/9/22.
 */
public class RestartReceiver extends BroadcastReceiver {
    private static final String TAG = "RestartReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e(TAG, "onReceive: ---" );
        /*Intent i = new Intent(context,MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);*/
        context.startService(new Intent(context.getApplicationContext(),AlarmService.class));
    }
}
