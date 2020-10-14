package Funcoes

fun imprimeMaior1(a: Int, b: Int){
    println(Math.max(a, b));
}

/*
* Veja que no caso abaixo estamos especificamente apontando que a função possui um retorno do tipo Unit.
* Quando aponto que função possui esse tipo de retorno Unit, não precisamos retornar nenhum tipo de valor.
*
* O unit é um objeto e possui alguma funcionalidades com ele.
* */
fun imprimeMaior2(a: Int, b: Int): Unit{
    println(Math.max(a, b));
}

fun imprimeMaior3(a: Int, b: Int): Unit{
    println(Math.max(a, b));
    return;
}

fun imprimeMaior4(a: Int, b: Int): Unit{
    println(Math.max(a, b));
    return Unit;
}

fun imprimeMaior5(a: Int, b: Int){
    println(Math.max(a, b));
    return Unit;
}

fun main(args: Array<String>) {
    imprimeMaior1(2, 1);
    imprimeMaior2(2, 1);
    imprimeMaior3(2, 1);
    imprimeMaior4(2, 1);
    imprimeMaior5(2, 1).run { 2 > 1 }.run { println("Resultado $this") };
}