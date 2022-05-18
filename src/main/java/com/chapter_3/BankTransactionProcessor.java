package com.chapter_3;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import com.chapter_2.BankTransaction;

public class BankTransactionProcessor {
	private final List<BankTransaction> bankTransactions;
	
	public BankTransactionProcessor(final List<BankTransaction> bankTransactions) {
		this.bankTransactions = bankTransactions;
	}
	
	//3-1 특정금액 이상의 거래내역 찾기
		public List<BankTransaction> findTransactionsGreaterThanEqual(final int amount) {
			final List<BankTransaction> result = new ArrayList<>();
			for(final BankTransaction bankTransaction: bankTransactions) {
				if(bankTransaction.getAmount() >= amount) {
					result.add(bankTransaction);
				}
			}
			return result;
		}
		
		//3-2 특정 월의 입출금 내역 찾기
		public List<BankTransaction> findTransactionsInMonth(final Month month) {
			final List<BankTransaction> result = new ArrayList<>();
			
			for(final BankTransaction bankTransaction: bankTransactions) {
				if(bankTransaction.getDate().getMonth() == month) {
					result.add(bankTransaction);
				}
			}
			
			return result;
		}
		
		//3-3 특정 월이나 금액으로 입출금 내역 검색하기
		public List<BankTransaction> findTransactionsInMonthAndGreater(final Month month, final int amount) {
			final List<BankTransaction> result = new ArrayList<>();
			
			for(final BankTransaction bankTransaction: bankTransactions) {
				if(bankTransaction.getDate().getMonth() == month && bankTransaction.getAmount() >= amount) {
					result.add(bankTransaction);
				}
			}
			
			return result;
		}
		
		//3-5 개방/폐쇄 원칙을 적용한 후 유연해진 findTransactions() 메서드
		public List<BankTransaction> findTransactions(final BankTransactionFilter bankTransactionFilter) {
			final List<BankTransaction> result = new ArrayList<>();
			
			for(final BankTransaction bankTransaction: bankTransactions) {
				if(bankTransactionFilter.test(bankTransaction)) {
					result.add(bankTransaction);
				}
			}
			
			return result;
		}
}
