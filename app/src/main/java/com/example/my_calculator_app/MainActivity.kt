package com.example.my_calculator_app

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var btnAdd : Button
    lateinit var btnSub : Button
    lateinit var btnMul : Button
    lateinit var btnDiv : Button
    lateinit var A : EditText
    lateinit var B : EditText
    lateinit var  result : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd = findViewById(R.id.btn_add)
        btnSub = findViewById(R.id.btn_sub)
        btnMul = findViewById(R.id.btn_mul)
        btnDiv = findViewById(R.id.btn_div)
        A = findViewById(R.id.a)
        B = findViewById(R.id.b)
        result = findViewById(R.id.result_textview)
    }

    override fun onClick(v: View?) {
        var num_a = A.text.toString().toDouble()
        var num_b = B.text.toString().toDouble()
        var final_result = 0.0
        when(v?.id){
            R.id.btn_add ->{
                final_result = num_a + num_b
            }
            R.id.btn_sub ->{
                final_result = num_a - num_b
            }
            R.id.btn_mul ->{
                final_result = num_a * num_b
            }
            R.id.btn_div ->{
                final_result = num_a / num_b
            }
        }
        result.text = "Result is $final_result"
    }
}
