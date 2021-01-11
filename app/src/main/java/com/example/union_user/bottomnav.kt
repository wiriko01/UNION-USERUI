package com.example.union_user

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_bottomnav.*

class bottomnav : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottomnav)

        loadFragment(HomeFragment())

        buttonNavigationView.setOnNavigationItemReselectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.navigationhome -> {
                    loadFragment(HomeFragment())
                    true
                }
                R.id.navigationvendor -> {
                    loadFragment(VendorFragment())
                    true
                }
                R.id.navigationshop -> {
                    loadFragment(ShopFragment())
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