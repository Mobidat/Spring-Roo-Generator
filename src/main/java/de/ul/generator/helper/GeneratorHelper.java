package de.ul.generator.helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GeneratorHelper {

	public static String now() {
		return now("yyyy/MM/dd HH:mm:ss");
	}
	
	public static String now(String format) {
		DateFormat dateFormat = new SimpleDateFormat(format);
		Date date = new Date();
		return dateFormat.format(date);
	}
}
