package com.chapter_3;

public class Html {

	public static void main(String[] args) {
		HtmlExporter htmlExporter = new HtmlExporter();
		
		SummaryStatistics summaryStatistics = new SummaryStatistics(10, 7, 3, 5);
		
		System.out.println(htmlExporter.export(summaryStatistics));
	}

}
