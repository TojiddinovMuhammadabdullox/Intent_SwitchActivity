package com.example.mdan8

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mdan8.databinding.ActivityMainBinding
import com.example.mdan8.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.doneBtn.setOnClickListener {
            val intent = Intent()
        val age = binding.ageET.text.toString()
            intent.putExtra("age", age)
            setResult(Activity.RESULT_OK,intent)
            finish()
        }
    }
}