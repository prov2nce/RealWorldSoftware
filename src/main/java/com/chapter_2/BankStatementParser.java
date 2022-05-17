package com.chapter_2;

import java.util.List;

//2-11 입출금 내역을 파싱하는 인터페이스 정의
public interface BankStatementParser {
	
	BankTransaction parseFromCSV(String line);
	
	List<BankTransaction> parseLinesFromCSV(List<String> lines);
	
}
