package nl.frank.astest

import com.urbanairship.UAirship

class SampleAutopilot : com.urbanairship.Autopilot() {

    override fun onAirshipReady(airship: UAirship) {
        airship.getPushManager().setUserNotificationsEnabled(true)
        airship.channel.editTags()
            .addTag("Q42")
            .apply()
    }
}