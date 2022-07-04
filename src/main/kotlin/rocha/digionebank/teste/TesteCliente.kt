package rocha.digionebank.teste

import rocha.digionebank.Cliente

fun main(){
    val Andressa = Cliente("Andressa", "123.456.789-89", ClienteTipo.PF, "1593")

    println(Andressa)
    TesteAutenticacao().autentication(Andressa)

}