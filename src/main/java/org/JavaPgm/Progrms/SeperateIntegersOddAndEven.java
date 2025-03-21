package org.JavaPgm.Progrms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeperateIntegersOddAndEven {

    public static void main(String args[]){

        List<Integer> List1 = Arrays.asList(2,3,5,2,4,7);

        Map<Boolean, List<Integer>> List2 =  List1.stream().collect(Collectors.partitioningBy(i->i%2==0));


    }
}
