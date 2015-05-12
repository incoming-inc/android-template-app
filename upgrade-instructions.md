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