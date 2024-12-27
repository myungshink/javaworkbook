package chap18;
//예제[18-9]
import java.util.stream.IntStream;

public class CharToStreamEx1 {
	public static void main(String[] args) {
		IntStream csr =  "Stream을 배우자".chars(); 
		csr.forEach(s->System.out.print((char)s));
	}
}
