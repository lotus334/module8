package ru.diasoft;

import ru.diasoft.service.PersonDemo;

public class Main {
    public static void main(String[] args) {
        try {
            PersonDemo personDemo = new PersonDemo();
            personDemo.demo();
        } catch (Exception ex) {
            System.out.println("Something went wrong");
            ex.printStackTrace();
        }
    }
}
