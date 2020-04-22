package com.version1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringList {

    public static void main(String args[]){
        List<String> names = Arrays.asList("Tina","Sharma", "Rajieev","Anup","Suresh");

        //Get me the names of having 5 letters
        final List<String> sixLetteredName ;
        /*for(String name : names){
            if(name.length() == 6){
                sixLetteredName.add(name);
            }
        }*/

        //Declarative style
       /* names.forEach(name->{
            if(name.length() == 6){
                sixLetteredName.add(name);
            }
        });*/

        sixLetteredName = names.stream()
                .filter(name->name.length()==6)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(sixLetteredName);
    }
}
