package com.example.union_user

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class layouttoko : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layouttoko)
    }

    fun searchtoko(view: View) {
        var searchToko = Intent(this,SearchActivity::class.java)
        startActivity(searchToko)
    }
    fun boxtoko(view: View) {
        var boxToko = Intent(this,PesananActivity::class.java)
        startActivity(boxToko)
    }
    fun notiftoko(view: View) {
        var notiftoko = Intent(this,NotificationActivity::class.java)
        startActivity(notiftoko)
    }
    fun tokotohome(view: View) {
        var tokotoHome = Intent(this,layouthome::class.java)
        startActivity(tokotoHome)
    }
    fun tokotovendor(view: View) {
        var tokotoVendor = Intent(this,layoutvendor::class.java)
        startActivity(tokotoVendor)
    }
    fun tokotoide(view: View) {
        var tokotoide = Intent(this,IdeActivity::class.java)
        startActivity(tokotoide)
    }
    fun tokotoprofile(view: View) {
        var tokotoprofile = Intent(this,layoutakun::class.java)
        startActivity(tokotoprofile)
    }
}