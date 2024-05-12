package com.example.neco1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.neco1.constance.Constance
import com.example.neco1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding
    private var login: String = "empty"
    private var pass: String = "empty"
    private var name1: String = "empty"
    private var name2: String = "empty"
    private var name3: String = "empty"
    private var avatarImgId: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)

        setContentView(bindingClass.root)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode==Constance.REQUEST_CODE_SIGN_IN){

        }
    }

    fun onClickSignIn(view: View) {
        val intent = Intent(this, SigninupAct::class.java)
        intent.putExtra(Constance.SIGN_STATE, Constance.SIGN_IN_STATE)
        startActivityForResult(intent, Constance.REQUEST_CODE_SIGN_IN)
    }

    fun onClickSignUp(view: View) {
        val intent = Intent(this, SigninupAct::class.java)
        intent.putExtra(Constance.SIGN_STATE, Constance.SIGN_UP_STATE)
        startActivityForResult(intent, Constance.REQUEST_CODE_SIGN_UP)
    }
}

