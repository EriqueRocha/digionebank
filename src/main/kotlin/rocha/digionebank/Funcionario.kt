package rocha.digionebank

import java.math.BigDecimal

abstract class Funcionario(nome: String,cpf: String, val salario: Double) : Pessoa(nome, cpf) {

    protected abstract fun auxilio(): Double //protected limita o uso a penas a classe funcionário e a classe filha
                                       //dizendo o tipo que deve retornar

    override fun toString(): String = """ 
        Nome: $nome
        CPF: $cpf
        Salário: $salario
        Auxilio: ${auxilio()}
    """.trimIndent()


}