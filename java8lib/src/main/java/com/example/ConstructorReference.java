package com.example;

/**
 * Created by AENAYA on 15/11/2016.
 */
public class ConstructorReference {

    interface PersonFactory<P extends Person> {

        P create(String firstName, String lastName);
    }
}

class Person {
    String firstName = "";
    String lastName = "";

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }
}