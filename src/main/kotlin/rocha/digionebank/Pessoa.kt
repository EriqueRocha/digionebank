package rocha.digionebank

class Pessoa {
    var nome: String = "Erique" // definir a variável como "private" torna privada tbm as funções get e set
    var cpf: String = "123.345.567-78"
    private set // todo: torna-se inalterável o conteúdo da variável

    /*
    inner class edereco{                 todo: classes dentro de classes são mais recomendadas para utilizar recursos externos, como APIs
        var Rua: String = "teste rua"
    }
*/

    constructor() //construtor secundário
    fun nomeCpf()= "$nome e $cpf"

}
 fun main(){
     val eu = Pessoa()
     println(eu.nome+" "+eu.cpf)
     println(eu.nomeCpf())
     //println(eu.edereco().Rua)
 }