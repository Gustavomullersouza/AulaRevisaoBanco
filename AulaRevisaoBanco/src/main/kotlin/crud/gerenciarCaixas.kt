package crud

import enumeradores.Material

fun cadastrarCaixa(){
    /*
    */
    println("Escolha o material do qual a caixa é composta")
    println("1 - Plástico")
    println("2 - PVC")
    println("3 - Metal")
    println("4 - Argamassa")
    val opcao = readln().toInt()
    var material : Material
    when(opcao){
        1-> material = Material.PASTICO
        2-> material = Material.PVC
        3-> material = Material.METAL
        4-> material = Material.ARGAMASSA
        else ->  material = Material.PASTICO
    }
    println("Capacidade da caixa: ")
    val capacidade = readln().toInt()

    println("peso da caixa")
    val peso = readln().toDouble()

    println("o preco da caixa")
    val preco = readln().toBigDecimal()

    println("altura da caixa")
    val altura = readln().toDouble()

    println("profundidade da caixa")
    val profundidade = readln().toDouble()

}

fun editarCaixa(){

}

fun listarCaixas(){

}

fun excluirCaixa(){

}