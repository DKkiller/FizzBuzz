package com.tw.practice.rule;

public class IRuleImplContains7 implements IRule {
    private IRule ruleMultiples3;
    private IRule ruleMultiples7;

    public IRuleImplContains7() {
        this.ruleMultiples3 = new IRuleImplMultiples3();
        this.ruleMultiples7 = new IRuleImplMultiples7();
    }


    @Override
    public boolean match(String position) {
        return position.contains("7");
    }

    @Override
    public String say(String position) {
        if (ruleMultiples3.match(position) && ruleMultiples7.match(position))
            return ruleMultiples3.say(position) + ruleMultiples7.say(position);
        else if (ruleMultiples3.match(position) && ruleMultiples7.match(position))
            return ruleMultiples3.say(position);
        else if (ruleMultiples3.match(position) && ruleMultiples7.match(position))
            return ruleMultiples7.say(position);
        else
            return position;
    }
}
