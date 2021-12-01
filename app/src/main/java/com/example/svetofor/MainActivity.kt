package com.example.svetofor

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rootLayout: ConstraintLayout = findViewById(R.id.root_layout)
        val textView: TextView = findViewById(R.id.textView)
        val redButton: Button = findViewById(R.id.button_red)
        val yellowButton: Button = findViewById(R.id.button_yellow)
        val greenButton: Button = findViewById(R.id.button_green)

        redButton.setOnClickListener {
            textView.text = "Красный"
            rootLayout.setBackgroundColor(Color.RED)
        }

        yellowButton.setOnClickListener {
            textView.text = "Желтый"
            rootLayout.setBackgroundColor(Color.YELLOW)
        }

        greenButton.setOnClickListener {
            textView.text = "Зеленый"
            rootLayout.setBackgroundColor(Color.GREEN)
        }
    }
}