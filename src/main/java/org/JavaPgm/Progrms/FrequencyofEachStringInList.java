package org.JavaPgm.Progrms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyofEachStringInList {

    public static void main(String args[]){

        List<String> input = Arrays.asList("Java","C","Java","Apple");

        Map<String, Long> collect = input.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


    }

}
