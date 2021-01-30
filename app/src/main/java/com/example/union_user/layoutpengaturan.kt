package com.example.union_user

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class layoutpengaturan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layoutpengaturan)
    }

    fun logoutalertdialog(view: View) {
        var dialog = AlertDialog.Builder(this)
            .setTitle("Yakin Melakukan LogOut ?")
            .setPositiveButton("Ya", DialogInterface.OnClickListener{dialoginterface, i ->
                var tofirstlogin = Intent(this,firstlogin::class.java)
                startActivity(tofirstlogin)
            })
            .setNegativeButton("Batal" ,DialogInterface.OnClickListener{ dialoginterface, i->
                this.finish()
            })
        dialog.show()
    }

    fun changeintent() {
        var change = Intent(this,layoutpengaturan::class.java)
        startActivity(change)
    }
}