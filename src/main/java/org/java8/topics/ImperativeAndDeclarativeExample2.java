package org.java8.topics;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImperativeAndDeclarativeExample2 {
    public static void main(String[] args) {


        // EX : Remove duplication from Integer list
        List<Integer> duplicated = Arrays.asList(1,2,3,3,4,4,5,5,5,5,4,4);
        // imperative
        List<Integer> res = new ArrayList<Integer>();
        for (Integer num : duplicated){
            if (!res.contains(num)){
                res.add(num);
            }
        }
        System.out.println(res);

        //  Declarative using java 8 and functions

       List<Integer> res2 = duplicated.stream().distinct().collect(Collectors.toList());
        System.out.println(res2);

        // Data Structure way
        Set<Integer> removed = new HashSet<>(duplicated);
        List<Integer> res3 = new ArrayList<>(removed);
        System.out.println(res3);

    }




}
