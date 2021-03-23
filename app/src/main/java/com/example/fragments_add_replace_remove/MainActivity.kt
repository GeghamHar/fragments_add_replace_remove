package com.example.fragments_add_replace_remove

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    val addFragment = AddFragment()
    val replaceFragment = ReplaceFragment()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonAdd = findViewById<Button>(R.id.button_add)
        val buttonReplace = findViewById<Button>(R.id.button_replace)
        val buttonRemove = findViewById<Button>(R.id.button_remove)

        buttonAdd.setOnClickListener {
            supportFragmentManager.beginTransaction().add(R.id.container,addFragment).commit()
        }

        buttonReplace.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.container,replaceFragment).commit()
        }

        buttonRemove.setOnClickListener {
            supportFragmentManager.beginTransaction().remove(replaceFragment).commit()
        }

    }
}