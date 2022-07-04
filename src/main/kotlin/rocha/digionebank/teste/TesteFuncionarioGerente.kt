package rocha.digionebank.teste

import rocha.digionebank.Gerente

fun main(){
    val Diana = Gerente("Diana","123232434566", 5000.0, "1313")
   // println(almir.nome+" "+almir.cpf+""+almir.salario) obsoleto, substituido pela linha abaixo
//relatorio(almir) --- método obsoleto tbm, substituida pela debaixo
    PrintRelatorioFuncionario.print(Diana)
    TesteAutenticacao().autentication(Diana)

}
fun relatorio(gerente: Gerente) = println(gerente.toString()) // se tornou obsoleta