package com.tw.practice;


import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    @Test
    public void givenStudentCountWhenMainThenPrintInOrder() {
        int studentCount = 100;
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
    public void givenStudentPositionWhenMultiplesOf7ThenWhizz() {
        Assert.assertEquals("Whizz", Main.isMultiplesOf3Or5Or7(7));
    }

    @Test
    public void givenStudentPositionWhenMultiplesOf3and5ThenFizzBuzz() {
        Assert.assertEquals("FizzBuzz", Main.isMultiplesOf3Or5Or7(15));
    }

    @Test
    public void givenStudentPositionWhenMultiplesOf3and7ThenFizzWhizz() {
        Assert.assertEquals("FizzWhizz", Main.isMultiplesOf3Or5Or7(21));
    }

    @Test
    public void givenStudentPositionWhenMultiplesOf5and7ThenFizzBuzzWhizz() {
        Assert.assertEquals("FizzBuzzWhizz", Main.isMultiplesOf3Or5Or7(105));
    }

    @Test
    public void givenStudentPositionWhenMultiplesOf3and5and7ThenFizzWhizz() {
        Assert.assertEquals("BuzzWhizz", Main.isMultiplesOf3Or5Or7(35));
    }

    @Test
    public void givenStudentPositionWhenNotMultiplesOf7ThenPosition() {
        Assert.assertEquals("4", Main.isMultiplesOf3Or5Or7(4));
    }

    @Test
    public void givenStudentPositionWhenContains3ThenFizz() {
        Assert.assertEquals("Fizz", Main.isContains3Or5Or7(35));
    }
}
