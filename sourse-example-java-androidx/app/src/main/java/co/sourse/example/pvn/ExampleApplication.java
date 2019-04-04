package co.sourse.example.pvn;

import android.app.Application;
import android.util.Log;

import co.sourse.example.R;
import co.sourse.pvnsdk.Sourse;

/**
 * Simple Android Application class that launches the Sourse SDK. The Sourse SDK configuration
 * may also be invoked from the launch Activity.
 */
public class ExampleApplication extends Application {

  private static final String TAG = ExampleApplication.class.getSimpleName();

  @Override
  public void onCreate() {
    super.onCreate();
    Log.i(TAG, "Launching the Incoming Push Video Notification SDK");

    String endPoint = getString(R.string.incoming_pvn_endpoint);
    String projectKey = getString(R.string.incoming_pvn_project_key);

    // Turn on logging (optional)
    Sourse.setDevBuild(true);
    Sourse.initialize(getApplicationContext(), endPoint, projectKey);

    Log.i(TAG, "Launched the Incoming Push Video Notification SDK");
  }
}
