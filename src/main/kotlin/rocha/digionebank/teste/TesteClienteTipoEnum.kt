package rocha.digionebank.teste

fun main(){
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - $elemento")
                }

    ClienteTipo.values().forEach {
        println("${it.name} - ${it}")

        //segunda forma de fazer
    }
}