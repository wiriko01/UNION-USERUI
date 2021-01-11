package com.example.union_user

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_bottomnav.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadFragment(HomeFragment())

        buttonNavigationView.setOnNavigationItemReselectedListener { menuItem ->
            when {
                menuItem.itemId == R.id.navigationhome -> {
                    loadFragment(HomeFragment())
                    true
                }
                menuItem.itemId == R.id.navigationvendor -> {
                    loadFragment(VendorFragment())
                    true
                }
                menuItem.itemId == R.id.navigationshop-> {
                    loadFragment(ShopFragment())
                    true
                }
                menuItem.itemId == R.id.navigationide-> {
                    loadFragment(IdeFragment())
                    true
                }
                menuItem.itemId == R.id.navigationprofile-> {
                    loadFragment(ProfileFragment())
                    true
                }
                else -> {
                    false
                }
            }
        }
    }
    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().also { fragmentTransaction ->
            fragmentTransaction.replace(R.id.frameContainer, fragment)
            fragmentTransaction.commit()
        }
    }
}