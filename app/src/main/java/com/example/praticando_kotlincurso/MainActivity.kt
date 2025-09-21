package com.example.praticando_kotlincurso

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val write: EditText = findViewById(R.id.write)
        val result: TextView = findViewById(R.id.result)
        val buttonclicked: Button = findViewById(R.id.button)

        buttonclicked.setOnClickListener {
            val text = write.text.toString()
            verificarNumero(text, result)
        }
    }
    private fun verificarNumero(text: String, result: TextView) {
        if (text.isEmpty()) {
            Toast.makeText(this, "Coloque um número no campo solicitado", Toast.LENGTH_LONG).show()
            return
        }
        val number = text.toIntOrNull()
        if (number == null) {
            Toast.makeText(this, "Digite apenas números válidos", Toast.LENGTH_LONG).show()
            return
        }
        if (number % 2 == 0) {
            result.text = "O número $number é par ✅"
        } else {
            result.text = "O número $number é ímpar ❌"
        }
    }
}
