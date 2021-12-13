package com.tw.practice.rule;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IRuleImplMultiples3Test {

    private IRule rule = new IRuleImplMultiples3();

    @Test
    public void givenPosition6whenMatchThenReturnFizz() {
        String position = "6";


        String say = rule.say(position);


        assertThat(say).isEqualTo("Fizz");
    }

    @Test
    public void givenPosition15whenMatchThenReturnFizz() {
        String position = "15";


        String say = rule.say(position);


        assertThat(say).isEqualTo("Fizz");
    }

    @Test
    public void givenPosition7whenMatchThenReturnPosition() {
        String position = "7";


        String say = rule.say(position);


        assertThat(say).isEqualTo(position);
    }

}