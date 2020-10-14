package Funcoes

/*
* Quando utilizamos o vararg, estamos dizendo que passaremos um conjunto de argumentos variáveis.
* Sendo que esse conjunto de inteiros será convertido para um array de inteiros.
*
* Um ponto importante de mencionar é que se quisermos passar um paraâmetro, após
* o varargs, precisamos deixar explícito na passagem do paraâmetro o seu nome.
* veja por exemplo o parâmetro 'a' que está após o vararg.
* */
fun ordenar(vararg numeros: Int, a: Int): IntArray{
    println(a);
    return numeros.sortedArray(); //Retornará o array ordenado.
}

fun main(args: Array<String>) {
    for(n in ordenar(1,5,3,8,0,763,332, a = 12)){
        print("$n ");
    }
}