package edu.gustavo.primeirasemana;


public class BoletimEstudante {
    public static void main(String [] args){

        int mediaFinal = 6;
        if(mediaFinal<6)
        System.out.print("Reprovado.");
        else if(mediaFinal==6)
        System.out.println("Recuperação.");
        else
        System.err.println("Aprovado.");
    }
}
