package fundamentos.controle

fun main(args: Array<String>) {
    val initialValue: Int = 1;
    val maxValue: Int = 10;
    for(value in initialValue..maxValue){
        println("Verificando o valor do contador $value");
    }
}