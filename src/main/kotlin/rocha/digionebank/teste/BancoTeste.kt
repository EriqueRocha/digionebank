package rocha.digionebank.teste

import rocha.digionebank.Banco

fun main(){

    val digiOneBank = Banco("DigiOne", 12)
    println(digiOneBank.nome+" "+digiOneBank.numero)

    val banco2 = digiOneBank.copy("hehe", 32) // como as váriáveis que estão sendo buscadas são inalteráveis
    println(banco2.nome+" "+banco2.numero)                  //utiliza-se uma copia para alterar seus valores porem usar o escopo

}