package com.example.union_user

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class layoutvendor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layoutvendor)
    }

    fun searchVendor(view: View) {
        var searchvendor = Intent(this,SearchActivity::class.java)
        startActivity(searchvendor)
    }

    fun boxvendor(view: View) {
        var boxVendor = Intent(this,PesananActivity::class.java)
        startActivity(boxVendor)
    }

    fun notifvendor(view: View) {
        var notif = Intent(this,NotificationActivity::class.java)
        startActivity(notif)
    }

    fun vendortohome(view: View) {
        var vendortohome = Intent(this,layouthome::class.java)
        startActivity(vendortohome)
    }
    fun vendortotoko(view: View) {
        var vendortotoko = Intent(this,layouttoko::class.java)
        startActivity(vendortotoko)
    }
    fun vendortoide(view: View) {
        var vendortoide = Intent(this,IdeActivity::class.java)
        startActivity(vendortoide)
    }
    fun vendortoprofile(view: View) {
        var vendortoprofile = Intent(this,layoutakun::class.java)
        startActivity(vendortoprofile)
    }

    fun halamanvendor(view: View) {
        var halamanvendor = Intent(this,halamanvendor::class.java)
        startActivity(halamanvendor)
    }
}