package fundamentos.operadores

fun main(args: Array<String>) {
    val nota: Double = 9.0;
    val resultado: String = if(nota >= 7) "Aprovado" else "Reprovado";

    println("Resultado $resultado");
}