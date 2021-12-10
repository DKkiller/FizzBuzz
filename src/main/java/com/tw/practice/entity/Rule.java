package com.tw.practice.entity;

/**
 * 按照学生所排的顺序count，判断是报数字  还是报特殊字符。
 */
public class Rule {

    private String isMultiplesOf3 (Integer count) {
        return count % 3 == 0 ? "Fizz" : count.toString();
    }

    private String isMultiplesOf5 (Integer count) {
        return count % 5 == 0 ? "Buzz" : count.toString();
    }

    private String isMultiplesOf7 (Integer count) {
        return count % 7 == 0 ? "Whizz" : count.toString();
    }

}
