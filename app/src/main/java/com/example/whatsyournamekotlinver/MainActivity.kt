package com.example.whatsyournamekotlinver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.whatsyournamekotlinver.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        // おまじない
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //「押してね」ボタンを押したら
        binding.button.setOnClickListener {
            Log.d("hoge","クリックリスナーに入った")
            // 1. 「〇〇(入力した文字)さん、こんにちは」という文字を出す
            binding.textView.text = binding.editTextText.text.toString() + "さん、こんにちは"

            // 2. 画像を出す
            binding.imageView.visibility = View.VISIBLE
        }
    }
}
