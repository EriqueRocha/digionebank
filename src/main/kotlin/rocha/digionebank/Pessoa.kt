package rocha.digionebank

class Pessoa {
    var nome: String = "Erique"
    var cpf: String = "123.345.567-78"
    private set // todo: torna-se inalterável o conteúdo da variável

    /*
    inner class edereco{                 todo: classes dentro de classes são mais recomendadas para utilizar recursos externos, como APIs
        var Rua: String = "teste rua"
    }
*/

}
 fun main(){
     val eu = Pessoa()
     println(eu.nome+" "+eu.cpf)

     //println(eu.edereco().Rua)
 }