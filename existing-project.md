---
title: Existing Project
layout: default
---


# Configure Access to the Push Video Repository

The android support library and Google Play services need to be added if they are not used already. AppCompat-v7 references support-v4 so may be used in place of support-v4.

Gradle:

    allprojects {
        repositories {
            jcenter()
            maven {
                url "http://107.178.209.67:8081/nexus/content/repositories/releases/"
            }
        }
    }

## Add the library dependencies

NOTE: Google Play Service version 6.5.0 or greater is required.

Gradle:

    dependencies {
        compile 'com.incoming-media:incoming-push-video-sdk:1.10.13'
        compile 'com.android.support:support-v4:22.2.1'
        compile 'com.google.android.gms:play-services-base:9.2.1'
        compile 'com.google.android.gms:play-services-gcm:9.2.1'
        // For Activity Recognition
        compile 'com.google.android.gms:play-services-location:9.2.1'
    }



# Configure the SDK Initialization Code

The Push Video SDK may be configured in the application launch Activity onCreate(),

    PushVideo.initialize(getApplicationContext(), ”API ENDPOINT”, “PROJECT KEY”);
    
or in the main Application class onCreate():

    PushVideo.initialize(this, ”API ENDPOINT”, “PROJECT KEY”);

The Push Video server uses GCM [collapse keys](https://developers.google.com/cloud-messaging/concept-options#collapsible_and_non-collapsible_messages) to inform the Push Video SDK about new content and configuration changes.

If the host application uses GCM notifications for other purposes it should ensure GCM push messages that contain the values `policy`, `static-feed`, `dynamic-feed`, or `healthcheck` for the string extra `collapse_key` are ignored.

# Update the Manifest


Add the permissions, video player activities and broadcast receiver configuration to the application section of the Android manifest.

##Permissions

    <!-- Begin PVN permission configuration -->
    <!-- Permissions required for GCM -->
    <uses-permission android:name="android.permission.WAKE_LOCK"/>
    <uses-permission android:name="com.google.android.c2dm.permission.RECEIVE"/>
    <uses-permission android:name="android.permission.RECEIVE_BOOT_COMPLETED"/>
    <!-- Replace com.example.incomingpvntemplate with application package name -->
    <permission android:name="com.example.incomingpvntemplate.permission.C2D_MESSAGE" android:protectionLevel="signature"/>

    <!-- Replace com.incoming.example.incomingpvntemplate with application package name -->
    <uses-permission android:name="com.incoming.example.incomingpvntemplate.permission.C2D_MESSAGE"/>

    <!-- Required to store downloaded videos -->
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
    <uses-permission android:name="android.permission.DOWNLOAD_WITHOUT_NOTIFICATION"/>

    <!-- Check Wi-fi state for download -->
    <uses-permission android:name="android.permission.ACCESS_WIFI_STATE"/>
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>
    <uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION"/>
    <uses-permission android:name="android.permission.INTERNET"/>

    <!-- Activity Recognition -->
    <uses-permission android:name="com.google.android.gms.permission.ACTIVITY_RECOGNITION" />
   
    <!-- End PVN permission configuration -->

The permission `android.permission.ACCESS_COARSE_LOCATION` is optional in version 1.4 and above of the Push Video SDK. Coarse location information is used to improve notification timing and provide analytics data but may be omitted if it is inappropriate for the application to request this permission.

## Broadcast Receiver Configuration And Video Player Activity Coinfiguration

     <application android:allowBackup="true" android:icon="@drawable/ic_launcher" android:label="@string/app_name" android:theme="@style/AppTheme">

        <!-- Begin PVN configuration -->

        <activity android:configChanges="orientation" android:exported="true" android:name="com.incoming.au.uiframework.VideoViewPlayer" android:screenOrientation="sensorLandscape">
        </activity>

        <receiver android:name="com.incoming.au.sdk.notification.NotificationBroadcastReceiver">
            <intent-filter>
                <action android:name="com.incoming.notif.check"/>
                <action android:name="com.incoming.playlist"/>
                <action android:name="com.incoming.feed.check" />
                <action android:name="com.incoming.download.trigger"/>
                <action android:name="android.intent.action.BOOT_COMPLETED"/>
                <action android:name="android.intent.action.DOWNLOAD_COMPLETE"/>
                <action android:name="com.google.android.c2dm.intent.RECEIVE"/>

                <!-- Replace com.incoming.example.incomingpvntemplate with application package name. The variable ${packageName} can be used when building with the Gradle Android plugin -->
                <category android:name="com.incoming.example.incomingpvntemplate"/>
            </intent-filter>
        </receiver>

        <service android:name="com.incoming.au.sdk.PVNIntentService"/>

        <!-- End PVN configuration -->



