package com.example.neco1

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.neco1.constance.Constance
import com.example.neco1.databinding.ActSigninupBinding


class SigninupAct : AppCompatActivity() {
    lateinit var bindingClass: ActSigninupBinding
    private var signState = "empty"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActSigninupBinding.inflate(layoutInflater)

        setContentView(bindingClass.root)

        signState = intent.getStringExtra(Constance.SIGN_STATE)!!
        if (signState == Constance.SIGN_IN_STATE) {
            bindingClass.edName1.visibility = View.GONE
            bindingClass.edName2.visibility = View.GONE
            bindingClass.edName3.visibility = View.GONE
            bindingClass.bAvatar.visibility = View.INVISIBLE
        }
    }

    fun onClickDone(view: View) {
        if (signState == Constance.SIGN_UP_STATE) {
            val intent = Intent()
            intent.putExtra(Constance.LOGIN, bindingClass.edLogin.text.toString())
            intent.putExtra(Constance.PASS, bindingClass.edPass.text.toString())
            intent.putExtra(Constance.NAME1, bindingClass.edName1.text.toString())
            intent.putExtra(Constance.NAME2, bindingClass.edName2.text.toString())
            intent.putExtra(Constance.NAME3, bindingClass.edName2.text.toString())
            setResult(RESULT_OK, intent)
            finish()
        } else if (signState == Constance.SIGN_IN_STATE) {
            intent.putExtra(Constance.LOGIN, bindingClass.edLogin.text.toString())
            intent.putExtra(Constance.PASS, bindingClass.edPass.text.toString())
        }
    }

    fun onClickAvatar(view: View) {
        bindingClass.imAvatar.visibility = View.VISIBLE
    }
}