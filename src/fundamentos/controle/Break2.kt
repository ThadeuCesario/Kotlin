package fundamentos.controle

fun main(args: Array<String>) {
    externo@for(i in 1..15){
        for(j in 1..15){
            if(i == 2 && j == 9) break@externo; //Nunca usar isso haha.
            println("Valor de i = $i, valor de j = $j");
        }
    }
}