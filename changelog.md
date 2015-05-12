---
title: Release Notes
layout: default 
---
 

# Version 1.2.7 (March 4, 2015) 

 * Add serendipity to recommendation from content learning to allow the user to discover videos from new topics and genres even after learning.
 * Deep linking into the host application after video playback completes.
 * Various bug fixes:
   * Guard against case where the video storage directory has not been created when performing the file cleanup task.
   * Only set the time downloaded when download completes or fails. It was previously being updated whenever the prefetch status changed.
   * Fix issue where videos with an underscore in the id were treated as if they were orphaned when this was not the case.
   * Add a short backoff when commencing downloads to avoid potential problems if two beoadcasts occur at once (e.g. a duplicate download complete broadcast).
   * Move processing of user presence changes from the UI thread to a worker thread to avoid the risk of ANRs.

If using Android manifest merging, it is necessary to disable a reference to non-existent broadcast receiver that was included in the Push Video SDK AAR. This can be done by adding the following to the application section of the manifest:

    <receiver android:name="com.incoming.pv.GcmBroadcastReceiver" tools:node="remove">
    </receiver>

# Version 1.2.8 (April 10, 2015) 

 * Add a default notification ticker text so the host application is not forced to override the placeholder text.

# Version 1.2.9 (April 13, 2015) 

 * Add support for Google Play Services API 7.0.0, and above. This version is not required for host applications using older verions of the Play Services API.

# Version 1.3.13 (May 12, 2015)

 * Introduce third-party advertising SDK support, including sample integrations for AdColony and Millenial Media.
 * Extended analytics and error tracking.
 * Minor updates to feed paring to support Kaltura OVP.
