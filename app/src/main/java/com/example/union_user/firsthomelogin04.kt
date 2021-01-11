package com.example.union_user

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class firsthomelogin04 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firsthomelogin04)
    }

    fun firsthomelogin5kefirsthomelogin5(view: View) {
        var firsthomelogin4 = Intent(this,firsthomelogin05::class.java)
        startActivity(firsthomelogin4)
    }
}