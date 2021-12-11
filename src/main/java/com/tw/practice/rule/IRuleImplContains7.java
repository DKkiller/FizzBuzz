package com.tw.practice.rule;

public class IRuleImplContains7 implements IRule {
    @Override
    public boolean match(String position) {
        return position.contains("7");
    }

    @Override
    public String say(String position) {
        if (match(position))
            return "Whizz";
        else
            return position;

    }
}
