package com.yzh.learnandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yzh.learnandroid.basic.BaseActivity
import com.yzh.learnandroid.bottomnavigation.MainActivity2
import com.yzh.learnandroid.detail.ItemListActivity
import com.yzh.learnandroid.fullscreen.FullscreenActivity
import com.yzh.learnandroid.login.ui.login.LoginActivity
import com.yzh.learnandroid.navigationdrawer.DrawerActivity
import com.yzh.learnandroid.setting.SettingsActivity
import com.yzh.learnandroid.tabbed.TabbedActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_start.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
        btn_drawer.setOnClickListener {
            startActivity(Intent(this, DrawerActivity::class.java))
        }
        btn_full.setOnClickListener {
            startActivity(Intent(this, FullscreenActivity::class.java))
        }
        btn_detail.setOnClickListener {
            startActivity(Intent(this, ItemListActivity::class.java))
        }
        btn_base.setOnClickListener {
            startActivity(Intent(this, BaseActivity::class.java))
        }
        btn_tabbed.setOnClickListener {
            startActivity(Intent(this, TabbedActivity::class.java))
        }
        btn_login.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
        btn_setting.setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
        }
    }
}