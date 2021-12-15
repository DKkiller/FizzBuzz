package com.tw.practice.entity;

import com.tw.practice.rule.*;

public class Student {
    private Integer position;
    private String name;


    public Student(Integer position) {
        this.position = position;
    }

    public Student(Integer position, String name) {
        this.position = position;
        this.name = name;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String say() {
        String positionStr = this.position.toString();
        IRule ruleContains3 = new IRuleImplContains3();
        IRule ruleContains5 = new IRuleImplContains5();
        IRule ruleContains7 = new IRuleImplContains7();
        IRule ruleMultiples = new IRuleImplMultiples();
        if (ruleContains3.match(positionStr))
            return ruleContains3.say(positionStr);
        else if (ruleContains5.match(positionStr))
            return ruleContains5.say(positionStr);
        else if (ruleContains7.match(positionStr))
            return ruleContains7.say(positionStr);
        else
            return ruleMultiples.say(positionStr);
    }
}
