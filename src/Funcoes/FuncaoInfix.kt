package Funcoes

class Produto(val nome: String, val preco: Double);

infix fun Produto.maisCaroQue(produto: Produto): Boolean = this.preco > produto.preco;

fun main(args: Array<String>) {
    val produto1 = Produto("Iphone", 6000.0);
    val produto2 = Produto("Galaxy", 2500.0);

    println(produto1.maisCaroQue(produto2));
    println(produto2.maisCaroQue(produto1));

    /*
    * Agora, como criamos uma função infix:
    * Veja que coloque a função no meio dos dois operandos. Por isso temos o nome de função infix.
    * */
    println(produto1 maisCaroQue produto2);
    println(produto2 maisCaroQue produto1);
}