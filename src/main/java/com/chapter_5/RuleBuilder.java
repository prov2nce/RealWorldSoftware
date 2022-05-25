package com.chapter_5;

import com.chapter_5.interf.Action;
import com.chapter_5.interf.Condition;
import com.chapter_5.interf.Rule;

public class RuleBuilder {
	private Condition condition;

    private RuleBuilder(Condition condition) {
        this.condition = condition;
    }

    public static RuleBuilder when(Condition condition) {
        return new RuleBuilder(condition);
    }

    public Rule then(Action action) {
        return new Rule(condition, action);
    }
}
