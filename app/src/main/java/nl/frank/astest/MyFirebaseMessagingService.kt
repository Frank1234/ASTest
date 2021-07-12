package nl.frank.astest

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.urbanairship.push.fcm.AirshipFirebaseIntegration

class MyFirebaseMessagingService : FirebaseMessagingService() {

    override fun onNewToken(token: String) {
        Log.d("TEST", "Refreshed token: $token")
        AirshipFirebaseIntegration.processNewToken(applicationContext, token)
    }

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        Log.d("TEST", "onMessageReceived : ${remoteMessage.data}")
        AirshipFirebaseIntegration.processMessageSync(applicationContext, remoteMessage)
    }
}