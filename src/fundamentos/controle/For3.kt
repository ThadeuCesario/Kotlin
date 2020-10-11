package fundamentos.controle

fun main(args: Array<String>) {
    for(i in 0..100 step 5){
        println("Verificando o valor de i => $i");
    }

    for(i in 100 downTo 0 step 5){
        /*
        * Veja que dessa forma, estamos aplicando um contador que inicializará em 100, até chegar em 0.
        * Sendo que o step é de 5 em 5.
        * */
        println("Verificando o valor de i => $i");
    }
}