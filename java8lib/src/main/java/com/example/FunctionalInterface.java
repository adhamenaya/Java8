package com.example;

/**
 * Created by AENAYA on 15/11/2016.
 */
public class FunctionalInterface {


    @java.lang.FunctionalInterface
    interface Converter<F, T> {

        // Functional interface accepts only one abstract method
        public T convert(F from);
    }
}
