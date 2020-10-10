package fundamentos

fun main(args: Array<String>) {
    val opcional: String? = null;
    val obrigatorio: String = opcional ?: "Valor Default";
    println(obrigatorio);
}