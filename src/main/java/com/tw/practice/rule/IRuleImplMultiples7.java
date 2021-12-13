package com.tw.practice.rule;

public class IRuleImplMultiples7 implements IRule {
    @Override
    public boolean match(String position) {
        return Integer.parseInt(position) % 7 == 0;
    }

    @Override
    public String say(String position) {
        if (match(position))
            return "Whizz";
        else
            return position;
    }
}
