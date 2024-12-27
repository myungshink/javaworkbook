package chap18;
//예제[18-3]
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionToStreamEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "b", "c");
		Stream<String> stream = list.stream();
		stream.forEach(s->System.out.println(s));
		
	}
}
