package com.test.youtubetesting.speech

import com.test.youtubetesting.speech.entity.Voice
import com.test.youtubetesting.speech.entity.VoicesResponse
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST

interface SpeechApi {
    @Headers(
        "Content-Type: application/json; charset=utf-8",
    )
    @GET("/v1/voices?key=AIzaSyCsHyQpGFOyWTqIx0wkTZcg9ViSZ0pxa8s")
    suspend fun getVoices(): VoicesResponse

    @POST("/v1/text:synthesize")
    suspend fun synthesizeText(text: String, voice: Voice): String
}