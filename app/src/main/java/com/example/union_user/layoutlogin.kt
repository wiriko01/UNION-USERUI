package com.example.union_user

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class layoutlogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layoutlogin)
    }

    fun homekelupapassword(view: View) {
        var homekelupapassword = Intent(this,layoutlupapassword::class.java)
        startActivity(homekelupapassword)
    }

    fun homekeloginpertamakali(view: View) {
        var homekeloginpertamakali = Intent(this,firstloginhome::class.java)
        startActivity(homekeloginpertamakali)
    }
}