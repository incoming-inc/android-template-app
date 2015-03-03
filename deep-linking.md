---
title: Application Re-Engagement Deep Linking
layout: default
---

The Push Video SDK helps the user re-engage with the host application once after the user has played a video notification.

Two forms of application re-engagement links are supported:

 1. A simple link that is triggered every time the user finishes playing a video from a notification.
 1. A video-specific link to support richer forms of re-engagement, including displaying a view showing related content, or the series relating to a teaser video viewed from a video notification.

The details of the link are configured in the project settings section of the control panel. The links supports an arbitrary number of parameters and are tailored to video content management system used. This allows for flexibility with regard to custom video content system integrations and A/B testing.

On Android all deep links are delivered as an [`Intent`](http://developer.android.com/reference/android/content/Intent.html). The link may be delivered as a URI using a [custom scheme](#custom-uri-scheme) or as a [custom Android action](#custom-action). This is controlled by the project configuration set in the control panel. 


# Custom URI scheme


This pattern uses the well-known URI approach, where the link is delivered in the <a href="http://developer.android.com/guide/topics/manifest/data-element.html" target="_blank">data element</a> of the intent. The intent action is set as <a href="http://developer.android.com/reference/android/content/Intent.html#ACTION_VIEW" target="_blank">android.intent.action.VIEW</a>



The custom URI scheme (e.g. linkscheme) is registered as follows:

     <activity android:label="@string/title_activity_link_handler" android:name=".LinkHandlerActivity">
       <intent-filter>
         <action android:name="android.intent.action.VIEW" />
         <category android:name="android.intent.category.DEFAULT" />
         <category android:name="android.intent.category.BROWSABLE" />
         <data android:scheme="linkscheme" />
      </intent-filter>
    </activity>


Note an http browser scheme may be used, in which case the browser and other applications that handle the http scheme may be chosen by the user to handle the intent.


The deep link data is processed in the Activity registered to handle the links as follows:

    protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);

      if (getIntent().getAction() == Intent.ACTION_VIEW) {
        Uri uri = getIntent().getData();
        //  Parse the URI and update as necessary.
      }
    }
    


# Custom Action

In this case an Android action is used instead of a custom URI scheme to select the handler for the link.
The action is specified in the project configuration on the control panel.

The action may be handled by declaring an intent filter on a BroadcastReceiver,

     <receiver android:name=".LinkHandlerReceiver" >
       <intent-filter>
         <action android:name="linkaction"/>
       </intent-filter>  
     </receiver>

or on an Activity

     <activity android:label="@string/title_activity_link_handler" android:name=".LinkHandlerActivity">
       <intent-filter>
         <action android:name="linkaction"/>
         <category android:name="android.intent.category.DEFAULT"/>
       </intent-filter>
    </activity>


The Push Video SDK resolves if there is an Activity able to handle the action, and if that is the case it launches the Activity. If there is no Activity to handle the action, the SDK sends a broadcast for the action. Therefore, if the intent filter is added to an Activity and a BroadcastReceiver only the Activity will receive the link.

The query parameters of the link URI set in the project control panel are parsed and set as extras that are added to the intent. The deep link data is processed as follows:

    protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      //  e.g. a video id 
      String videoId = getIntent().getStringExtra(BaseVideoPlayerActivity.EXTRA_VIDEO_ID);
      // Parse other extras and act accordingly
    }

If a BroadcastReceiver is used then similar processing is applied in the `onReceive` method of the BroadcastReceiver.

# Testing Re-Engagement Deep Links 

The Android debug bridge may be used to <a href="http://developer.android.com/training/app-indexing/deep-linking.html#testing-filters" target="_blank">test the deep link processing</a>. In addition to the example showing delivering the intent to an Activity, the ADB command `adb shell am broadcast` may be used to send broadcasts to a BroadcastReceiver that handles the links.
