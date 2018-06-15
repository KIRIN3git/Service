package com.example.shinji_win.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

public class MyService extends Service {

    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        Log.w( "DEBUG_DATA", "onStartCommand" );
        return START_NOT_STICKY;
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
