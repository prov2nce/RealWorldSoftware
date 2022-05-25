package com.chapter_5.interf;

import com.chapter_5.Facts;

@FunctionalInterface
public interface Action {
//	void execute(Facts facts);
	void perform(Facts facts);
}
