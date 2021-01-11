package com.example.union_user

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class firsthomelogin03 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firsthomelogin03)
    }

    fun firsthomelogin3kefirsthomelogin4(view: View) {
        var firsthomelogin3 = Intent(this,firsthomelogin04::class.java)
        startActivity(firsthomelogin3)
    }
}