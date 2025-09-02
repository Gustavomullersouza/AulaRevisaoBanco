package crud

import entidades.CaixaDAgua
import enumeradores.Material
import java.sql.Connection

fun criarTabelaCaixa(){
    val conectar = EntidadeJDBC(
        url = "jdbc:postgresql://localhost:5432",
        usuario = "postgres",
        senha = "5432",//a senha de voces é essa -> postgres
    )

    //Material: Material,
    //    Capacidade: Int,
    //    Peso: Double,
    //    Preco: BigDecimal,
    //    Altura: Double,
    //    Profundidade: Double,
    //    Largura: Double,

        //Coloque o nome da tabela o mesmo nome da entidade
        val sql = "CREATE TABLE IF NOT EXISTS CaixaDAgua" +
                "(id serial NOT NULL PRIMARY KEY" +
                " Material varchar(255)," +
                " Capacidade float," +
                " Peso float," +
                " Preco float, " +
                " Altura float," +
                " Profundidade float, " +
                " Largura float" +
                ")"
//Cada Coluna da tabela precisa ter o mesmo no dos atributos da Entidade
    val banco = conectar.conectarComBanco()
    val enviarParaBanco = banco!!.createStatement().execute(sql)

    println(enviarParaBanco)

    banco.close()
}

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

    println("largura da caixa")
    val largura = readln().toDouble()

    //Salvar as variáveis agora dentro da classe
    //conecte o atributo da classe a variavel que o usuario digitou
    CaixaDAgua(
        Material = material,
        Capacidade = capacidade,
        Peso = peso,
        Preco = preco,
        Altura = altura,
        Profundidade = profundidade,
        Largura = largura,
        )

}

fun editarCaixa(){

}

fun listarCaixas(){

}

fun excluirCaixa(){

}