---
title: New Project
layout: default
---


# Clone the Template Application

Clone the [Android template application]({{site.github.repository_url}}).

The Push Video template application is in the directory `pvn-template-app` and provides both Gradle and Maven build scripts.

# Import and Compile the Project

Both Android Studio/Gradle and Maven build systems are supported.

## Gradle/Android Studio

A Gradle build file (build.gradle) is supplied with the template Application at https://github.com/incoming-inc/android-template-app. It requires Gradle 2.2.

## Maven

The Push Video Notification template application contains a maven pom file that can be used to build the application.

The following build commands assume maven is installed:
* Build a debug APK file: `mvn clean install`.
* Build a debug APK file, deploy to the attached device, and run: `mvn clean install android:deploy android:run` 

Note that the first time the build is executed the Maven Android Plugin and other build tools will be downloaded as necessary. [Maven (version 3.2.X)](http://maven.apache.org/download.cgi) must be installed beforehand.

# Configure Your Push Video Project Key

Add the API endpoint and project key specified in your Push Video Control panel project to the configuration file [`incoming_android_sdk.xml`]({{site.github.repository_url}}/pvn-template-app/res/values/incoming_android_sdk.xml).
