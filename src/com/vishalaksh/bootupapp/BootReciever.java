package com.vishalaksh.bootupapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootReciever extends BroadcastReceiver
{

@Override
public void onReceive(Context context, Intent intent) {
    // TODO Auto-generated method stub
	
	
    Intent myIntent = new Intent(context, FullscreenActivity.class);
    myIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    myIntent.addFlags(Intent.FLAG_ACTIVITY_TASK_ON_HOME);
    context.startActivity(myIntent);
}

}