package com.chapter_3.interf;

import com.chapter_3.SummaryStatistics;

//3-13 Exporter 인터페이스의 나쁜 예
//PUBLIC INTERFACE EXPORTER {
//	VOID EXPORT(SUMMARYSTATISTICS SUMMARYSTATISTICS);
//}

//3-14 Exporter 인터페이스의 좋은 예
public interface Exporter {
	String export(SummaryStatistics summaryStatistics);
}
