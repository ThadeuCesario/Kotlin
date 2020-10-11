package fundamentos.controle

fun main(args: Array<String>) {
    loop@for(i in 1..15){
        for(j in 1..15){
            if(i == 2 && j == 9) break@loop; //Nunca usar isso haha.
        }
    }
}