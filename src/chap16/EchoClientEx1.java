package chap16;
//예제[16-5]
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClientEx1 {
	public static void main(String[] args) {
		int port = 5000;
		String ip = "localhost"; // 서버IP주소
		Socket client = null;
		PrintWriter out = null;
		BufferedReader in = null;
		try {
			String input;
			BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
			client = new Socket(ip, port);
			in = new BufferedReader(new InputStreamReader(client.getInputStream()));

			out = new PrintWriter(client.getOutputStream(), true);
			System.out.println("local port:" + client.getLocalPort());
			System.out.println("local ip:" + client.getLocalAddress());
			System.out.println("server port:" + client.getPort());
			System.out.println("server IP:" + client.getInetAddress());
			System.out.println("메시지 입력:");
			while ((input = stdin.readLine()) != null) {
				if (input.equals("bye"))
					break;
				out.println(input);
				out.flush();
				System.out.println("server echo:" + in.readLine());
				System.out.println("메시지 입력:");
			}
			out.close();
			in.close();
			stdin.close();
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
