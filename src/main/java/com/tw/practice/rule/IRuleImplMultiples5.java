package com.tw.practice.rule;

public class IRuleImplMultiples5 implements IRule {
    @Override
    public boolean match(String position) {
        return Integer.parseInt(position) % 5 == 0;
    }

    @Override
    public String say(String position) {
        if (match(position))
            return "Buzz";
        else
            return position;
    }
}
