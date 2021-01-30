package com.example.union_user

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class halamanvendor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halamanvendor)
    }

    fun rincian(view: View) {
        var rincianvendor = Intent(this,RincianVendor::class.java)
        startActivity(rincianvendor)
    }
}