package com.example;


public class Aula04 {

    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.add("Curso");
        vetor.add("Estrutura de Dados");
        vetor.add("em Java");

        System.out.println(vetor);

        System.out.println(vetor.tamanho());
    }

    
}
