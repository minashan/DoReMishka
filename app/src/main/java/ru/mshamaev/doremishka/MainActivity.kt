package ru.mshamaev.doremishka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            val fab1 : View = findViewById(R.id.fab1)
        fab1.setOnClickListener{
            val intent = Intent(this, Skripichny::class.java)
            startActivity(intent)
        }
    }
}