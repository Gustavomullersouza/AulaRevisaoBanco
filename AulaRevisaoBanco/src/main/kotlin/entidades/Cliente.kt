package entidades

import enumeradores.Nome
import enumeradores.Sexo

class Cliente(
    nome : Nome,
    idade : Int,
    cpf : Int,
    sexo : Sexo,
    val endereco : String,
    val estadocivil : String,
    val pedidos: Array<String>
) : Pessoa(
    nome = nome,
    idade = idade,
    cpf = cpf,
    sexo = sexo) {


}