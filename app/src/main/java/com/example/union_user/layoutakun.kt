package com.example.union_user

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class layoutakun : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layoutakun)
    }

    fun akunsettings(view: View) {
        var akunsetting = Intent(this,layoutpengaturan::class.java)
        startActivity(akunsetting)
    }
    fun cariide(view: View) {
        var cariide = Intent(this,IdeActivity::class.java)
        startActivity(cariide)
    }
    fun akuntohome(view: View) {
        var akuntohome = Intent(this,layouthome::class.java)
        startActivity(akuntohome)
    }
    fun akuntovendor(view: View) {
        var akuntovendor = Intent(this,layoutvendor::class.java)
        startActivity(akuntovendor)
    }
    fun akuntotoko(view: View) {
        var akuntotoko = Intent(this,layouttoko::class.java)
        startActivity(akuntotoko)
    }
    fun akuntoide(view: View) {
        var akuntoide = Intent(this,IdeActivity::class.java)
        startActivity(akuntoide)
    }
}