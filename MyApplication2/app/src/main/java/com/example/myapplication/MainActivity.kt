package com.example.myapplication

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.DialogInputBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        val dialogBinding = DialogInputBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button1.setOnClickListener{
            binding.button2.visibility = View.VISIBLE
        }

        binding.button2.setOnClickListener{
            AlertDialog.Builder(this).run{
                setTitle("Input")
                setView(dialogBinding.root)
                setPositiveButton("닫기", null)
                show()
            }
        }
    }
}