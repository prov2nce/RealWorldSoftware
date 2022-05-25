package com.chapter_5.interf;

import com.chapter_5.Facts;

public class Rule {

    private Condition condition;
    private Action action;

    public Rule(Condition condition, Action action) {
        this.condition = condition;
        this.action = action;
    }

    public void perform(Facts facts) {
        if(condition.evaluate(facts)){
            action.perform(facts);
        }
    }
}
