package com.example.trabalho1bim

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tcalculo.*

class tcalculo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tcalculo)

        //PEGA OS EXTRAS QUE FORAM PASSADOS
        val valoresCalculo : Bundle = intent.extras

        //PEGA O ARRAY CONTIDO DENTRO DO valoresCalculo
        val valores = valoresCalculo.getIntArray("valores")

        //PEGA OS VALORES CONTIDOS DENTRO DO ARRAY E ADICIONA AS CONSTANTES POR POSICAO DO ARRAY
        val qt_homem = valores[0]
        val qt_mulher = valores[1]
        val qt_crianca = valores[2]

        //CRIA VARIAVEIS DE TOTAIS DE INGREDIENTES
        var Tpicanha = 0
        var Tmaminha = 0
        var Tlinguica = 0
        var Tfrango = 0
        var Tarroz = 0
        var Tbatata = 0
        var Tfarofa = 0
        var Tpaes = 0.0

        //VERIFICA SE EXISTE AO MENOS 1 HOMEM E EFETUA OS CALCULOS DE INGREDIENTES NECESSÁRIOS
        if(qt_homem > 0){
            Tpicanha += qt_homem * 240
            Tmaminha += qt_homem * 80
            Tlinguica += qt_homem * 40
            Tfrango += qt_homem * 40
            Tarroz += qt_homem * 100
            Tbatata += qt_homem * 200
            Tfarofa += qt_homem * 100
            Tpaes += qt_homem * 1.5
        }

        //VERIFICA SE EXISTE AO MENOS 1 MULHER E EFETUA OS CALCULOS DE INGREDIENTES NECESSÁRIOS
        if(qt_mulher > 0){
            Tpicanha += qt_mulher * 180
            Tmaminha += qt_mulher * 60
            Tlinguica += qt_mulher * 30
            Tfrango += qt_mulher * 30
            Tarroz += qt_mulher * 80
            Tbatata += qt_mulher * 150
            Tfarofa += qt_mulher * 80
            Tpaes += qt_mulher * 1.5
        }

        //VERIFICA SE EXISTE AO MENOS 1 CRIANCA E EFETUA OS CALCULOS DE INGREDIENTES NECESSÁRIOS
        if(qt_crianca > 0){
            Tpicanha += qt_crianca * 120
            Tmaminha += qt_crianca * 40
            Tlinguica += qt_crianca * 20
            Tfrango += qt_crianca * 20
            Tbatata += qt_crianca * 100
        }

        //VERIFICA SE A QUANTIDADE TOTAL DE PICANHA É SUPERIOR OU IGUAL A 1000
        if(Tpicanha >= 1000){
            //SE FOR DIVIDE O VALOR POR 1000 PARA TRANSFORMAR EM KG CONVERTE EM STRING E ADICIONA KG NO FINAL
            // E SETA NO ATRIBUTO TEXT DO CAMPO
            TEpicanha.setText((Tpicanha / 1000).toString() + " Kg")
        }else{
            //SENAO CONVERTE O VALOR EM STRING E ADICIONA G NO FINAL E SETA NO ATRIBUTO TEXT DO CAMPO
            TEpicanha.setText(Tpicanha.toString() + " g")
        }

        //VERIFICA SE A QUANTIDADE TOTAL DE MAMINHA É SUPERIOR OU IGUAL A 1000
        if(Tmaminha >= 1000){
            //SE FOR DIVIDE O VALOR POR 1000 PARA TRANSFORMAR EM KG CONVERTE EM STRING E ADICIONA KG NO FINAL
            // E SETA NO ATRIBUTO TEXT DO CAMPO
            TEmaminha.setText((Tmaminha / 1000).toString() + " Kg")
        }else{
            //SENAO CONVERTE O VALOR EM STRING E ADICIONA G NO FINAL E SETA NO ATRIBUTO TEXT DO CAMPO
            TEmaminha.setText(Tmaminha.toString() + " g")
        }

        //VERIFICA SE A QUANTIDADE TOTAL DE LINGUICA É SUPERIOR OU IGUAL A 1000
        if(Tlinguica >= 1000){
            //SE FOR DIVIDE O VALOR POR 1000 PARA TRANSFORMAR EM KG CONVERTE EM STRING E ADICIONA KG NO FINAL
            // E SETA NO ATRIBUTO TEXT DO CAMPO
            TElinguica.setText((Tlinguica / 1000).toString() + " Kg")
        }else{
            //SENAO CONVERTE O VALOR EM STRING E ADICIONA G NO FINAL E SETA NO ATRIBUTO TEXT DO CAMPO
            TElinguica.setText(Tlinguica.toString() + " g")
        }

        //VERIFICA SE A QUANTIDADE TOTAL DE FRANGO É SUPERIOR OU IGUAL A 1000
        if(Tfrango >= 1000){
            //SE FOR DIVIDE O VALOR POR 1000 PARA TRANSFORMAR EM KG CONVERTE EM STRING E ADICIONA KG NO FINAL
            // E SETA NO ATRIBUTO TEXT DO CAMPO
            TEfrango.setText((Tfrango / 1000).toString() + " Kg")
        }else{
            //SENAO CONVERTE O VALOR EM STRING E ADICIONA G NO FINAL E SETA NO ATRIBUTO TEXT DO CAMPO
            TEfrango.setText(Tfrango.toString() + " g")
        }

        //VERIFICA SE A QUANTIDADE TOTAL DE ARROZ É SUPERIOR OU IGUAL A 1000
        if(Tarroz >= 1000){
            //SE FOR DIVIDE O VALOR POR 1000 PARA TRANSFORMAR EM KG CONVERTE EM STRING E ADICIONA KG NO FINAL
            // E SETA NO ATRIBUTO TEXT DO CAMPO
            TEarroz.setText((Tarroz / 1000).toString() + " Kg")
        }else{
            //SENAO CONVERTE O VALOR EM STRING E ADICIONA G NO FINAL E SETA NO ATRIBUTO TEXT DO CAMPO
            TEarroz.setText(Tarroz.toString() + " g")
        }

        //VERIFICA SE A QUANTIDADE TOTAL DE BATATA É SUPERIOR OU IGUAL A 1000
        if(Tbatata >= 1000){
            //SE FOR DIVIDE O VALOR POR 1000 PARA TRANSFORMAR EM KG CONVERTE EM STRING E ADICIONA KG NO FINAL
            // E SETA NO ATRIBUTO TEXT DO CAMPO
            TEbatata.setText((Tbatata / 1000).toString() + " Kg")
        }else{
            //SENAO CONVERTE O VALOR EM STRING E ADICIONA G NO FINAL E SETA NO ATRIBUTO TEXT DO CAMPO
            TEbatata.setText(Tbatata.toString() + " g")
        }

        //VERIFICA SE A QUANTIDADE TOTAL DE FAROFA É SUPERIOR OU IGUAL A 1000
        if(Tfarofa >= 1000){
            //SE FOR DIVIDE O VALOR POR 1000 PARA TRANSFORMAR EM KG CONVERTE EM STRING E ADICIONA KG NO FINAL
            // E SETA NO ATRIBUTO TEXT DO CAMPO
            TEfarofa.setText((Tfarofa / 1000).toString() + " Kg")
        }else{
            //SENAO CONVERTE O VALOR EM STRING E ADICIONA G NO FINAL E SETA NO ATRIBUTO TEXT DO CAMPO
            TEfarofa.setText(Tfarofa.toString() + " g")
        }

        //CONVERTE O VALOR PRA STRING E ADICIONA UNIT E SETA NO ATRIBUTO TEXT DO CAMPO
        TEpaes.setText(Tpaes.toString() + " Unit")

        //CRIA UM METODOD E SETA NA PROPRIEDADE ONCLICK DO BOTAO
        btn_voltar.setOnClickListener{
            //FINALIZA A ACTIVITY
            finish()
        }
    }
}
