package chap11;

import java.util.Calendar;
import java.util.Scanner;

//[예제 11-26]
public class ScannerEx3 {
	public static void main(String[] args) {
		String str = "Java and  JSP and Spring and  HTML and JavaScript and   Jquery";
		Scanner scan = new Scanner(str);
		scan.useDelimiter("\\s*and\\s*");
		while(scan.hasNext()) {
			System.out.println(scan.next());
		}
		Calendar c;
	}
}
