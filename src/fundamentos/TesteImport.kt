package fundamentos

import fundamentos.pacoteA.simplesFuncao as funcaoSimples;
import fundamentos.pacoteA.Coisa;
import fundamentos.pacoteA.FaceMoeda.CARA;
import fundamentos.pacoteB.*;

fun main(args: Array<String>) {
    // UTILIZANDO PACOTE A
    /*
    * Por padrão, tudo que está dentro de Kotlin.io, é importado e portanto disponível para serem utilizados.
    * */
    kotlin.io.println(funcaoSimples("Hello Kotlin!"));

    /*
    * Veja abaixo que estou instanciando um objeto. Lembrando que no Kotlin não temos a palavra reservada 'new'
    * */
    val coisa = Coisa("Bola");
    println(coisa.nome);

    println(CARA);

    // UTILIZANDO PACOTE B
    println("${soma(2,3)}, ${subtracao(3, 2)}");
}