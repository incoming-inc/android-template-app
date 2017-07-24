/*******************************************************************************
 * Copyright (c) Incoming Pty. Ltd. 2017
 ******************************************************************************/
package com.incoming.pushvideo.example;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.incoming.example.incomingpvntemplate.R;

public class PVNTemplateActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_pvntemplate);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.pvntemplate, menu);
    return true;
  }

}
