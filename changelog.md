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

# Version 1.4.29 (July 3, 2015)

 * Prepare for optional permissions in Android M.
 * Add the ability to enable/disable the use of location for learning and analytics at runtime.
 * Improvements to notification timing using machine learning.

# Version 1.5.8 (July 27, 2015)

 * Re-enable Activity Recognition now deprecated API has been removed by Google.
 * Enable querying of why a video received a score.

# Version 1.6.9 (August 21, 2015)

 * Add support for interstitial/post-roll advertisements.
 * Add support for ASAP download and notification of particular videos.
 * Ensure a Looper is always created so the Push Video SDK can be initialized from a background thread that does not already have a Looper.
	
# Version 1.6.10 (August 27, 2015)

 * Bug Fix: Prevent applications responding to Push Video Android broadcasts that were not intended for that application when more than one application that uses the Push Video SDK is installed. This problem was introduced in 1.6 and does not apply to older versions of the Push Video SDK.


# Version 1.8.14 (October 12, 2015)

 * Add support to target videos to different audience segments.
 * Allow unwatched videos that have been discarded due to the expiry or deadline passing to be re-considered if these are changed on the control panel.
 * Add utility method to allow the host application to check if the GCM notification is intended for the Push Video SDK.
 * Avoid posting a video notification when the user is answeing a call.

# Version 1.9.11 (December 1, 2015)

 * Sponsored Video Support - advertisements will not be shown for videos marked as sponsored on the Incoming control panel. 
 * Immediate Cellular Download - videos may be scheduled for immediate download and notification over cellular in the Incoming control panel.
 * Improved notification icon sizing.
 * Allow the curator to edit the notification text in the control panel. The video title is used by default.
 * Defect fix for 1.8 segmentation feature:  User targeting preferences stored in Android SharedPreferences were not applied until after first edit by user.

# Version 1.9.12 (December 15, 2015)

 * Resume video at previous position when player is backgrounded while watching a video.

# Version 1.10.12 (January 15, 2016)

 * Improve handling of invalid access tokens.
 * Context collection improvements.
 * Fix client-server API compatibility issue for sponsored videos.

# Version 1.10.13 (December 15, 2016)

 * Remove the ability to set the project key using the install referrer because it clashed with changed Google Play behavior.  
 * Update context collection to satisfy updated Google Play requirements.

# Version 2.0.15 (March 1, 2017)

 * New project-wide campaign mode feature to support displaying the same video several times.

# Version 2.0.16 (March 10, 2017)

 * Add support for interstitial video presentation option. The media controller is disabled by default in interstitial mode.
 * Send a local broadcast when a video has been played.

# Version 2.1.4 (May 3, 2017)

 * Simplify integration API by removing the distinction between "PVN" and "Campaign Mode" cotent selection.
 * Support a configurable limit on the number of times a video is presented to each user.

