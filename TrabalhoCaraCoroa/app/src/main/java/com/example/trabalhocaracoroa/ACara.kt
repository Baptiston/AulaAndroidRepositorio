package com.example.trabalhocaracoroa

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_acara.*

class ACara : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acara)


        val dados : Bundle = intent.extras
        val num = dados.getInt("num")


        if(num == 0){

            img_campo.setImageResource(R.drawable.moeda_cara)
            Txv_text.setText("Cara !")
        }else {

            img_campo.setImageResource(R.drawable.moeda_coroa)
            Txv_text.setText("Coroa !")
        }

        voltar.setOnClickListener {
            finish()

        }
    }


}
