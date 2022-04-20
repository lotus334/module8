package ru.diasoft.service;

import ru.diasoft.domain.Person;

public interface Printer<T extends Person> {

    default void printInfo(T p) {
        System.out.println(p.getFirstName() + " " + p.getSecondName());
    }
}
