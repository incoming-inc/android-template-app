---
title: F.A.Q.
layout: default 
---

# FAQ

###Does the Push Video SDK work on devices that do not have Google Play Services installed?
Yes. New content will be discovered by periodic polling of the Push Video feed.

### Does the GCM sender id and key need to be configured before using the Push Video SDK for Android?
No. The Push Video service uses the Incoming Media sender ID by default. The host application may configure its own GCM sender ID and key in the Push Video control panel. The Push Video SDK will still operate without a GCM sender and key. New content will be discovered by periodic polling of the Push Video feed, but it will take longer to deliver new content.

### Is it necessary to extend the Android Application class to use the Push Video SDK?
No. The Push Video SDK uses the application context, which is passed to the Push Video SDK when it configured by the host application. The Push Video SDK may be configured from either the application class or the launch activity.

### Does the Push Video SDK need to be configured from the main thread?
No. The Push Video SDK configuration methods are lightweight and may be called from the main thread without impacting the user experience, as all substantial tasks are delegated to worker threads. The Push Video SDK may also be configured from a host application back thread or asynchronous task if that suits the architecure of the host application.


