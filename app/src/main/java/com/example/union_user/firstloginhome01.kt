package com.example.union_user

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class firstloginhome01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firstloginhome01)
    }

    fun firsthomelogin1kefirsthomelogin2(view: View) {
        var firsthomelogin01 = Intent(this,firsthomelogin02::class.java)
        startActivity(firsthomelogin01)
    }
}