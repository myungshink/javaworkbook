package chap7;

//[예제 7-14]
public class FinalMethod {
	final void finalmethod() { // 재정의 불가 메서드
	}
}

class SubMethod extends FinalMethod {
	void finalmethod() { // error
		System.out.println("오버라이딩 불가 메서드");
	}
}
