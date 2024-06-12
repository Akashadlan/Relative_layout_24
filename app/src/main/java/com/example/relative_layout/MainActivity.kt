package com.example.relative_layout

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var btnnumber : Button
    lateinit var btnplus : Button
    lateinit var btnminus : Button
    lateinit var btnmul : Button
    lateinit var btndivaid : Button
    var number = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnnumber = findViewById(R.id.btnnumber)
        btnplus = findViewById(R.id.btnplus)
        btnminus = findViewById(R.id.btnminus)
        btnmul = findViewById(R.id.btnmul)
        btndivaid = findViewById(R.id.btndivaid)

        btnnumber.text = number.toString()

        btnplus.setOnClickListener {
            number += 2
            btnnumber.text = number.toString()
        }
        btnminus.setOnClickListener {
            number -= 2
            btnnumber.text = number.toString()
        }
        btnmul.setOnClickListener {
            number *= 2
            btnnumber.text = number.toString()
        }
        btndivaid.setOnClickListener {
            number /= 2
            btnnumber.text = number.toString()
        }
    }
}