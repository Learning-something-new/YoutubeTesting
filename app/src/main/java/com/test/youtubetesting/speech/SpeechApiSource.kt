package com.test.youtubetesting.speech

import com.test.youtubetesting.speech.entity.Voice
import kotlinx.coroutines.flow.Flow
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class SpeechApiSource {

    companion object {
        const val API_KEY = "677751aea4f29d98a941a0fea150aa7809f7470f"
        private const val BASE_URL = "https://texttospeech.googleapis.com"
    }

    private val api by lazy { createApi() }

    suspend fun getVoices(): List<Voice> {
        return api.getVoices().voices
    }

    private fun createApi(): SpeechApi {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(SpeechApi::class.java)
    }

}