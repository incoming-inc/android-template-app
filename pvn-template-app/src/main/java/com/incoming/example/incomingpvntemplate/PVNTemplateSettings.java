/*******************************************************************************
 * Copyright (c) Incoming Pty. Ltd. 2015
 ******************************************************************************/
package com.incoming.example.incomingpvntemplate;

import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Basic settings Activity that includes the Push Video settings. An application may also embed the
 * Push Video settings in its own settings Activity.
 */
public class PVNTemplateSettings extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    // Display the Push Video settings fragment as the main content.
    getFragmentManager().beginTransaction().replace(android.R.id.content, new SettingsFragment()).commit();
  }

  public static class SettingsFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      addPreferencesFromResource(R.xml.preferences);
      // Include the PVN SDK settings
      addPreferencesFromResource(R.xml.pvn_preferences);
    }
  }

}
