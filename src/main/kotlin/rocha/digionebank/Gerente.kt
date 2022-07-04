package rocha.digionebank

class Gerente(nome: String, cpf: String, salario: Double): Funcionario(nome, cpf, salario) {
    override fun auxilio(): Double = salario*0.4
}