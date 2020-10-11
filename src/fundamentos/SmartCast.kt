package fundamentos

fun souEsperto(x: Any){
    if(x is String) {
        println(x.toUpperCase())
    } else if (x is Int) {
        println(x.plus(10));
    }
}

fun souEsperto2(x: Any){
    when(x){
        is String -> println(x.toUpperCase());
        is Int -> println(x.plus(10));
        else -> println("Repense a sua vida");
    }
}

fun main(args: Array<String>) {
    souEsperto("Opa");
    souEsperto(2);
    souEsperto2("hello world");
    souEsperto2(10);
    souEsperto2(true);
}