package ru.diasoft.domain;

import lombok.*;

@ToString
@EqualsAndHashCode(exclude={"phone"})
@RequiredArgsConstructor
public class Person {

    @Getter
    @NonNull
    private String firstName;

    @Getter
    @NonNull
    private String secondName;

    @Getter
    @Setter
    @NonNull
    private int age;

    @Getter
    @Setter
    private long phone;

    public Person(String firstName, String secondName, int age, long phone) {
        this(firstName, secondName, age);
        this.phone = phone;
    }
}
