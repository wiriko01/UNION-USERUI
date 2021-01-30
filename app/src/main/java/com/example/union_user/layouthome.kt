package com.example.union_user

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class layouthome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layouthome)
    }

    fun SearchHome(view: View) {
        var searchHome = Intent(this,SearchActivity::class.java)
        startActivity(searchHome)
    }

    fun SearchBox(view: View) {
        var searchBox = Intent(this,PesananActivity::class.java)
        startActivity(searchBox)
    }

    fun notif(view: View) {
        var Notif = Intent(this,NotificationActivity::class.java)
        startActivity(Notif)
    }

    fun updateData(view: View) {
        var update = Intent(this,firstloginhome::class.java)
        startActivity(update)
    }

    fun tamuUndangan(view: View) {
        var undangan = Intent(this,TamuUndangan::class.java)
        startActivity(undangan)
    }

    fun hometovendor(view: View) {
        var hometovendor = Intent(this,layoutvendor::class.java)
        startActivity(hometovendor)
    }

    fun hometotoko(view: View) {
        var hometotoko = Intent(this,layouttoko::class.java)
        startActivity(hometotoko)
    }

    fun hometoide(view: View) {
        var hometoide = Intent(this,IdeActivity::class.java)
        startActivity(hometoide)
    }

    fun hometoprofil(view: View) {
        var hometoprofil = Intent(this,layoutakun::class.java)
        startActivity(hometoprofil)
    }


}