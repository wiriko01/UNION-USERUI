package com.example.union_user

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class firstlogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firstlogin)
    }
    fun homekedaftar(view: View) {
        var homekedaftar = Intent(this,layoutdaftar::class.java)
        startActivity(homekedaftar)
    }

    fun homekelogin(view: View) {
        var homekelogin = Intent(this,layoutlogin::class.java)
        startActivity(homekelogin)
    }
}