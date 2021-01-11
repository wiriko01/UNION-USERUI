package com.example.union_user

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class layoutdaftar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layoutdaftar)
    }

    fun SelesaiDaftar(view: View) {
        var selesaiDaftar = Intent(this,layoutlogin::class.java)
        startActivity(selesaiDaftar)
    }
}