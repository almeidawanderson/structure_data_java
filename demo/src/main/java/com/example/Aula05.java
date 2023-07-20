package com.example;

public class Aula05 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.add("Aula 05");
        vetor.add("Estrutura de Dados");
        vetor.add("em Java");

        System.out.println(vetor.search(1));
    }
    
}
