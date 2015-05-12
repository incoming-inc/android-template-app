---
title: Advertising SDK Integration
layout: default 
---

Advertising SDK support is available in version 1.3.X and above of the Push Video SDK.

   PushVideo.initialize(getApplicationContext(), endPoint, projectKey);
   PushVideo.configureAdManager(<PushVideoAdManager implementation>);

Implement the interface defined by `PushVideoAdManager`.

# Millenial Media

  PushVideo.configureAdManager(new MMAdManager(this, INTERSTITIAL_APID));






