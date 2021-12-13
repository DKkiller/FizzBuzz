package com.tw.practice.rule;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IRuleImplContains3Test {

    @Test
    public void givenPosition3whenMatchThenReturnFizz() {
        String position = "3";


        IRule rule = new IRuleImplContains3();
        String say = rule.say(position);


        assertThat(say).isEqualTo("Fizz");
    }

    @Test
    public void givenPosition30whenMatchThenReturnFizz() {
        String position = "30";


        IRule rule = new IRuleImplContains3();
        String say = rule.say(position);


        assertThat(say).isEqualTo("Fizz");
    }

    @Test
    public void givenPosition13whenMatchThenReturnFizz() {
        String position = "13";


        IRule rule = new IRuleImplContains3();
        String say = rule.say(position);


        assertThat(say).isEqualTo("Fizz");
    }

    @Test
    public void givenPosition10whenMatchThenReturnPosition() {
        String position = "10";


        IRule rule = new IRuleImplContains3();
        String say = rule.say(position);


        assertThat(say).isEqualTo("10");
    }

}