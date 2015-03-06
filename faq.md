---
title: F.A.Q.
layout: default 
---

# FAQ

###Does the Push Video SDK work on devices that do not have Google Play Services installed?
Yes. New content will be fetched by periodic polling.

### Does the GCM sender id and key need to be configured before using the Push Video SDK for Android?
No. The Push Video service uses the Incoming Media sender ID by default. The host application may configure its own GCM sender ID and key in the Push Video control panel. The Push Video SDK will still operate without a GCM sender and key. New content will be fetched by periodic polling, but it will take longer to deliver new content.

