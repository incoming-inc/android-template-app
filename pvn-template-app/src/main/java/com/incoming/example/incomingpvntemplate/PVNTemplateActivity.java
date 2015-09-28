/*******************************************************************************
 * Copyright (c) Incoming Pty. Ltd. 2015
 ******************************************************************************/
package com.incoming.example.incomingpvntemplate;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.incoming.pvnsdk.PushVideo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PVNTemplateActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_pvntemplate);

    Set<String> filterKeys = new HashSet<>(Arrays.asList("AWS", "ApacheSpark", "GoogleVideos", "Stanford", "JavaScript"));
    PushVideo.configureAudienceSegmentationKeys(filterKeys);

  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.pvntemplate, menu);
    return true;
  }

}
