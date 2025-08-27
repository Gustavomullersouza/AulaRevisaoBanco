package entidades

import enumeradores.Funcao
import enumeradores.Material
import enumeradores.Nome
import enumeradores.Setor
import enumeradores.Sexo
import java.math.BigDecimal

class CaixaDAgua(//os 2 parenteses Construtor da classe
    val material: Material,
    val capacidade: Int,
    val peso: Double,
    val preco: BigDecimal?,
    val altura: Double,
    val profundidade: Double,
    val largura: Double,

    //val dimenssao : Array <Double>, // Altura, Largura. Profundidade

)//Aqui vai todos os atributos da classe
{ }


