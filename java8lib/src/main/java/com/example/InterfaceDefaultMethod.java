package com.example;

/**
 * Created by AENAYA on 15/11/2016.
 */
public class InterfaceDefaultMethod {

    public interface Formula {
        public int calculate(int x);

        // Extesion method
        default int sqrt(int x) {
            return x * x;
        }
    }
}
