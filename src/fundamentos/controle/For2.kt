package fundamentos.controle

fun main(args: Array<String>) {
    /*
    * Veja a sintaxe do código abaixo, temos um laço 'for'.
    * Porém estamos aplicando um laço decrescente. Por isso temos o downTo.
    * */
    for(i in 10 downTo 1){
        println("i = $i");
    }
}