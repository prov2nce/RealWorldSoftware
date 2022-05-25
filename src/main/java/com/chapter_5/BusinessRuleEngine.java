package com.chapter_5;

import java.util.ArrayList;
import java.util.List;

import com.chapter_5.interf.Action;
import com.chapter_5.interf.Rule;

//5-1 비즈니스 규칙 엔진의 기본 API
//5-4 비즈니스 규칙 엔진 기본 구현
//5-12 Facts를 이용한 BusinessRuleEngine
//5-33 리팩터링된 비즈니스 규칙 엔진
public class BusinessRuleEngine {

    private final List<Rule> rules;
    private final Facts facts;

    public BusinessRuleEngine(Facts facts) {
        this.facts = facts;
        this.rules = new ArrayList<>();
    }

    public void addRule(Rule rule) {
        this.rules.add(rule);
    }

    public void run() {
        this.rules.forEach(rule -> rule.perform(facts));
    }
}
