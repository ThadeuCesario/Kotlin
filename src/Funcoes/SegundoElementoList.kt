package Funcoes

fun <E> List<E>.secondOrNull(): E? = if(this.size >= 2) this.get(1) else null;

fun main(args: Array<String>) {
    val list = listOf<String>("João", "Maria", "Pedro", "Karina", "Thadeu");
    println(list.secondOrNull()); // "Maria"
}