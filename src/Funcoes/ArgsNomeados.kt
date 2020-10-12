package Funcoes

fun relacaoDeTrabalho(chefe: String, funcionario: String): String = "$funcionario é subordinado(a) à $chefe.";


/*
* Veja que um recurso muito interessante do Kotlin, é que podemos passar os parametros de forma nomeada
* para nossas funções. Isso permite um nível de organizaçaão bem melhor. Além disso, pelo fato de estarmos indicando
* qual parâmetro que estamos referenciando, podemos até mesmo inverter a ordem. =)
* */
fun main(args: Array<String>) {
    println(relacaoDeTrabalho("João", "Maria"));
    println(relacaoDeTrabalho(funcionario = "João", chefe = "Maria"));
}