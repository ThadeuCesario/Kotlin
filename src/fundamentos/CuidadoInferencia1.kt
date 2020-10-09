package fundamentos

fun main(args: Array<String>) {
    /* Como o Kotlin é uma linguagem fortemente tipada. Precisamos definir o tipo da variável ou pelo menos inicializá-la.
     * Para que dessa forma seu tipo seja atribuído por inferência.
     */

    var a:Int;
    var b = 2;

    a = 10;
    print(a + b);
}