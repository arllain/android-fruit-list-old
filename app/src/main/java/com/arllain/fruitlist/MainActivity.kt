package com.arllain.fruitlist

import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fabAddFruit).setOnClickListener { view ->
            val addFruitActivity = Intent(this, AddFruitActivity::class.java)
            startActivity(addFruitActivity)
        }
    }
}