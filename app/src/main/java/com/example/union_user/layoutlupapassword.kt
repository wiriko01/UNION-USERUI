package com.example.union_user

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class layoutlupapassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layoutlupapassword)
    }

    fun tofirstlogin(view: View) {
        var tofirstlogin = Intent(this,firstlogin::class.java)
        startActivity(tofirstlogin)
    }
}