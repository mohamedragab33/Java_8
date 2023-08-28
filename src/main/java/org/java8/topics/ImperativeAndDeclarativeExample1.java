package org.java8.topics;

import java.util.stream.IntStream;

public class ImperativeAndDeclarativeExample1 {
    public static void main(String[] args) {


        // EX : Sum 1 to 100

        // imperative
        int sum = 0;
          for (int i =0 ; i <=100 ; i++){
              sum += i;
          }
        System.out.println("Sum :" + sum);


        //  Declarative using java 8 and functions

        int sum1 = IntStream.rangeClosed(0,100).sum();
        System.out.println("Sum :" + sum1);

    }




}
