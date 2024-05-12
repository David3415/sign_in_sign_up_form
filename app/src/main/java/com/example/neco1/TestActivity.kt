package com.example.neco1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.neco1.databinding.ActivityTestBinding


class TestActivity:AppCompatActivity() {
    lateinit var bindingClass: ActivityTestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityTestBinding.inflate(layoutInflater)

        setContentView(bindingClass.root)


    }
}