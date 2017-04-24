---
title: Audience Segmentation
layout: default 
---

Audience segmentation support is available in version 1.8.X and above of the Push Video SDK.

Content targeting can be automatically configured as part of content metadata ingestion, or can be manually configured using the Push Video Control Panel.
Content can be targeted to audience segments based on these attributes: 

 * Country / Region Language
 * Mobile Carrier
 * Dormancy – the time since the user last engaged with the app, e.g. target a video to users who have been dormant for 3+ days.

The Push Video SDK manages these attributes automatically. All that is required is to target a particular video or feed at an audience segment using the Push Video Control Panel.


The host application can also provide custom targeting attributes, for example ‘team’ for a sports app, or ‘topic’ for a news app. The host application must inform the Push Video SDK about the targeting attributes. Two mechanisms are provided:
 
 1. A preferences approach that builds on the <a href="http://developer.android.com/intl/zh-cn/guide/topics/ui/settings.html" target="_blank">Android preference framework</a> where the Push Video SDK automatically treats a set of Android settings as audience segmentation filters. This approach means the host apoplication developer doesn't have to write boilerplate code to translate Android settings values controlled by the user to content targets for the Push Video SDK.
 1. An API interface to set the content targeting keys and values programmatically. 


# Content Targeting using Settings

The template application demonstrates this approach using a `PreferenceFragement`, as shown in the <a href="https://github.com/incoming-inc/android-template-app/blob/master/pvn-template-app/src/main/java/com/incoming/example/incomingpvntemplate/PVNTemplateSettings.java" target="_blank">template app settings</a>. The host application must <a href="apidocs/com/incoming/pvnsdk/PushVideo.html#configureAudienceSegmentationKeys-java.util.Set-" target="_blank">provide the Push SDK with a set of user settings keys</a>. The template applications calls this method in the launch activity; it may also be called from the Application class if that is used. They values of the keys will be used for content targeting. The content targetting user preferences are listed in <a href="https://github.com/incoming-inc/android-template-app/blob/master/pvn-template-app/res/xml/preferences.xml" target="_blank">preferences.xml</a>.

If the host application applies default values for the segmentation preferences using a preferences xml file then the default values should be set in the preference store, as shown in the <a href="https://github.com/incoming-inc/android-template-app/blob/master/pvn-template-app/src/main/java/com/incoming/example/incomingpvntemplate/PVNTemplateApplication.java" target="_blank">application class</a>.

# Content Targeting using SDK API

The second approach is to set the custom audience segmentation targets using the <a href="apidocs/com/incoming/pvnsdk/DataAccessService.html#setContentTargets-java.util.Map-" target="_blank">segmentation API</a>. The host application should call this method every time the content targetting preferences are changed by the user or by the host application.

