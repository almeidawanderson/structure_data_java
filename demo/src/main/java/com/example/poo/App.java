package com.example.poo;

public class App {

    public static void main (String[] args) {
        Person person = new Person();
        person.name = "John";
        person.age = 20;
        person.height = 1.80f;
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.height);
    }
    
}
