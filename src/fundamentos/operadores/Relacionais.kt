package fundamentos.operadores

import java.util.*

fun main(args: Array<String>) {
    println("Banana" === "Banana");
    println(3 !== 2);
    println(3 < 2);
    println(3 > 2);
    println(3 >= 2);
    println(3 <= 2);

    /*
    * Passando a data de inicío como zero, será considerado o ponto de início da data do Java que é 01/01/1970.
    * */
    val d1 = Date(0);
    val d2 = Date(0);

    //Igualdade referencial
    /*
    * Veja que no caso abaixo a comparação abaixo retornou false, porém isso está acontecendo pelo fato
    * das instâncias das data apontarem para endereços diferentes.
    * */
    println("Resultado com '=== ${d1 === d2}");

    //Igualdada estrutural
    /*
    * Essa igualdade verificará se os conteúdos dos objetos são iguais.
    * Portanto o resultado é true, sendo que o conteúdo das duas datas são iguais. Isso porque começaram na mesma data.
    * */
    println("Resultado com '==' ${d1 == d2}")
}