package fundamentos

fun main(args: Array<String>) {
    var a: Int? = null;
    println(a?.inc());

    print("Momento do erro....");
    //println(a!!.inc()); //Forçando a chamada do método inc, mesmo sabendo que essa variável pode ser nula. Para isso, basta utilizar o !!
}