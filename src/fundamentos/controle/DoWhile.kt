package fundamentos.controle

fun main(args: Array<String>) {
    var opcao: Int = -1;

    /*
    * Como estamos utilizando o Do While, até podemos inicializar nossa opção com o valor -1.
    * Isso porque obrigatoriamente o bloco DO será executado pelo menos uma vez, portanto será solicitado para
    * o usuário que insira um número no console.
    * */

    do {
        val line = readLine() ?: "0";
        opcao = line.toIntOrNull() ?: 0;
        println("Você escolheu a opção $opcao");
    } while(opcao != -1);

    println("Até a próxima");
}