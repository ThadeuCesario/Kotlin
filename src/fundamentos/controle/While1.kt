package fundamentos.controle

fun main(args: Array<String>) {
    var opcao: Int = 0;

    while(opcao != -1){
        /*
        * O readLine() é utilizado para ler uma entrada no console.
        * */
        val line = readLine() ?: "0";
        opcao = line.toIntOrNull() ?: 0;

        println("Você escolheu a opção ${opcao}");
    }

    println("Até a próxima");
}