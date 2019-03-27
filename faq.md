---
title: F.A.Q.
layout: default 
---

# FAQ

### Does the Push Video SDK work on devices that do not have Google Play Services installed?
Yes. New content will be discovered by periodic polling of the Push Video feed.

### Is it necessary to extend the Android Application class to use the Push Video SDK?
No. The Push Video SDK uses the application context, which is passed to the Push Video SDK when it configured by the host application. The Push Video SDK may be configured from either the application class or the launch activity.

### Does the Push Video SDK need to be configured from the main thread?
No. The Push Video SDK configuration methods are lightweight and may be called from the main thread without impacting the user experience, as all substantial tasks are delegated to worker threads. The Push Video SDK may also be configured from a host application back thread or asynchronous task if that suits the architecture of the host application.

### How does the Push Video SDK treat [dangerous](https://developer.android.com/guide/topics/security/permissions.html#normal-dangerous) Android system permissions introduced in Marshmellow?

The Push Video makes use of coarse location detection to provide notification timing context data. Beginning with Marshmellow, this will require the Location [permission group](https://developer.android.com/guide/topics/security/permissions.html#perm-groups) to be allowed by the user.

The Push Video SDK does not trigger a user permission dialog to request the Location group permission. Instead it will only request the coarse location data if the LOCATION permission group has been granted. The Push Video SDK will still operate without the coarse location data. In this case it will not be used as a signal in the learning in analytics.

### The Push Video SDK includes the WRITE_EXTERNAL_STORAGE permission which is included in the MarshMellow permission group STORAGE. Does the user need to accept a permission dialog for this?

No. The Push Video SDK only uses directories in the application sandbox, which are provided by methods such as [getExternalCacheDir()](http://developer.android.com/reference/android/content/Context.html#getExternalCacheDir()). The WRITE_EXTERNAL_STORAGE permission is required to write to these directories for Android versions prior to KitKat. The permission is not required for newer Android versions and therefore there is no need for the user to grant access to the STORAGE permission group when running Marshmellow.





