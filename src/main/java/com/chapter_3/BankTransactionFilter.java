package com.chapter_3;

import com.chapter_2.BankTransaction;

//3-4 
public interface BankTransactionFilter {
	
	boolean test(BankTransaction bankTransaction);
}
