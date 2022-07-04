package rocha.digionebank.teste

import rocha.digionebank.Funcionario

class PrintRelatorioFuncionario {
    companion object{ // invocar metodos estático via classe e não instancia
        fun print(funcionario: Funcionario){
            println(funcionario.toString())
        }
    }
}