package com.tw.practice.rule;

public class IRuleImplContains3 implements IRule {
    @Override
    public boolean match(String position) {
        return position.contains("3");
    }

    @Override
    public String say(String position) {
        if (match(position)) {
            return "Fizz";
        } else {
            return position;
        }
    }
}
