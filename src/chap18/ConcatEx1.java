package chap18;
//예제[18-29]
import java.util.stream.Stream;

public class ConcatEx1 {
	public static void main(String[] args) {
		Stream<String> stream1 = Stream.of("홍길동", "김삿갓", "이몽룡","임꺽정","스트림");
		Stream<Integer> stream2 = Stream.of(1,2,3,4,5,6,7,8,9,10);
		Stream<Object> concat = Stream.concat(stream1, stream2);
		concat.forEach(a->System.out.print(a+","));
	}	
}
