package com.example;

public class Aula07 {
   

    public static void main(String args[]) {
        Vetor vetor = new Vetor(10);
        vetor.add("b");
        vetor.add("c");
        vetor.add("d");
        vetor.add("e");
        vetor.add("f");
        vetor.add("g");
        
        System.out.println( vetor);

        vetor.adiciona(0, "a");

        System.out.println(vetor);

        vetor.adiciona(3, "x");

        System.out.println(vetor);


    }
    
}
