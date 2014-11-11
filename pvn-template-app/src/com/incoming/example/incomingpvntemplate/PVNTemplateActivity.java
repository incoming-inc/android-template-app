/*******************************************************************************
 * Copyright (c) Incoming Pty. Ltd. 2014
 ******************************************************************************/
package com.incoming.example.incomingpvntemplate;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

import com.incoming.au.foundation.PushVideoAppRunner;
import com.incoming.au.foundation.tool.LogIncoming;



public class PVNTemplateActivity extends Activity {

  private static final String TAG = PVNTemplateActivity.class.getSimpleName();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Log.i(TAG, "Launching the Incoming Push Video Notification SDK");
    
    setContentView(R.layout.activity_pvntemplate);

    String endPoint = getResources().getString(R.string.incoming_pvn_endpoint);
    String projectKey = getResources().getString(R.string.incoming_pvn_project_key);

    LogIncoming.setDevBuild(true);
    PushVideoAppRunner appRunner = new PushVideoAppRunner(getApplicationContext(), endPoint, projectKey);
    appRunner.configure();
    
    Log.i(TAG, "Launched the Incoming Push Video Notification SDK");

  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.pvntemplate, menu);
    return true;
  }

}
