package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView =  findViewById(R.id.textView)

    }
    fun add(view: View){
        val t = textView.text.toString()
        val s = t.toInt()+1
        val st = s.toString()
        textView.text = st
        Log.d("msg", st)
    }

    fun sub(view: View){
        val t = textView.text.toString()
        val s = t.toInt()-1
        val st = s.toString()
        textView.text = st
        Log.d("msg", st)
    }

    fun reset(view: View){
        textView.text = "0"
    }
}