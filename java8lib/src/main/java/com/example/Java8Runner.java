package com.example;

import java.util.Arrays;
import java.util.List;

public class Java8Runner {

    public static void main(String args[]) {


        System.out.println("1) Interface default method:");
        InterfaceDefaultMethod.Formula formula = new InterfaceDefaultMethod.Formula() {
            @Override
            public int calculate(int x) {
                return x + 3;
            }
        };
        System.out.println(formula.calculate(6));
        System.out.println(formula.sqrt(6));
        System.out.println("----------------------------------------");

        System.out.println("2) Lambda:");
        List<String> strings = Arrays.asList("C", "A", "Z", "F", "D");
        System.out.println("Old sort: " + new Lambda().oldSort(strings).toString());
        System.out.println("Short lambda sort: " + new Lambda().shortLambdaSort(strings).toString());
        System.out.println("Shorter lambda sort: " + new Lambda().shorterLambdaSort(strings).toString());
        System.out.println("Shortest lambda sort: " + new Lambda().shortestLambdaSort(strings).toString());
        System.out.println("----------------------------------------");
        System.out.println("3) Functional interface :");
        FunctionalInterface.Converter<String, Integer> converter = new FunctionalInterface.Converter<String, Integer>() {
            @Override
            public Integer convert(String from) {
                return Integer.valueOf(from);
            }
        };
        System.out.println("No lambda: " + converter.convert("44"));

        // Put the implementation of the abstract method here as lambda
        FunctionalInterface.Converter<String, Integer> converter1 = (from) -> Integer.valueOf(from);

        System.out.println("With lambda: " + converter1.convert("66"));
        System.out.println("----------------------------------------");
        System.out.println("4) Method Reference :");
        Something something = Something.newSomething();
        FunctionalInterface.Converter<String, String> converter2 = (from) -> something.startsWith(from);
        // Another implementation of the method using method reference
        converter2 = something::startsWith;
        System.out.println(converter2.convert("Adham"));
        System.out.println("----------------------------------------");
        System.out.println("5) Constructor Reference :");
        ConstructorReference.PersonFactory<Person> personFactory = new ConstructorReference.PersonFactory<Person>() {
            @Override
            public Person create(String firstName, String lastName) {
                return new Person("Adham", "Enaya");
            }
        };
        personFactory = Person::new;
        System.out.println(personFactory.create("Adham", "Enaya").getName());
        System.out.println("----------------------------------------");


    }
}
