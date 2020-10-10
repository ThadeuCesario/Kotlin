package fundamentos

/*
* Veja que criei abaixo uma função chamada soma. Veja que atribui um valor padrão para o parâmetro 'b'.
* Além disso, veja que a forma de atribuir um valor padrão é igual como fazemos no Javascript.
* */
fun soma(a: Int, b: Int = 1): Int{
    return a + b;
}

fun main(args: Array<String>) {
    val somandoGrupo = soma(100, 50);
    println(somandoGrupo);
}