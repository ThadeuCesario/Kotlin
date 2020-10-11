package fundamentos.operadores

data class Carro(val marca: String, val modelo: String);

fun main(args: Array<String>) {
    /*
    * Veja abaixo que estamos aplicanto o Destructuring através do Kotlin.
    * Basicamente criamos uma classe e instaciamos nosso objeto ao mesmo tempo aplicando o destructuring
    * nos atributos de marca e modelo.
    * */
    val (marca, modelo) = Carro("chevrolet", "corsa");
    println("A marca é $marca");
    println("O modelo é $modelo");

    val (marido, mulher) = listOf<String>("João", "Maria");
    println("Nome do marido: $marido");
    println("Nome da mulher: $mulher");

    val (_, _, terceiroLugar) = listOf<String>("Kimi", "Hamilton", "Alonso");
    println("Verificando o terceiro lugar: $terceiroLugar");

}