package Funcoes;

import kotlin.collections.CollectionsKt;

import java.util.ArrayList;

public class ChamandoFuncaoKotlin {
    public static void main(String[] args) {
        ArrayList<String> list = CollectionsKt.arrayListOf("Thadeu", "Karina", "Guilherme");
        System.out.println(SegundoElementoListKt.secondOrNull(list));
    }
}
