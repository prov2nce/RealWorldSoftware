package com.chapter_2;

import java.io.IOException;

//2-13 메인 응용프로그램
public class MainApplication {
	
	public static void main(final String... args) throws IOException {
		
		final BankStatementAnalyzer bankStatementAnalyzer = new BankStatementAnalyzer();
		
		final BankStatementParser bankStatementParser = new BankStatementCSVParser();
		
		bankStatementAnalyzer.analyze("2장.csv", bankStatementParser);
	}
}
