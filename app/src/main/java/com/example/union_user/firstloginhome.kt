package com.example.union_user

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class firstloginhome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firstloginhome)
    }

    fun firsthomeloginkefirsthomelogin1(view: View) {
        var firsthomelogin0 = Intent(this,firstloginhome01::class.java)
        startActivity(firsthomelogin0)
    }
}