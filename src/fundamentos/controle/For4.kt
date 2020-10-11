package fundamentos.controle

fun main(args: Array<String>) {
    val alunos = arrayListOf<String>("Thadeu",  "Guilherme", "Clayton", "Fernando", "Philipe");
    for ((indice, aluno) in alunos.withIndex()){
        println("Indice $indice - Aluno $aluno");
    }
}