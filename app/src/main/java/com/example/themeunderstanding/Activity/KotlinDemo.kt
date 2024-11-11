package com.example.themeunderstanding.Activity

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.themeunderstanding.R
import com.example.themeunderstanding.databinding.ActivityKotlinDemoBinding

class KotlinDemo : AppCompatActivity(), View.OnClickListener {

    lateinit var binding : ActivityKotlinDemoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKotlinDemoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener(this)
        binding.button2.setOnClickListener(this)
        binding.button3.setOnClickListener(this)
        binding.button4.setOnClickListener(this)
    }

    override fun onClick(v: View?){
        var a = binding.editTextText3.text.toString().toDouble();
        var b = binding.editTextText4.text.toString().toDouble();
        var result = 0.0
        when(v?.id){
           R.id.button ->  result = a+b
           R.id.button2 -> result = a*b
           R.id.button3 -> result = a-b
           R.id.button4 -> result = a/b
        }
        binding.textView4.text= result.toString()
    }
}