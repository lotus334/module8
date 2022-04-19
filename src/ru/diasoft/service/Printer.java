package ru.diasoft.service;

import ru.diasoft.domain.Person;

public interface Printer {

    default void printInfo(Person p) {
        System.out.println(p.getFirstName() + " " + p.getSecondName());
    }
}
