package edu.luiz.primeirasemana;

public class NotaMedia {

    public static void main (String[] args){
        int mediaEscola = 1;

        if (mediaEscola < 6)
            System.out.println("REPROVADO");
        else if (mediaEscola == 6)
            System.out.println("PROVA MINERVA");
        else
            System.out.println("APROVADO");
}

}
