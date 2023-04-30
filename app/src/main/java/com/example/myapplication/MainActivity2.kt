package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val clickButton = findViewById<Button>(R.id.clickButton)

        findViewById<EditText>(R.id.editText).text =
            intent.extras?.getString("NUMBER","0")

        clickButton.setOnClickListener {
            val num = findViewById<EditText>(R.id.editText).toString();
            val newNum = (num.toInt()+1).toString();
            val intent = Intent(this, MainActivity2::class.java)

            intent.putExtra("NUMBER", newNum)
            startActivity(intent)
        }
    }
}