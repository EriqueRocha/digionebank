package rocha.digionebank.teste

fun main(){
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}") //name, propriedade do Kotlin
                }

    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")

        //segunda forma de fazer
    }

    val pf = ClienteTipo.PF
    val pj = ClienteTipo.PJ

    println("-- ${pf.name} - ${pf.descricao}")
    println("-- ${pj.name} - ${pj.descricao}")
}