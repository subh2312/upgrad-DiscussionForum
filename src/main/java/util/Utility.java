package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Utility {
	public static Date getCurrentDate() {
		return Calendar.getInstance(TimeZone.getTimeZone("IST")).getTime();
	}
	
	public static boolean isNotNullAndEmpty(String arg) {
		if (arg != null && !arg.equals("")) {
			return true;
		}
		return false;
	}
	
	public static String inputFromUser() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		return input;
	}
}
