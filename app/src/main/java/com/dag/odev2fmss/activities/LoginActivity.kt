package com.dag.odev2fmss.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.dag.odev2fmss.R
import com.dag.odev2fmss.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var singUpIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Odev2FMSS)
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)

        singUpIntent = Intent(this,SingUpActivity::class.java)

        binding.txtOrCreate.setOnClickListener(){
            startActivity(singUpIntent)
        }
    }
}