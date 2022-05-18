package com.chapter_3;

import java.time.LocalDate;

import com.chapter_2.BankTransaction;

public class Main {
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2022, 2, 18);
		
		BankTransaction bankTransaction = new BankTransaction(date, 999, "test");
		
		BankTransactionIsInFebruaryAndExpensive bankTransactionIsInFebruaryAndExpensive 
			= new BankTransactionIsInFebruaryAndExpensive();	
		
		System.out.println(bankTransactionIsInFebruaryAndExpensive.test(bankTransaction));

	}

}
