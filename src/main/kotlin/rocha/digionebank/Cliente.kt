package rocha.digionebank

import rocha.digionebank.teste.ClienteTipo

class Cliente(nome: String, cpf: String,val clienteTipo: ClienteTipo, val senha: String): Pessoa(nome, cpf), Login {
    override fun loginSuccess(): Boolean = "1593" == senha
    override fun toString(): String = """ 
        Nome: $nome
        CPF: $cpf
        Tipo: ${clienteTipo.descricao}
    """.trimIndent()


}