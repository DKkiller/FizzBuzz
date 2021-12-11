package com.tw.practice.rule;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IRuleImplContains7Test {

    @Test
    public void givenPosition7whenMatchThenReturnWhizz() {
        String position = "7";


        IRule rule = new IRuleImplContains7();
        String say = rule.say(position);


        assertThat(say).isEqualTo("Whizz");
    }

    @Test
    public void givenPosition17whenMatchThenReturnWhizz() {
        String position = "17";


        IRule rule = new IRuleImplContains7();
        String say = rule.say(position);


        assertThat(say).isEqualTo("Whizz");
    }

    @Test
    public void givenPosition70whenMatchThenReturnWhizz() {
        String position = "70";


        IRule rule = new IRuleImplContains7();
        String say = rule.say(position);


        assertThat(say).isEqualTo("Whizz");
    }

    @Test
    public void givenPosition10whenMatchThenReturnPosition() {
        String position = "10";


        IRule rule = new IRuleImplContains7();
        String say = rule.say(position);


        assertThat(say).isEqualTo(position);
    }

}