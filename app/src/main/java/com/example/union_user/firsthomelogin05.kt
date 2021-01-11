package com.example.union_user

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class firsthomelogin05 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firsthomelogin05)
    }

    fun firsthomelogin5kelogin(view: View) {
        var firsthomelogin5 = Intent(this,layouthome::class.java)
        startActivity(firsthomelogin5)
    }
}