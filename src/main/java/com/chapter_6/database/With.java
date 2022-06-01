package com.chapter_6.database;

import java.sql.SQLException;

public interface With<P> {
	void run(P stmt) throws SQLException;
	
}
