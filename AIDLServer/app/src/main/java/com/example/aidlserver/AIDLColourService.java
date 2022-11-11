package com.example.aidlserver;

import android.app.Service;
import android.content.Intent;
import android.nfc.Tag;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import java.util.Random;

public class AIDLColourService extends Service {
    public AIDLColourService() {
    }
    public

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
      return binder;
    }
    private final IMyAidlColourInterface.Stub binder = new IMyAidlColourInterface.Stub(){
        private Object Tag;

        @Override
        public int getColor() throws RemoteException {
            Random rnd = new Random();
            int Color = Color.argb(alpha :255 , rnd.nextInt(bound:256),rr)
             Log.d(Tag, msg:"getColor:"+ color);
            return Color;
        }
    };
}