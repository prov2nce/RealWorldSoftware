package com.chapter_3;

import java.time.Month;
import java.util.List;

import com.chapter_2.BankTransaction;

//3-11 BankTransactionProcessor의 핵심 연산
public class BankTransactionProcessor2 {
	
	@FunctionalInterface
	public interface BankTransactionSummarizer {
		double summarize(double accumulator, BankTransaction bankTransaction);
	}
	
	@FunctionalInterface
	public interface BankTransactionFilter {
		boolean test(BankTransaction bankTransaction);
	}
	
	public class BankTransactionProcessor {
		
		private List<BankTransaction> bankTransactions;
		
		public void BankStatementProcessor(final List<BankTransaction> bankTransactions) {
			this.bankTransactions = bankTransactions;
		}
		
		public double summarizeTransactions(final BankTransactionSummarizer bankTransactionSummarizer) {
			double result = 0;
			for(final BankTransaction bankTransaction: bankTransactions) {
				result = bankTransactionSummarizer.summarize(result, bankTransaction);
			}
			return result;
		}
		
		public double calculateTotalInMonth(final Month month) {
			return summarizeTransactions((acc, bankTransaction) ->
					bankTransaction.getDate().getMonth() == month ? acc + bankTransaction.getAmount() : acc);
		}
		
		
	}	
	
	
}
