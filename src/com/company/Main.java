package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Integer[] integers = {54,324,24,87,873,44,56,98,53};
        Arrays.stream(integers).filter(x -> x % 2 ==0).map(x -> x * x).max(Integer::compare).ifPresent(System.out::println);

    }
}
