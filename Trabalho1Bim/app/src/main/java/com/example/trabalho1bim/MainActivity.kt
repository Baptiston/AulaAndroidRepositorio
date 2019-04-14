package com.example.trabalho1bim

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //CRIA UM METODO PARA O ON CLICK DO BOTAO
        Btn_calcular.setOnClickListener{

            //INFORMA PARA QUAL ACTIV VAI SER ABERTA OU PASSADA VALORES
            val intent = Intent(this, tcalculo::class.java)

            //PEGA OS VALORES CONTIDOS NOS CAMPOS E ADICIONA A CONSTANTES
            val qt_homem = eqt_homem.text.toString()
            val qt_mulher = eqt_mulher.text.toString()
            val qt_crianca = eqt_crianca.text.toString()

            //CRIA VARIAVEL VERIFICADORA PARA VALIDAR OS CAMPOS
            var verificador = 0

            //VALIDACAO DE CAMPOS VAZIOS
            if(qt_homem.equals("")){
                //SE O CAMPO FOR VAZIO ADICIONA UMA DICA PARA O USUARIO PREENCHER O CAMPO
                eqt_homem.setHint("Favor preencha o campo")
                //ADICIONA UM VALOR A VERIFICADORA PARA INFORMAR QUE EXISTEM CAMPOS VAZIOS
                verificador = 1
            }

            //VALIDACAO DE CAMPOS VAZIOS
            if(qt_mulher.equals("")){
                //SE O CAMPO FOR VAZIO ADICIONA UMA DICA PARA O USUARIO PREENCHER O CAMPO
                eqt_mulher.setHint("Favor preencha o campo")
                //ADICIONA UM VALOR A VERIFICADORA PARA INFORMAR QUE EXISTEM CAMPOS VAZIOS
                verificador = 1
            }

            //VALIDACAO DE CAMPOS VAZIOS
            if(qt_crianca.equals("")){
                //SE O CAMPO FOR VAZIO ADICIONA UMA DICA PARA O USUARIO PREENCHER O CAMPO
                eqt_crianca.setHint("Favor preencha o campo")
                //ADICIONA UM VALOR A VERIFICADORA PARA INFORMAR QUE EXISTEM CAMPOS VAZIOS
                verificador = 1
            }

            //VERIFICA SE TODOS OS CAMPOS ESTAO PREENCHIDOS
            if(verificador == 0) {
                //CRIA UM ARRAY DE INTEIROS COM OS VALORES DAS CONSTANTES
                val valores: IntArray= intArrayOf(qt_homem.toInt(), qt_mulher.toInt(), qt_crianca.toInt())
                //val numeros2 = Array(10, { i -> i })

                //PASSA OS VALORES PARA A ACTIVITY
                intent.putExtra("valores", valores)

                //ABRE A ACTIVITY
                startActivity(intent)
            }
        }
    }
}
