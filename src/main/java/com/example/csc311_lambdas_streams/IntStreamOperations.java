package com.example.csc311_lambdas_streams;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamOperations {
   public static void main(String[] args) {
      int[] values = {3, 1, 4, 8, 2, 5, 8, 7};

      // display original values
      System.out.print("Original values: ");
      int x = Integer.parseInt(
         IntStream.of(values)
                  .mapToObj(String::valueOf)
                  .collect(Collectors.joining("")))%3;
        System.out.println(x);

   }
}
