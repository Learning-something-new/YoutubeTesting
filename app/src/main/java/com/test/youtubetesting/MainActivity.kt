package com.test.youtubetesting

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.test.youtubetesting.speech.SpeechFragment

class MainActivity : AppCompatActivity() {

//    val VIDEO_ID = "xKN4kCeln7Q"
//    val YOUTUBE_API_KEY = "AIzaSyDrYHXEFj5F5UQU1Os3wAWmwaJys8oocDM"
//
//    private lateinit var youtubePlayer: YouTubePlayerView
//    private lateinit var btnPlay: Button
//    lateinit var youtubePlayerInit: YouTubePlayer.OnInitializedListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.container, SpeechFragment.newInstance())
            .commit()
//
//        youtubePlayer = findViewById(R.id.youtubePlayer)
//        btnPlay = findViewById(R.id.btnPlay)
//
//        youtubePlayerInit = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(
//                p0: YouTubePlayer.Provider?,
//                p1: YouTubePlayer?,
//                p2: Boolean
//            ) {
//                p1?.loadVideo(VIDEO_ID)
//            }
//
//            override fun onInitializationFailure(
//                p0: YouTubePlayer.Provider?,
//                p1: YouTubeInitializationResult?
//            ) {
//                Toast.makeText(applicationContext, "Error", Toast.LENGTH_SHORT).show()
//            }
//        }
//
//        btnPlay.setOnClickListener {
//            youtubePlayer.initialize(YOUTUBE_API_KEY, youtubePlayerInit)
//        }
//
//        findViewById<Button>(R.id.toSpeech).setOnClickListener {
//
//        }
    }
}