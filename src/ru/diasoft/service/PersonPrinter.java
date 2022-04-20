package ru.diasoft.service;

import ru.diasoft.domain.Person;

public class PersonPrinter implements Printer<Person> {

    @Override
    public void printInfo(Person p) {
        System.out.println(p);
    }
}
