package rocha.digionebank

class Gerente(nome: String, cpf: String, salario: Double,val senha: String): Funcionario(nome, cpf, salario), Login {
    override fun auxilio(): Double = salario*0.4

    override fun loginSuccess(): Boolean = "7878" == senha
}