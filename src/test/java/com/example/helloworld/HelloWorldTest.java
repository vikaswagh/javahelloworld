package com.example.helloworld;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    @Test
    public void testFizzBuzzReturnsFizzForMultipleOf3() {
        assertEquals("Fizz", HelloWorld.fizzBuzz(3));
        assertEquals("Fizz", HelloWorld.fizzBuzz(6));
        assertEquals("Fizz", HelloWorld.fizzBuzz(9));
    }

    @Test
    public void testFizzBuzzReturnsBuzzForMultipleOf5() {
        assertEquals("Buzz", HelloWorld.fizzBuzz(5));
        assertEquals("Buzz", HelloWorld.fizzBuzz(10));
        assertEquals("Buzz", HelloWorld.fizzBuzz(20));
    }

    @Test
    public void testFizzBuzzReturnsFizzBuzzForMultipleOf15() {
        assertEquals("FizzBuzz", HelloWorld.fizzBuzz(15));
        assertEquals("FizzBuzz", HelloWorld.fizzBuzz(30));
    }

    @Test
    public void testFizzBuzzReturnsNumberForNonMultiple() {
        assertEquals("1", HelloWorld.fizzBuzz(1));
        assertEquals("2", HelloWorld.fizzBuzz(2));
        assertEquals("7", HelloWorld.fizzBuzz(7));
        assertEquals("11", HelloWorld.fizzBuzz(11));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFizzBuzzThrowsForZero() {
        HelloWorld.fizzBuzz(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFizzBuzzThrowsForNegative() {
        HelloWorld.fizzBuzz(-1);
    }

    @Test
    public void testFizzBuzzArray() {
        int[] input = {1, 2, 3, 5, 15};
        String[] expected = {"1", "2", "Fizz", "Buzz", "FizzBuzz"};
        assertArrayEquals(expected, HelloWorld.fizzBuzz(input));
    }

    @Test
    public void testFizzBuzzArrayEmpty() {
        assertArrayEquals(new String[]{}, HelloWorld.fizzBuzz(new int[]{}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFizzBuzzArrayNullThrows() {
        HelloWorld.fizzBuzz((int[]) null);
    }

    @Test
    public void testFizzBuzzFullRange1To30() {
        int[] numbers = new int[30];
        for (int i = 0; i < 30; i++) {
            numbers[i] = i + 1;
        }
        String[] results = HelloWorld.fizzBuzz(numbers);

        assertEquals(30, results.length);
        assertEquals("1", results[0]);
        assertEquals("Fizz", results[2]);    // 3
        assertEquals("Buzz", results[4]);    // 5
        assertEquals("FizzBuzz", results[14]); // 15
        assertEquals("FizzBuzz", results[29]); // 30
    }
}