package com.example.helloworld;

public class HelloWorld {

    public static String fizzBuzz(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Number must be positive");
        }
        if (number % 15 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    public static String[] fizzBuzz(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Input array must not be null");
        }
        String[] results = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            results[i] = fizzBuzz(numbers[i]);
        }
        return results;
    }

    public static void main(String[] args) {
        int[] numbers = new int[30];
        for (int i = 0; i < 30; i++) {
            numbers[i] = i + 1;
        }
        String[] results = fizzBuzz(numbers);
        for (String result : results) {
            System.out.println(result);
        }
    }
}