package com.handoyo.mqtt_coba.data

import org.eclipse.paho.android.service.MqttAndroidClient

class mqtt_cilent {
    private lateinit var mqttClient: MqttAndroidClient
    // TAG
    companion object {
        const val TAG = "AndroidMqttClient"
    }
}