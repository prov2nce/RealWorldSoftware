package com.chapter_5.interf;

import com.chapter_5.Facts;

@FunctionalInterface
public interface Condition {
	boolean evaluate(Facts facts);
}
