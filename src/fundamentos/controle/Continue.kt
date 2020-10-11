package fundamentos.controle

fun main(args: Array<String>) {
    val initialValue: Int = 1;
    val finalValue: Int = 10;
    for(value in initialValue..finalValue){
        if(value == 5) continue;
        println("Valor $value");
    }
    println("End Of File");
}
