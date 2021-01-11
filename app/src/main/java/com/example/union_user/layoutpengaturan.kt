package com.example.union_user

import android.content.DialogInterface
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
                Toast.makeText(this,"Berhasil LogOut", Toast.LENGTH_SHORT).show()
            })
            .setNegativeButton("Batal" ,DialogInterface.OnClickListener{ dialoginterface, i->
                this.finish()
            })
        dialog.show()
    }
}