package rocha.digionebank

import java.math.BigDecimal

class Analista(nome: String, cpf: String, salario: Double): Funcionario(nome, cpf, salario) {
    override fun auxilio()= salario*0.1

}