package com.test.youtubetesting.speech

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.test.youtubetesting.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.HttpException

class SpeechFragment : Fragment() {

    private val speechApiSource by lazy { SpeechApiSource() }

   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_speech, container, false)

        val textView: EditText = v.findViewById(R.id.textView)

        v.findViewById<Button>(R.id.get_voices).setOnClickListener {

            CoroutineScope(Dispatchers.Main).launch {
                try {

                val voices = speechApiSource.getVoices()
                textView.setText(voices.joinToString("\n"))

                } catch (e: HttpException){
                    e.printStackTrace()
                    Log.e(TAG, "onCreateView: ${e.response()?.errorBody()?.string()}", )
                }
            }
        }

        return v
    }



    companion object {
        const val TAG = "SpeechFragment"

        @JvmStatic
        fun newInstance() =
            SpeechFragment().apply {
            }
    }
}