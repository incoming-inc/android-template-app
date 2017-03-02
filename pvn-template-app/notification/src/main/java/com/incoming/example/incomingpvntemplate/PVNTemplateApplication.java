/*******************************************************************************
 * Copyright (c) Incoming Pty. Ltd. 2017
 ******************************************************************************/
package com.incoming.example.incomingpvntemplate;

import android.app.Application;
import android.preference.PreferenceManager;
import android.util.Log;

import com.incoming.au.foundation.tool.LogIncoming;
import com.incoming.pvnsdk.PushVideo;

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

    // Use PushVideo#SELECTION_POOLED if the project is configured to use campaign mode
    // or PushVideo#SELECTION_PRESENTATION_PVN if the project is configured to use PVN mode.
    @PushVideo.ContentSelectionStrategy int contentSelectionStrategy = PushVideo.SELECTION_POOLED;
    @PushVideo.ContentPresentationStrategy int presentationStrategy = PushVideo.PRESENTATION_PVN;
    PushVideo.initialize(getApplicationContext(), endPoint, projectKey, contentSelectionStrategy, presentationStrategy);

    // Configure optional advertising SDK
    // PushVideo.configureAdManager(...);

    // Configure audience segmentation based on the Android Preferences framework (optional)
    // See res/xml/preferences.xml
    // Set<String> contentTargetingKeys = new HashSet<>(Arrays.asList("AWS", "ApacheSpark", "GoogleVideos", "Stanford", "JavaScript"));
    // PushVideo.configureAudienceSegmentationKeys(contentTargetingKeys);

    // Apply the default values from the preferences file. This is important if application preferences are used to control audience
    // segmentation targets. readAgain is set to true so the default values from both preferences xml files are applied.
    PreferenceManager.setDefaultValues(this, R.xml.pvn_preferences, true);
    PreferenceManager.setDefaultValues(this, R.xml.preferences, true);

    Log.i(TAG, "Launched the Incoming Push Video Notification SDK");
  }
}
