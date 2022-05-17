package com.chapter_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

//2-1 모든 거래 내역의 합 계산기, 2-2 1월 입출금 내역 합계 계산하기
public class BankTransactionAnalyzerSimple {
	private static final String RESOURCES = "src/main/resources/";
	
	public static void main(final String... args) throws IOException {
		
		final Path path = Paths.get(RESOURCES + "2장.csv");
		final List<String> lines = Files.readAllLines(path);
		double total = 0d;
		
		final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		for(final String line: lines) {
			final String[] columns = line.split(",");
			
			final double amount = Double.parseDouble(columns[1]);
			total += amount;
		}
		
		System.out.println("1. The total for all transactions is " + total);
		
		total = 0d;
		
		for(final String line: lines) {
			final String[] columns = line.split(",");
			final LocalDate date = LocalDate.parse(columns[0], DATE_PATTERN);
			if(date.getMonth() == Month.JANUARY) {
				final double amount = Double.parseDouble(columns[1]);
				total+= amount;
			}
		
		}
		
		System.out.println("2. The total for all transactions in January is " + total);
		
		//2-5 입출금 내역 CSV 파서 사용하기 (리팩토링), 2-6 입출금 내역 목록 처리
		final BankStatementCSVParser bankStatementParser = new BankStatementCSVParser();
		
		final String fileName = "2장.csv";
		final Path path2 = Paths.get(RESOURCES+fileName);
		final List<String> lines2 = Files.readAllLines(path2);
		
		final List<BankTransaction> bankTransactions = bankStatementParser.parseLinesFromCSV(lines2);
		
		System.out.println("3. The total for all transactions is " + calculateTotalAmount(bankTransactions));
		System.out.println("4. Transactions in January " + selectInMonth(bankTransactions, Month.JANUARY));
	}
	
	public static double calculateTotalAmount(final List<BankTransaction> bankTransactions) {
		double total = 0d;
		for(final BankTransaction bankTransaction: bankTransactions) {
			total += bankTransaction.getAmount();
		}
		return total;
	}
	
	public static List<BankTransaction> selectInMonth(final List<BankTransaction> bankTransactions, final Month month) {
		final List<BankTransaction> bankTransactionsInMonth = new ArrayList<>();
		for(final BankTransaction bankTransaction: bankTransactions) {
			if(bankTransaction.getDate().getMonth() == month) {
				bankTransactionsInMonth.add(bankTransaction);
			}
		}
		return bankTransactionsInMonth;
	}
}
