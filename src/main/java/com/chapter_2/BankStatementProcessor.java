package com.chapter_2;

import java.time.Month;
import java.util.List;

//2-7 BankStatementProcessor 클래스의 계산 연산 그룹화
public class BankStatementProcessor {
	
	private final List<BankTransaction> bankTransactions;
	
	public BankStatementProcessor(final List<BankTransaction> bankTransactions) {
		this.bankTransactions = bankTransactions;
	}
	
	public double calculateTotalAmount() {
		double total = 0;
		
		for(final BankTransaction bankTransaction: bankTransactions) {
			
			total += bankTransaction.getAmount();
		}
		return total;
	}
	
	public double calculateTotalInMonth(final Month month) {
		double total = 0;
		
		for(final BankTransaction bankTransaction: bankTransactions) {
			if(bankTransaction.getDate().getMonth() == month) {
					total += bankTransaction.getAmount();
			}
		}
		return total;
	}
	
	public double calcultateTotalForCategory(final String category) {
		double total = 0;
		for(final BankTransaction bankTransaction: bankTransactions) {
			if(bankTransaction.getDescription().equals(category)) {
				total += bankTransaction.getAmount();
			}
		}
		return total;
	}
}
