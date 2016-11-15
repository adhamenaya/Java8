package com.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringJoiner;

/**
 * Created by AENAYA on 15/11/2016.
 */
public class Lambda {
    public List<String> oldSort(List<String> strings) {
        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });
        return strings;
    }

    public List<String> shortLambdaSort(List<String> strings) {
        Collections.sort(strings, (String a, String b) -> {
            return a.compareTo(b);
        });

        return strings;
    }

    public List<String> shorterLambdaSort(List<String> strings) {
        Collections.sort(strings, (String a, String b) -> a.compareTo(b));
        return strings;
    }

    public List<String> shortestLambdaSort(List<String> strings) {
        Collections.sort(strings, (a, b) -> a.compareTo(b));
        return strings;
    }
}
