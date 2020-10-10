package fundamentos

fun main(args: Array<String>) {
    /*
    * Boa prática de programação: Tenha sempre mais constante em seu programa. Portanto sempre parta de constantes.
    * */

    //Tipos numéricos inteiros
    val num1: Byte = 127;
    val num2: Short = 32767;
    val num3: Int = 2_147_483_647; // É possível realizar essas separaçôes no kotlin.
    val num4: Long = 9_223_372_036_854_775_807;
    print(Long.MAX_VALUE);
}