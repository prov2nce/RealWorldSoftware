package com.chapter_5;

import com.chapter_5.interf.Rule;

public class Main {

    public static void main(final String...args) {

        var env = new Facts();
        env.setFact("name", "Bob");
        env.setFact("jobTitle", "CEO");

        final var businessRuleEngine = new BusinessRuleEngine(env);

        final Rule ruleSendEmailToSalesWhenCEO =
                RuleBuilder
                  .when(facts -> "CEO".equals(facts.getFact("jobTitle")))
                  .then(facts -> {
            var name = facts.getFact("name");
            System.out.println("Relevant customer!!!: " + name);
        });

        businessRuleEngine.addRule(ruleSendEmailToSalesWhenCEO);
        businessRuleEngine.run();

    }
}
