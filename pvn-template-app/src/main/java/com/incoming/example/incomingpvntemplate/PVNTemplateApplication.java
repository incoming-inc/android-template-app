package com.incoming.example.incomingpvntemplate;

import android.app.Application;
import android.util.Log;

import com.incoming.au.foundation.tool.LogIncoming;
import com.incoming.pvnsdk.PushVideo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Simple Android Application class that launches the Incoming Push Video SDK. The Push Video SDK configuration
 * may also be invoked from the launch Activity.
 */
public class PVNTemplateApplication extends Application {

  private static final String TAG = PVNTemplateApplication.class.getSimpleName();

  @Override
  public void onCreate() {
    super.onCreate();
    Log.i(TAG, "Launching the Incoming Push Video Notification SDK");

    String endPoint = getString(R.string.incoming_pvn_endpoint);
    String projectKey = getString(R.string.incoming_pvn_project_key);

    // Turn on logging (optional)
    LogIncoming.setDevBuild(true);
    PushVideo.initialize(getApplicationContext(), endPoint, projectKey);
    // Configure optional advertising SDK
    // PushVideo.configureAdManager(...);

    // Configure audience segmentation based on the Android Prefereces framework (optional)
    // See res/xml/preferences.xml
    Set<String> contentTargetingKeys = new HashSet<>(Arrays.asList("AWS", "ApacheSpark", "GoogleVideos", "Stanford", "JavaScript"));
    PushVideo.configureAudienceSegmentationKeys(contentTargetingKeys);

    Log.i(TAG, "Launched the Incoming Push Video Notification SDK");
  }
}
