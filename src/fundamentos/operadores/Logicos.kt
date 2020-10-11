package fundamentos.operadores

import javax.swing.text.StyledEditorKit

fun main(args: Array<String>) {
    val executouTrabalho1: Boolean = false;
    val executouTrabalho2: Boolean = false;

    val comprouSorvete: Boolean = executouTrabalho1 || executouTrabalho2;
    val comprouTv50: Boolean = executouTrabalho1 && executouTrabalho2;
    val comprouTv32: Boolean = executouTrabalho1 xor executouTrabalho2;

    println("Comprou sorvete: $comprouSorvete");
    println("Comprou Televisão de 50: $comprouTv50");
    println("Comrou Televisão de 32: $comprouTv32");

    //Operador Unário
    if(!comprouSorvete) println("Bem pelo menos não vai engordar haha.");
}