package entidades

import enumeradores.Nome
import enumeradores.Sexo
import java.math.BigDecimal

open class Pessoa(
    val nome: Nome,
    val cpf: Int,
    val sexo : Sexo,
    val idade : Int
) {
    //Comportamento
    open fun receberConta(conta : Conta,aReceber : BigDecimal,){
        conta.saldo = conta.saldo.add(aReceber)

    }
}