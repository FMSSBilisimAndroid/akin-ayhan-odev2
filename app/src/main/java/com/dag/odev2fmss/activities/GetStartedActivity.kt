package com.dag.odev2fmss.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.dag.odev2fmss.R
import com.dag.odev2fmss.databinding.ActivityGetStartedBinding

class GetStartedActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGetStartedBinding
    private lateinit var loginIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Odev2FMSS)
        super.onCreate(savedInstanceState)
        loginIntent = Intent(this, LoginActivity::class.java)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_get_started)
        binding.btnJoinNow.setOnClickListener {
            startActivity(loginIntent)
        }
    }
}