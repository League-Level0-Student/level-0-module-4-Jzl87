package _99_extra;

import java.util.Random;

public class StringMethods2 {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it with
		//    random upper and lower case characters.
		String random = "kaSDBksabjdCMB" ;
		Random ran = new Random();
		int newInt = ran.nextInt(random.length());
		// 2. Print your String to the console in upper case.
		System.out.println(random.toUpperCase());
		System.out.println(random.toLowerCase());
		// 3. Print your String to the console in lower case.

		// 4. Print the first 3 char's of your String
		//    HINT: .substring(start,end)
		System.out.println(random.substring(0,3));
		// 5. Print a single char somewhere in the middle of your String
		System.out.println(random.charAt(newInt));
		//    REMINDER: char's in string start at index 0
		
		// 6. BONUS -- print the LAST 3 char's of your string using
		//        .length() to determine WHERE the last 3 char's are located.
	}
}
