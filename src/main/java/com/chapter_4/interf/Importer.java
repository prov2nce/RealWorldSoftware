package com.chapter_4.interf;

import java.io.File;
import java.io.IOException;

import com.chapter_4.Document;

public interface Importer {
	Document importFile(File file) throws IOException;
}
