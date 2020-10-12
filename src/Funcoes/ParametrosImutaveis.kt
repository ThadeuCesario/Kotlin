package Funcoes

/*
* Um parâmetro imutável significa que não podemos mudar a referência para onde este parâmetro aponta.
* Podemos até mudar os parâmetros internos, porém não podemos mudar a referência.
*
* Obs.: Todos os parâmetros de uma função, são constantes. Podemos alterar os valores internos, porém não podemos
* é realizar uma reatribuição.
* */

fun incremento(num: Int){
    //num++; // num = num + 1;
}

fun main(args: Array<String>) {
    incremento(5);
}