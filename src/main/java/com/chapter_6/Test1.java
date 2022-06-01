package com.chapter_6;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

public class Test1 {
	
	
	public static void main(String[] args) {
		Optional<String> a = Optional.of("a");
		
		System.out.println(a);
		
		assertEquals("a", a.get());
		
	}
}
