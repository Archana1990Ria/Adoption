package org.JavaPgm.Progrms;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyofEachChar {

    public static void main(String args[]){

        String input = "Java concept of the Day";

        Map<Character, Long> collect = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);


    }
}
