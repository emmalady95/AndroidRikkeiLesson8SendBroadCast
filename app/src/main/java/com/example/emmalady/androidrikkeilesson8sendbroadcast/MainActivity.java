package com.example.emmalady.androidrikkeilesson8sendbroadcast;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendAppA(View v){
        String package_name = "com.example.emmalady.androidrikkeilesson8applicationa";
        String broadcast_name = "com.example.emmalady.androidrikkeilesson8applicationa.receiver.CustomBroadcastReceiver";
        String action = "com.example.emmalady.CALL_A";
        Intent intent = new Intent();
        intent.setAction(action);
        intent.setComponent(new ComponentName(package_name, broadcast_name));
        sendBroadcast(intent);
    }
    public void sendSubB(View v){
        String package_name = "com.example.emmalady.androidrikkeilesson8applicationb";
        String broadcast_name = "com.example.emmalady.androidrikkeilesson8applicationb.receiver.CustomBroadcastReceiver";
        String action = "com.example.emmalady.CALL_B";
        Intent intent = new Intent();
        intent.setAction(action);
        intent.setComponent(new ComponentName(package_name, broadcast_name));
        sendBroadcast(intent);
    }
}
