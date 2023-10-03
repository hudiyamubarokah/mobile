package com.example.hud_kalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var edt_length: EditText
    private lateinit var edt_width: EditText
    private lateinit var edt_height: EditText
    private lateinit var btn_result: Button
    private lateinit var result: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edt_length = findViewById(R.id.edt_length)
        edt_width = findViewById(R.id.edt_width)
        edt_height = findViewById(R.id.edt_height)
        btn_result = findViewById(R.id.btn_result)
        result = findViewById(R.id.result)
        btn_result.setOnClickListener {

            var panjang = edt_length.text.toString().trim()
            var lebar = edt_width.text.toString().trim()
            var tinggi = edt_height.text.toString().trim()

            var isEmpty = false
            if (panjang.isEmpty()) {
                isEmpty = true
                edt_length.error = "wajib diisi"
            }
            if (lebar.isEmpty()) {
                isEmpty = true
                edt_width.error = "wajib diisi"
            }
            if (tinggi.isEmpty()) {
                isEmpty = true
                edt_height.error = "wajib diisi"
            }
            if (!isEmpty) {
                var volume = panjang.toDouble() * lebar.toDouble() * tinggi.toDouble()
                result.text = volume.toString()
            }
        }
    }
}