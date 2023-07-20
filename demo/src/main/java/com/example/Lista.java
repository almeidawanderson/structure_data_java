package com.example;
import java.util.ArrayList;

public class Lista {

  public static void main(String[] args) {
    double[] temperaturas = new double[7];
    temperaturas[0] = 25.3;
    temperaturas[1] = 27.5;
    temperaturas[2] = 24.0;
    temperaturas[3] = 26.7;
    temperaturas[4] = 22.0;
    

    for(double element: temperaturas ) {
        if(element == 27.5) {
            System.out.println("Temperatura 2 encontrada!");
        }

    }
   

    System.out.println("Tamanho do array: " + temperaturas.length);
  }


    
}
