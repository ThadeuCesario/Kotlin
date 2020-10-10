package fundamentos.controle

fun main(args: Array<String>) {
    val nota: Double = -10.0;

    /*
    * Vamos aplicar o operador range, que é um conceito muito interessante inserido no Kotlin.
    * Para utilizar o operador range, basta colocar esses dois pontos '..'
    * No Caso abaixo estou me referindo ao intervalo de números que estão entre 9 e 10 (incluindo eles!).
    * Cuidado que no caso abaixo estamos verificando em um Range de valores INTEIROS.
    * Portanto quando ele pegar o valor de notas, será feito um truncamento do valor antes de realizar a comparação dentro
    * do range.
    * */
    if (nota in 9..10){
        println("Fantástico");
    } else if (nota in 7..8){
        println("Parabéns");
    } else if (nota in 4..6){
        println("Tem como recuperar");
    } else if (nota in 0..3){
        println("Te vejo no próximo semestre.")
    } else {
        println("Nota inválida");
    }


    /*
    * Analisando o código abaixo, estamos questionando se o valor 5 está entre o range de 7 e 4.
    * Bem.. sabemos que está, porém o retorno abaixo será FALSE.
    * Isso porque, o range funciona sempre do menor para o maior! Não podemos fazer da forma que está que
    * é do maior para o menor.
    * */
    println(5 in 7..4); // false
    println(5 in 4..7); // true
}