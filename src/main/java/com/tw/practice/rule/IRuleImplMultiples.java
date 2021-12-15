package com.tw.practice.rule;

public class IRuleImplMultiples implements IRule {
    private IRule ruleMultiples3;
    private IRule ruleMultiples5;
    private IRule ruleMultiples7;

    public IRuleImplMultiples() {
        this.ruleMultiples3 = new IRuleImplMultiples3();
        this.ruleMultiples5 = new IRuleImplMultiples5();
        this.ruleMultiples7 = new IRuleImplMultiples7();
    }
    @Override
    public boolean match(String position) {
        return ruleMultiples3.match(position) || ruleMultiples5.match(position) || ruleMultiples7.match(position);
    }

    @Override
    public String say(String position) {
        if (match(position)) {
            StringBuilder record = new StringBuilder();
            if (ruleMultiples3.match(position))
                record.append(ruleMultiples3.say(position));
            if (ruleMultiples5.match(position))
                record.append(ruleMultiples5.say(position));
            if (ruleMultiples7.match(position))
                record.append(ruleMultiples7.say(position));
            return record.toString();
        } else {
            return position;
        }
    }
}
