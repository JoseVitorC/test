package com.blue.test.service;

import java.util.HashMap;
import java.util.Objects;

public class FirstUniqueSum {

        public static void main(String[] args) {
            int[] case1 = new int[]{1, 31, 5, 5, 5, 27, 12, 26, 31, 12, 26, 3};
            // Given an array of numbers, return the sum of the numbers that are not repeated.
            assertEquals(getSum(case1), 31);

            int[] case2= new int[]{2,5,5,25,25,1,2,8,31,8};
            assertEquals(getSum(case2), 32);
            System.out.println("SUCCESS!!");

        }
        private static <T> void assertEquals(T actual, T expected) {
            if (!Objects.equals(actual, expected))
                throw new IllegalStateException(String.format("Expected value: <%s> but was: <%s>", expected, actual));
        }

        public static Integer getSum(int[] array) {
            HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
            for (int i=0; i<array.length; i++) {
                hs.put(array[i], hs.getOrDefault(array[i], 0) + 1);
            }
            Integer sum = 0;
            for(Integer i : hs.keySet()) {
                if(hs.get(i) == 1) {
                    sum+=i;
                }
            }
            return sum;
        }
}
