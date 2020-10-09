package fundamentos

fun main(args: Array<String>) {
    val a: Int = 1;
    val b = 2; //Tipo inferido em uma constante.

    //A operação abaixo casionará um erro, porque estamos atribuindo o valor para uma constante.
    //a = a + b;
}