package Funcoes

import fundamentos.soma

class Operacoes{
    fun somar(a: Int, b: Int): Int{
        return a + b;
    }
}

fun somar(a: Int, b: Int): Int{
    return a + b;
}

fun calc(a: Int, b: Int, funcao: (Int, Int) -> Int): Int{
    return funcao(a, b);
}

fun main(args: Array<String>) {
    /*
    * Observe bem a sintaxe que precisamos seguir para passarmos uma função como parâmetro.
    * No caso abaixo estou passando a função somar que está na classe Operacoes
    * */
    println(calc(10, 20, Operacoes()::somar));

    /*
    * Agora passando a função top level
    * */
    println(calc(5, 15, ::somar));
}