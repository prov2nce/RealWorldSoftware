package com.chapter_3;

import java.time.Month;

import com.chapter_2.BankTransaction;
import com.chapter_3.interf.BankTransactionFilter;

//3-6 BankTransactionFilter를 구현하는 클래스 선언
public class BankTransactionIsInFebruaryAndExpensive implements BankTransactionFilter {
	
	@Override
	public boolean test(final BankTransaction bankTransaction) {
		return bankTransaction.getDate().getMonth() == Month.FEBRUARY && bankTransaction.getAmount() >= 1_000;
	}
}

