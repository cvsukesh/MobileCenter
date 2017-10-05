package com.mobilecenterapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.microsoft.azure.mobile.MobileCenter;
import com.microsoft.azure.mobile.push.Push;
import com.microsoft.azure.mobile.push.PushListener;
import com.microsoft.azure.mobile.push.PushNotification;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileCenter.start(getApplication(), "6acb5b60-55cd-46c5-bd1e-807f710a35a6", Push.class);
        Push.setListener(pushListener);
    }

    PushListener pushListener = new PushListener() {
        @Override
        public void onPushNotificationReceived(Activity activity, PushNotification pushNotification) {

        }
    };
}
