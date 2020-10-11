package fundamentos

import kotlin.reflect.typeOf

fun main(args: Array<String>) {
    val a = 1; //Tipo inteiro foi inferido.

    /*
    * Lembrando que tudo em Kotlin é objeto.
    * */

    //Convertendo número para string
    //Assim como no Javascript, quando somo um valor numerico com uma string, ocorre um concatenação.
    println(a.toString());
    println(a.toString() + 1);

    //Convertendo string para número
    println("1.9".toDouble());
    println("1.9".toDouble() + 5);

    //Tentando converter para um número, mas se não for válido é inserido o null
    println("Teste".toIntOrNull());

    /* Tentando converter para um número, mas se não for válido estamos aplicando o elvis operator
    * No caso abaixo é atribuído o número 0.
    * */
    println("Teste".toIntOrNull() ?: 0);

    println("1".toInt() + 10);
}