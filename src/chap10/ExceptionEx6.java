package chap10;
//[예제 10-6]
public class ExceptionEx6 {
	public static void main(String[] args) {
		try {
			throw new Exception("예외 강제 발생");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 정상 종료");
	}
}
