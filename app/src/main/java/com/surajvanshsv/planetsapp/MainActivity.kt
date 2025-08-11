package com.surajvanshsv.planetsapp

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)
        val planetList = listOf(
            Planet("Mercury", "0 moons", R.drawable.mercury),
            Planet("Venus", "0 moons", R.drawable.venus),
            Planet("Earth", "1 moon", R.drawable.earth),
            Planet("Mars", "2 moons", R.drawable.mars),
            Planet("Jupiter", "95 moons", R.drawable.jupiter),
            Planet("Saturn", "146 moons", R.drawable.saturn),
            Planet("Uranus", "27 moons", R.drawable.uranus),
            Planet("Neptune", "14 moons", R.drawable.neptune)
        )

        val myadapter = MyCustomAdapter(this,planetList)
        listView.adapter = myadapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}