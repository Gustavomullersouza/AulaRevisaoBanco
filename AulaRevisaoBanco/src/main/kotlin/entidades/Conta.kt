package entidades

import java.math.BigDecimal

class Conta (
    val pessoa : Pessoa,
    var saldo : BigDecimal,
    val id : Long,
    val saque : BigDecimal,
    val deposito : BigDecimal,
    val recebimento : BigDecimal,
    val pagamento : BigDecimal,
    val numeroConta : Int,
){
    }
