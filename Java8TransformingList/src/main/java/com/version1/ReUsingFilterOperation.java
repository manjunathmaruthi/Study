package com.version1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReUsingFilterOperation {

    public static void main(String args[]){
        List<String> names1 = Arrays.asList("Giri","James", "Rana","Anup","Suresh");

        List<String> names2 = Arrays.asList("Bintu","Jhon", "Alen","Vinay","Manju");

        Predicate<String> nameIsFiveLettersLong = (name)->name.length() == 5;

        final List<String> fiveLetteredNames1 = names1.stream()
                .filter(nameIsFiveLettersLong)
                .collect(Collectors.toList());
        System.out.println(fiveLetteredNames1);
        final  List<String> fiveLetteredNames2 = names2.stream()
                .filter(nameIsFiveLettersLong)
                .collect(Collectors.toList());
        System.out.println(fiveLetteredNames2);
    }
}
