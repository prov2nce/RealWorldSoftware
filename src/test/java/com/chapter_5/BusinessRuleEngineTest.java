package com.chapter_5;


import static org.mockito.Mockito.*;

import org.junit.Test;

import com.chapter_5.interf.Action;

class BusinessRuleEngineTest {
	
	@Test
	void shouldHaveNoRulesInitially() {
//		final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine();
		
//		assertEquals(0,  businessRuleEngine.count());
	}
	
//	@Test
//	void shouldAddTwoActions() {
//		final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine();
//		
//		businessRuleEngine.addAction(() -> {});
//		businessRuleEngine.addAction(() -> {});
//		
//		assertEquals(2, businessRuleEngine.count());
//	}
	
	@Test
	void shouldExecuteOneAction() {
//		final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine();
//		final Action mockAction = mock(Action.class);
//		
//		businessRuleEngine.addAction(mockAction);
//		businessRuleEngine.run();
//		
//		verify(mockAction).perform();
	}
	
	public void shouldPerformAnActionWithFacts() {
		final Action mockAction = mock(Action.class);
		final Facts mockFacts = mock(Facts.class);
		final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine(mockFacts);
	}
}
