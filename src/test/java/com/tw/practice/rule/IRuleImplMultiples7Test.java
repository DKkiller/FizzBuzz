package com.tw.practice.rule;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class IRuleImplMultiples7Test {

    private IRule rule = new IRuleImplMultiples7();

    @Test
    public void givenPosition14whenMatchThenReturnWhizz() {
        String position = "14";


        String say = rule.say(position);


        assertThat(say).isEqualTo("Whizz");
    }

    @Test
    public void givenPosition21whenMatchThenReturnWhizz() {
        String position = "21";


        String say = rule.say(position);


        assertThat(say).isEqualTo("Whizz");
    }

    @Test
    public void givenPosition10whenMatchThenReturnPosition() {
        String position = "10";


        String say = rule.say(position);


        assertThat(say).isEqualTo(position);
    }

}