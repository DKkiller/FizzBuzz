package com.tw.practice.rule;

public class IRuleImplContains5 implements IRule {
    private IRule ruleMultiples5;
    private IRule ruleMultiples7;

    public IRuleImplContains5() {
        this.ruleMultiples5 = new IRuleImplMultiples5();
        this.ruleMultiples7 = new IRuleImplMultiples7();
    }

    @Override
    public boolean match(String position) {
        return position.contains("5");
    }

    @Override
    public String say(String position) {
        if (ruleMultiples5.match(position) && ruleMultiples7.match(position))
            return ruleMultiples5.say(position) + ruleMultiples7.say(position);
        else if (ruleMultiples5.match(position) && !ruleMultiples7.match(position))
            return ruleMultiples5.say(position);
        else if (!ruleMultiples5.match(position) && ruleMultiples7.match(position))
            return ruleMultiples7.say(position);
        else
            return position;

    }
}
