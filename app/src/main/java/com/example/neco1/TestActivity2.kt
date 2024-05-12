package com.example.neco1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.neco1.databinding.ActivityTest2Binding


class TestActivity2:AppCompatActivity() {
    lateinit var bindingClass: ActivityTest2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityTest2Binding.inflate(layoutInflater)

        setContentView(bindingClass.root)


    }
}