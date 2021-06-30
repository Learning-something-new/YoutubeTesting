package com.test.youtubetesting

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerView

class MainActivity : YouTubeBaseActivity() {

    val VIDEO_ID = "xKN4kCeln7Q"
    val YOUTUBE_API_KEY = "AIzaSyCztt8VaKIJEhtPO_0MghKDmtY26HXm-Vo"

    private lateinit var youtubePlayer: YouTubePlayerView
    private lateinit var btnPlay: Button
    lateinit var youtubePlayerInit: YouTubePlayer.OnInitializedListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        youtubePlayer = findViewById(R.id.youtubePlayer)
        btnPlay = findViewById(R.id.btnPlay)

        youtubePlayerInit = object : YouTubePlayer.OnInitializedListener {
            override fun onInitializationSuccess(
                p0: YouTubePlayer.Provider?,
                p1: YouTubePlayer?,
                p2: Boolean
            ) {
                p1?.loadVideo(VIDEO_ID)
            }

            override fun onInitializationFailure(
                p0: YouTubePlayer.Provider?,
                p1: YouTubeInitializationResult?
            ) {
                Toast.makeText(applicationContext, "Error", Toast.LENGTH_SHORT).show()
            }
        }

        btnPlay.setOnClickListener {
            youtubePlayer.initialize(YOUTUBE_API_KEY, youtubePlayerInit)
        }
    }
}