package chap11;
//[예제 11-23]
import java.util.Random;

public class RandomEx2 {
	public static void main(String[] args) {
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		for(int i=0; i < 5; i++)
		   System.out.println(rand.nextInt(10)+1);
	}
}
