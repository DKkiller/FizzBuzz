package com.tw.practice.rule;

public interface IRule {
    boolean match(String position);
    String say(String position);
}
