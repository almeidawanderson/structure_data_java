package com.example;
public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public int tamanho() {
        return this.tamanho;
    }

    /*public String search(int position) {
        if(!(position >= 0 && position < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        return this.elementos[position];
    }*/

    public boolean search(String elemento) {
        for(int i = 0; i < this.tamanho; i++) {
            if(this.elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    } 

    


   /*/  public String toString() {
        return Arrays.toString(elementos);
    }*/

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");
        for(int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if(this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append("]");
        return s.toString();

    }
    

    /*public void add(String elemento) throws Exception {

        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }  else {
            throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos");  
        }
      
    }*/

    public boolean add(String elemento){
        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;    
    }
}

