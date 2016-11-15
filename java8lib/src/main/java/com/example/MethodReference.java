package com.example;

/**
 * Created by AENAYA on 15/11/2016.
 */
public class MethodReference {

}

class Something {
    public static Something newSomething() {
        return new Something();
    }

    public String startsWith(String string) {
        return String.valueOf(string.charAt(0));
    }
}
