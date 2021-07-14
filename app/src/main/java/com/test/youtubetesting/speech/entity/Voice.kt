package com.test.youtubetesting.speech.entity

import com.google.gson.annotations.SerializedName

data class Voice(
    val languageCodes: List<String>,
    val name: String,
    @SerializedName("ssmlGender")
    val gender: String,
//    @SerializedName("naturalSampleRateHertz")
//    val rate: Int
)