package com.tw.practice.rule;

public class IRuleImplContains5 implements IRule {
    @Override
    public boolean match(String position) {
        return position.contains("5");
    }

    @Override
    public String say(String position) {
        if (match(position))
            return "Buzz";
        else
            return position;

    }
}
