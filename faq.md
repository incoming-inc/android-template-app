---
title: F.A.Q.
layout: default 
---

# FAQ

### Does the Sourse SDK work on devices that do not have Google Play Services installed?
Yes. New content will be discovered by periodic polling of the Push Video feed.

### Is it necessary to extend the Android Application class to use the Sourse SDK?
No. The Sourse SDK uses the application context, which is passed to the Sourse SDK when it configured by the host application. The Sourse SDK may be configured from either the application class or the launch activity.

### Does the Sourse SDK need to be configured from the main thread?
No. The Sourse SDK configuration methods are lightweight and may be called from the main thread without impacting the user experience, as all substantial tasks are delegated to worker threads. The Sourse SDK may also be configured from a host application back thread or asynchronous task if that suits the architecture of the host application.

### How does the Sourse SDK treat [dangerous](https://developer.android.com/guide/topics/security/permissions.html#normal-dangerous) Android system permissions introduced in Marshmellow?

The Push Video makes use of coarse location detection to provide notification timing context data. Beginning with Marshmellow, this will require the Location [permission group](https://developer.android.com/guide/topics/security/permissions.html#perm-groups) to be allowed by the user.

The Sourse SDK does not trigger a user permission dialog to request the Location group permission. Instead it will only request the coarse location data if the LOCATION permission group has been granted. The Sourse SDK will still operate without the coarse location data. In this case it will not be used as a signal in the learning in analytics.

### The Sourse SDK includes the WRITE_EXTERNAL_STORAGE permission which is included in the MarshMellow permission group STORAGE. Does the user need to accept a permission dialog for this?

No. The Sourse SDK only uses directories in the application sandbox, which are provided by methods such as [getExternalCacheDir()](http://developer.android.com/reference/android/content/Context.html#getExternalCacheDir()). The WRITE_EXTERNAL_STORAGE permission is required to write to these directories for Android versions prior to KitKat. The permission is not required for newer Android versions and therefore there is no need for the user to grant access to the STORAGE permission group when running Marshmellow.





