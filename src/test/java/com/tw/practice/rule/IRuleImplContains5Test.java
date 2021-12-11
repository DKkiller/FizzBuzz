package com.tw.practice.rule;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IRuleImplContains5Test {

    @Test
    public void givenPosition5whenMatchThenReturnBuzz() {
        String position = "5";


        IRule rule = new IRuleImplContains5();
        String say = rule.say(position);


        assertThat(say).isEqualTo("Buzz");
    }

    @Test
    public void givenPosition15whenMatchThenReturnBuzz() {
        String position = "15";


        IRule rule = new IRuleImplContains5();
        String say = rule.say(position);


        assertThat(say).isEqualTo("Buzz");
    }

    @Test
    public void givenPosition50whenMatchThenReturnBuzz() {
        String position = "50";


        IRule rule = new IRuleImplContains5();
        String say = rule.say(position);


        assertThat(say).isEqualTo("Buzz");
    }

    @Test
    public void givenPosition10whenMatchThenReturnBuzz() {
        String position = "10";


        IRule rule = new IRuleImplContains5();
        String say = rule.say(position);


        assertThat(say).isEqualTo(position);
    }
}