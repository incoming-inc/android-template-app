---
title: Upgrade Instructions
layout: default 
---
 
# Version 1.2.7 (March 4, 2015) 

## API changes

No API changes are introduced in this release.
	
## Android Studio/Gradle

Set the Push Video SDK version to 1.2.7 in the dependencies section of `build.gradle`. e.g.

    dependencies {
      compile 'com.incoming-media:incoming-push-video-sdk:1.2.7'
      compile 'com.android.support:support-v4:21.0.3'
      compile 'com.google.android.gms:play-services-location:6.5.87'
      compile 'com.google.android.gms:play-services-base:6.5.87'
    }


## Maven

Set the Push Video SDK version to 1.2.7 in the dependencies section of `pom.xml`. e.g.

    <properties>
        <pvn.version>1.2.7</pvn.version>
        <android.support.version>21.0.3</android.support.version>
        <play-services.version>6.5.87</play-services.version>
    </properties>

## Eclipse

 1. Remove the old Push Video SDK JAR files from the `libs` directory.
 1. Add the Push Video SDk version 1.2.7 JAR files to the `libs` directory.
 1. Adjust classpath to use new versioned jars.
 1. Restart Eclipse.


# Version 1.3.13 (May 12, 2015) 

## API changes

No breaking API changes are introduced in this release. An API to support integration of third-party advertising SDKs was added.
	
## Android Studio/Gradle

Set the Push Video SDK version to 1.3.13 in the dependencies section of `build.gradle`. e.g.

    dependencies {
      compile 'com.incoming-media:incoming-push-video-sdk:1.3.13'
      compile 'com.android.support:support-v4:22.1.1'
      compile 'com.google.android.gms:play-services-location:7.3.0'
      compile 'com.google.android.gms:play-services-base:7.3.0'
    }

The Google Play Services version specified in the manifest for version 7.3.0 should be 7327000.

## Maven

Set the Push Video SDK version to 1.3.13 in the dependencies section of `pom.xml`. e.g.

    <properties>
        <pvn.version>1.3.13</pvn.version>
        <android.support.version>22.1.1</android.support.version>
        <play-services.version>7.3.0</play-services.version>
    </properties>

The Google Play Services version specified in the manifest for version 7.3.0 should be 7327000.

# Version 1.4.29 (July 3, 2015) 

## API changes

No breaking API changes are introduced in this release.
	
## Android Studio/Gradle

Set the Push Video SDK version to 1.4.29 in the dependencies section of `build.gradle`. e.g.

    dependencies {
      compile 'com.incoming-media:incoming-push-video-sdk:1.4.29'
      compile 'com.android.support:support-v4:22.2.0'
      compile 'com.google.android.gms:play-services-location:7.5.0'
      compile 'com.google.android.gms:play-services-base:7.5.0'
    }

The recommended Google Play Services version specified in the manifest for version 7.5.0 is 7571000.

## Maven

Set the Push Video SDK version to 1.4.29 in the dependencies section of `pom.xml`. e.g.

    <properties>
        <pvn.version>1.4.29</pvn.version>
        <android.support.version>22.2.0</android.support.version>
        <play-services.version>7.5.0</play-services.version>
    </properties>

The recommended Google Play Services version specified in the manifest for version 7.5.0 is 7571000.


# Version 1.5.8 (July 27, 2015) 

## API changes

No breaking API changes are introduced in this release.
	
## Android Studio/Gradle

Set the Push Video SDK version to 1.5.8 in the dependencies section of `build.gradle`. e.g.

    dependencies {
      compile 'com.incoming-media:incoming-push-video-sdk:1.5.8'
      compile 'com.android.support:support-v4:22.2.1'
      compile 'com.google.android.gms:play-services-location:7.5.0'
      compile 'com.google.android.gms:play-services-base:7.5.0'
    }

The recommended Google Play Services version is 7.5.0, which requires a manifest version of 7571000.


## Maven

Set the Push Video SDK version to 1.5.8 in the dependencies section of `pom.xml`. e.g.

    <properties>
        <pvn.version>1.5.8</pvn.version>
        <android.support.version>22.2.1</android.support.version>
        <play-services.version>7.5.0</play-services.version>
    </properties>

The recommended Google Play Services version is 7.5.0, which requires specified a manifest version of 7571000.

# Version 1.6.9 (August 21, 2015) 

## API changes

No breaking API changes are introduced in this release.

A new intent-filter action must be added to intent filter actions for the NotificationBroadcastReceiver. This is used
to support interstitial/post-roll advertisiements.

     <action android:name="com.incoming.playlist"/>

## Android Studio/Gradle

Set the Push Video SDK version to 1.6.9 in the dependencies section of `build.gradle`. e.g.

    dependencies {
      compile 'com.incoming-media:incoming-push-video-sdk:1.6.9'
      compile 'com.android.support:support-v4:22.2.1'
      compile 'com.google.android.gms:play-services-location:7.5.0'
      compile 'com.google.android.gms:play-services-base:7.5.0'
    }

The recommended Google Play Services version is 7.5.0, which requires a manifest version of 7571000.


## Maven

Set the Push Video SDK version to 1.6.9 in the dependencies section of `pom.xml`. e.g.

    <properties>
        <pvn.version>1.6.9</pvn.version>
        <android.support.version>22.2.1</android.support.version>
        <play-services.version>7.5.0</play-services.version>
    </properties>

The recommended Google Play Services version is 7.5.0, which requires specified a manifest version of 7571000.





