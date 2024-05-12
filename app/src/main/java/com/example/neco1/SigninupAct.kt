package com.example.neco1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.neco1.databinding.ActSigninupBinding


class SigninupAct : AppCompatActivity() {
    lateinit var bindingClass: ActSigninupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActSigninupBinding.inflate(layoutInflater)

        setContentView(bindingClass.root)
    }
}