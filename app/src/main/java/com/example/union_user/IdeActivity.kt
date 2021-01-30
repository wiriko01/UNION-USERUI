package com.example.union_user

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class IdeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ide)
    }

    fun SearchIde(view: View) {
        var searchide = Intent(this,SearchActivity::class.java)
        startActivity(searchide)
    }
    fun BoxIde(view: View) {
        var boxide = Intent(this,PesananActivity::class.java)
        startActivity(boxide)
    }
    fun notifIde(view: View) {
        var notifIde = Intent(this,NotificationActivity::class.java)
        startActivity(notifIde)
    }
    fun Idetohome(view: View) {
        var Idetohome = Intent(this,layouthome::class.java)
        startActivity(Idetohome)
    }
    fun idetovendor(view: View) {
        var idetovendor = Intent(this,layoutvendor::class.java)
        startActivity(idetovendor)
    }
    fun idetotoko(view: View) {
        var idetotoko = Intent(this,layouttoko::class.java)
        startActivity(idetotoko)
    }
    fun idetoprofile(view: View) {
        var idetoprofile = Intent(this,layoutakun::class.java)
        startActivity(idetoprofile)
    }
}