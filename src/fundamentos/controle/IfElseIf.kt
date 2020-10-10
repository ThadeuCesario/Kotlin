package fundamentos.controle

fun main(args: Array<String>) {
    val nota: Double = -10.0;

    /*
    * Vamos aplicar o operador range, que é um conceito muito interessante inserido no Kotlin.
    * Para utilizar o operador range, basta colocar esses dois pontos '..'
    * No Caso abaixo estou me referindo ao intervalo de números que estão entre 9 e 10 (incluindo eles!).
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
}