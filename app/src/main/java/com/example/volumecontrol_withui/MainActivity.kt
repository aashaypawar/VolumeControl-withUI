package com.example.volumecontrol_withui

import android.content.Context
import android.media.AudioManager
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val upBtn = findViewById<Button>(R.id.btnUp)
        val downBtn = findViewById<Button>(R.id.btnDown)
        val audioManager = applicationContext.getSystemService(Context.AUDIO_SERVICE) as AudioManager

        upBtn.setOnClickListener {
            audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_SHOW_UI)
        }

        downBtn.setOnClickListener {
            audioManager.adjustVolume(AudioManager.ADJUST_LOWER, AudioManager.FLAG_SHOW_UI)
        }

    }
}