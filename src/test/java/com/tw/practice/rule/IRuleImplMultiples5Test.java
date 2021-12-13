package com.tw.practice.rule;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class IRuleImplMultiples5Test {

    private IRule rule = new IRuleImplMultiples5();

    @Test
    public void givenPosition5whenMatchThenReturnBuzz() {
        String position = "5";


        String say = rule.say(position);


        assertThat(say).isEqualTo("Buzz");
    }

    @Test
    public void givenPosition15whenMatchThenReturnBuzz() {
        String position = "15";


        String say = rule.say(position);


        assertThat(say).isEqualTo("Buzz");
    }

    @Test
    public void givenPosition7whenMatchThenReturnPosition() {
        String position = "7";


        String say = rule.say(position);


        assertThat(say).isEqualTo(position);
    }

}