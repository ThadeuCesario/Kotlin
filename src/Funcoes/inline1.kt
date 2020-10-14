package Funcoes

inline fun transacao(funcao: () -> Unit, a: Int) {
    println("Abrindo transação");

    try{
        funcao()
    } finally {
        //Caso o bloco try gere ou não um erro o bloco finally será chamado.
        println("Fechando transação");
    }
}

fun main(args: Array<String>) {
    /*
    * Observe bem a sintaxe que utilizamos para passar uma função inline.
    * */
    transacao({
        println("Executando comando SQL 1....");
        println("Executando comando SQL 2....");
        println("Executando comando SQL 3....");
    }, 2);
}