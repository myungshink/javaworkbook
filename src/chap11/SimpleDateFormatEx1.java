package chap11;

//[예제 11-36]
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx1 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E a");
		System.out.println(sf.format(now));
	}
}