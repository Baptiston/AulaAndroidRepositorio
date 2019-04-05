package com.example.trabalhocaracoroa

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Jogar.setOnClickListener{
            val intent = Intent(this, ACara::class.java)

            val num = Random().nextInt(2)

            intent.putExtra("num", num)

            startActivity(intent)
        }
    }


}
