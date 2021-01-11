package com.example.union_user

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class firsthomelogin02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firsthomelogin02)
    }

    fun firsthomelogin2kefirsthomelogin3(view: View) {
        var firsthomelogin2 = Intent(this,firsthomelogin03::class.java)
        startActivity(firsthomelogin2)
    }
}