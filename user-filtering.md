---
title: User Initiated Filtering
layout: default 
---

The ability to let the user filter content based on their preferences is is available in version 1.4.X and above of the Push Video SDK.

The host application provides the list of `SharedPreference` keys that are used by the Push Video SDK to determine the video attributes to be used to filter content. The Push Video SDK listens for changes to the preference values and updates the filter rules automatically.

The filter keys are configured at the same time as the Push Video SDK:

    PushVideo.initialize(getApplicationContext(), endPoint, projectKey);
    PushVideo.configureAdManager(<PushVideoAdManager implementation>); List<String> filterKeys = Arrays.asList("LIKES_DOGS", "LIKES_CATS", "FAVORITE_PET");
    PushVideo.configureUserFilteringKeys(filterKeys);


The easiest way to provide a UI to the user is by using a [preference fragment](http://developer.android.com/guide/topics/ui/settings.html#Fragment) or
[preference activity](http://developer.android.com/guide/topics/ui/settings.html#Activity) along with some [preferences XML](http://developer.android.com/guide/topics/ui/settings.html#DefiningPrefs) like the following.

    <?xml version="1.0" encoding="utf-8"?>
    <PreferenceScreen xmlns:android="http://schemas.android.com/apk/res/android" >
      <PreferenceCategory android:title="Example Application Preferences" >
        <SwitchPreference android:title="Preference 1" />
        <SwitchPreference android:summary="Preference 2" />
      </PreferenceCategory>
      <PreferenceCategory android:title="Filtering preferences" >
        <SwitchPreference
            android:defaultValue="true"
            android:key="LIKES_DOGS"
            android:summary="@string/filter_summary_dogs"
            android:title="@string/filter_title_dogs" />
        <SwitchPreference
            android:defaultValue="true"
            android:key="LIKES_CATS"
            android:summary="@string/filter_summary_cats"
            android:title="@string/filter_title_cats" />
        <ListPreference
            android:entries="@array/filter_fav_values"
            android:entryValues="@array/filter_fav_values"
            android:key="FAVORITE_PET"
            android:summary="@string/filter_summary_fav"
            android:title="@string/filter_title_fav" />
      </PreferenceCategory>
    </PreferenceScreen>

Alternatively, a more sophsticated UI may implemented. All it needs to do is to write the filter preference values to the [SharedPreferences](http://developer.android.com/reference/android/content/SharedPreferences.html) when the values change. 