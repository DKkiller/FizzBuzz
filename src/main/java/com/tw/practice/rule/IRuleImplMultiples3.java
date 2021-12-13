package com.tw.practice.rule;

public class IRuleImplMultiples3 implements IRule {
    @Override
    public boolean match(String position) {
        return Integer.parseInt(position) % 3 == 0;
    }

    @Override
    public String say(String position) {
        if (match(position))
            return "Fizz";
        else
            return position;
    }
}
