package com.example.union_user

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class PesananActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pesanan)
    }

    fun metodePembayaran(view: View) {
        var metodepembayaran = Intent(this,MetodePembayaran::class.java)
        startActivity(metodepembayaran)
    }
}