package fundamentos

fun main(args: Array<String>) {
    val valor: Any = "Opa";

    if(valor is String){
        println("O $valor é do tipo string");
    } else if (valor !is String){
        println("O $valor não é do tipo string");
    } else {
        println("EKNI -> Elemento Kotlin Não Identificado");
    }
}