package ru.diasoft.service;

import ru.diasoft.domain.Person;

public class PersonPrinter implements Printer {

    @Override
    public void printInfo(Person p) {
        System.out.println(p.toString());
    }
}
