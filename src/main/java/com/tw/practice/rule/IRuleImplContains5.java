package com.tw.practice.rule;

public class IRuleImplContains5 implements IRule {
    private IRule ruleMultiples7;

    public IRuleImplContains5() {
        this.ruleMultiples7 = new IRuleImplMultiples7();
    }

    @Override
    public boolean match(String position) {
        return position.contains("5");
    }

    @Override
    public String say(String position) {
        if (match(position) && ruleMultiples7.match(position))
            return "BuzzWhizz";
        else if (match(position) && !ruleMultiples7.match(position))
            return "BuzzWhizz";
        else
            return position;

    }
}
