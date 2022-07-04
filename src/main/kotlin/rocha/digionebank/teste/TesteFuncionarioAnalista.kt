package rocha.digionebank.teste

import rocha.digionebank.Analista
import rocha.digionebank.Funcionario

fun main(){
    val almir = Analista("Almir","123232434566", 2000.0)
   // println(almir.nome+" "+almir.cpf+""+almir.salario) obsoleto, substituido pela linha abaixo
    //relatorio(almir) --- método obsoleto tbm, substituida pela debaixo
    PrintRelatorioFuncionario.print(almir)
}

fun relatorio(funcionario: Funcionario) = println(funcionario.toString()) //função obsoleta