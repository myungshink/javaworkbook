package chap14;
//예제[14-3]
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx1 {
	public static void main(String[] args) throws IOException {
		OutputStream out = System.out;
		out.write('a');
		out.write('b');
		out.write('c');
		out.write('1');
		out.write('2');
		out.write('3');
		out.write('가');
		out.write('나');
		out.write('다');
		out.flush();
		out.close();
	}
}
