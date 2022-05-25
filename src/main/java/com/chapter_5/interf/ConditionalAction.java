package com.chapter_5.interf;

import com.chapter_5.Facts;

public interface ConditionalAction {
    void perform(Facts facts);
    boolean evaluate(Facts facts);

}