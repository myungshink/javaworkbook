package chap14;
//예제[14-2]
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamEx2 {
	public static void main(String[] args) throws IOException {
		Reader in = new InputStreamReader(System.in);
		int data = 0;
		while ((data = in.read()) != -1) {
			System.out.print((char) data);
		}
	}
}
