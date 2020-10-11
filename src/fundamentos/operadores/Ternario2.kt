package fundamentos.operadores

fun obterResultado(nota: Double): String = if (nota >= 7.0) "Aprovado" else "Reprovado";

fun main(args: Array<String>) {
    println(obterResultado(5.3));
}