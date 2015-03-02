---
title: Configure Settings
layout: default
---

## Configure Settings (Optional)

If the host application does not use any setting then a new activity may be added.

    import android.app.Activity;
    import android.os.Bundle;

    import com.incoming.settings.PVNSettingsFragment;

    public class PVCSettingsActivity extends Activity {

      @Override
      protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Display the fragment as the main content.
        getFragmentManager().beginTransaction().replace(android.R.id.content, new PVNSettingsFragment()).commit();
      }
    }

If the preference activity is declared in `AndroidManifest.xml` with the intent filter the user can access the settings with a long press on a notification. This feature is available with Lollipop and the configuration is ignored by older versions of Android.

    <activity android:label="Settings" android:name=".PVCSettingsActivity">
      <intent-filter>
        <action android:name="android.intent.action.MAIN"/>
        <category android:name="android.intent.category.NOTIFICATION_PREFERENCES"/>
      </intent-filter>
    </activity>

Alternatively, if the host application already uses preferences then the Push Video preferences may be added to the preferences XML file:

    <PreferenceCategory android:title="Push Video Preferences" >
        <SwitchPreference
            android:defaultValue="true"
            android:key="NOTIFICATION_DISPLAY_ACTIVE"
            android:summary="@string/pref_notifications_summary"
            android:title="@string/action_notifications_active" />
        <SwitchPreference
            android:defaultValue="true"
            android:key="PREF_DOWNLOAD_ENABLED"
            android:summary="@string/pref_notifications_summary"
            android:title="@string/download_enabled" />
    </PreferenceCategory>

