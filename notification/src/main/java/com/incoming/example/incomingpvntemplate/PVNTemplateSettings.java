/*******************************************************************************
 * Copyright (c) Incoming Pty. Ltd. 2017
 ******************************************************************************/
package com.incoming.example.incomingpvntemplate;

import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Basic settings Activity that includes the  default Push Video settings and some content targeting settings for the user.
 */
public class PVNTemplateSettings extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    // Display the settings fragment as the main content.
    getFragmentManager().beginTransaction().replace(android.R.id.content, new SettingsFragment()).commit();
  }

  public static class SettingsFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      // Include the content targeting settings
      addPreferencesFromResource(R.xml.preferences);
      // Include the PVN SDK settings
      addPreferencesFromResource(R.xml.pvn_preferences);
    }
  }

}
