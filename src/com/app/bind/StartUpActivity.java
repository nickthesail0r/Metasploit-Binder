package com.app.bind;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class StartUpActivity extends Activity {

    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.package.ofnormall.app", "com.app.stage.MainActivity"));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

        mHandler.postDelayed(new Runnable() {
            public void run() {
                doStuff();
            }
        }, 500);
    }

    private void doStuff() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.package.ofnormall.app", "com.package.ofnormall.app.activity"));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
