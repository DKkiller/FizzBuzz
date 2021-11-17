package com.tw.practice;


import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    @Test
    public void givenStudentCountWhenMainThenPrintInOrder() {
        int studentCount = 4;
        Main.print(studentCount);
    }

    @Test
    public void givenStudentPositionWhenMultiplesOf3ThenFizz() {
        Assert.assertEquals("Fizz", Main.isMultiplesOf3Or5Or7(3));
    }

    @Test
    public void givenStudentPositionWhenMultiplesOf5ThenBuzz() {
        Assert.assertEquals("Buzz", Main.isMultiplesOf3Or5Or7(5));
    }

    @Test
    public void givenStudentPositionWhenMultiplesOf7ThenBuzz() {
        Assert.assertEquals("Whizz", Main.isMultiplesOf3Or5Or7(7));
    }

    @Test
    public void givenStudentPositionWhenMultiplesOf3and5ThenFizzBuzz() {
        Assert.assertEquals("FizzBuzz", Main.isMultiplesOf3Or5Or7(15));
    }

    @Test
    public void givenStudentPositionWhenNotMultiplesOf7ThenPosition() {
        Assert.assertEquals("4", Main.isMultiplesOf3Or5Or7(4));
    }
}
