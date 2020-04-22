package com.version1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8TransformingList {

    public static void main(String args[]){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

        List<Integer> numbers = new ArrayList<Integer>();

        /*for(int n : list){
            numbers.add(n*2);
        }*/

        /*list.forEach((number)-> numbers.add(number*2));*/

        list.parallelStream().map(number->doubleNumber(number)).collect(Collectors.toList());

    }

    private static Integer doubleNumber(int number){
        System.out.println(number);
        return number *2;
    }
}
