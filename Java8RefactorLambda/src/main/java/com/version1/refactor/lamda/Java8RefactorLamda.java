package com.version1.refactor.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class Java8RefactorLamda {

    public static void main(String args[]){

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        /*for(int i=0;i<list.size();i++){
            System.out.println(i);
        }*/

       /* for(int num:list){
            System.out.println(num);
        }*/


      /* list.forEach(new Consumer<Integer>() {
           public void accept(Integer integer) {
               System.out.println(integer);
           }
       });*/

      //list.forEach((Integer value) -> System.out.println(value));

        //list.forEach((value) -> System.out.println(value));

        list.forEach(System.out::println);


    }
}
