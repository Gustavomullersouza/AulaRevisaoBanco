package entidades

import enumeradores.Funcao
import enumeradores.Nome
import enumeradores.Setor
import enumeradores.Sexo
import java.math.BigDecimal

class Profissional(
    val salario: BigDecimal,
    val funcao: Funcao,
    val experincia: String,
    val habilidade: String,
    val uniforme: String,
    val setor: Setor,
    sexo: Sexo,
    nome: Nome,
    cpf: Int,
    idade: Int,

                   ) : Pessoa(
    nome = nome,
    cpf = cpf,
    idade = idade,
    sexo = sexo,)
{
    //Comportamentos do Profissional
    fun instalarCaixaDAgua(clt : Profissional){
        if (clt.setor.equals(Setor.MONTAGEM)) {
            println("Profissional qualificado")
        } else {
            println("Profissional desqualificado")
        }
    }
    //O Polimorfismo nada mais é do que fazer uma SOBREESCRITA do
    //metodo que está na superclasse
    override fun receberConta(conta : Conta,aPagar : BigDecimal,) {
        conta.saldo = conta.saldo.subtract(aPagar)
    }
}