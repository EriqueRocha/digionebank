package rocha.digionebank.teste

import rocha.digionebank.Funcionario
import rocha.digionebank.Pessoa
import java.math.BigDecimal

fun main(){
    val eu = Pessoa("Erique", "123232434566")
    println(eu.nome+" "+eu.cpf)

    val almir = Funcionario("Almir","123232434566", BigDecimal.valueOf(2000.0))
    println(almir.nome+" "+almir.cpf+""+almir.salario)

}