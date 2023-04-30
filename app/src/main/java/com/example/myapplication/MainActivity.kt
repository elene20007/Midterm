package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("myFunction","onCreate")

        val ageEditText = findViewById<EditText>(R.id.ageEditText)
        val sendAgeButton = findViewById<Button>(R.id.sendAgeButton)
        val nextButton = findViewById<Button>(R.id.nextButton)

        findViewById<TextView>(R.id.ageTextView).text =
            intent.extras?.getString("AGE","")

        sendAgeButton.setOnClickListener {
            val age = ageEditText.text.toString()
            val intent = Intent(this, MainActivity::class.java)

            intent.putExtra("AGE", age)
            startActivity(intent)
        }
        nextButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)

            startActivity(intent)
        }

    }
    override fun onStart() {
        super.onStart()
        Log.d("myFunction","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("myFunction","onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("myFunction","onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.d("myFunction","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("myFunction","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("myFunction","onDestroy")
    }
}