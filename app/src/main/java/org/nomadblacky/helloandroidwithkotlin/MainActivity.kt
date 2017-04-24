package org.nomadblacky.helloandroidwithkotlin

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        val button = Button(this)
        button.text = "Hello!"
        button.setOnClickListener { button.text = "Android!" }
        setContentView(button)
    }

}
