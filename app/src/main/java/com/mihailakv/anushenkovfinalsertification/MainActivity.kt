package com.mihailakv.anushenkovfinalsertification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView

private const val LAST_SELECTED_ITEM = "LAST_SELECTED_ITEM"

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavigationMenu: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavigationMenu = findViewById(R.id.bottom_navigation_menu)
        bottomNavigationMenu.setOnItemSelectedListener { item ->
            var fragment: Fragment? = null
            when (item.itemId) {
                R.id.main -> {
                    fragment = MainFragment()
                }
                R.id.cart -> {
                    fragment = CartFragment()
                }
                R.id.share -> {
                    fragment = ShareFragment()
                }
            }
            replaceFragment(fragment!!)
            true
        }

        bottomNavigationMenu.selectedItemId =
            savedInstanceState?.getInt(LAST_SELECTED_ITEM) ?: R.id.main
    }


    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(LAST_SELECTED_ITEM, bottomNavigationMenu.selectedItemId)
        super.onSaveInstanceState(outState)
    }

    private fun replaceFragment (fragment:Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container,fragment)
            .addToBackStack(null)
            .commit()
    }
}