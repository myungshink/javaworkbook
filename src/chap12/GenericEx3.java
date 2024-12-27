package chap12;
//[예제 12-3]
class Generic2<K,E> {
	K key;
	E name;
	void set(K key, E name) {
		this.key = key;
		this.name = name;
	}
	K getKey() {
		return key;
	}
	E getName() {
		return name;
	}
}

public class GenericEx3 {
	public static void main(String[] args) {
		Generic2<String, Integer> g1 =new Generic2<String,Integer>();
		g1.set("홍길동", 1234);
		String k = g1.getKey();
		Integer n = g1.getName();
		System.out.println(k + "=" + n);
		//g1.set("홍길동", "T1234"); 오류 발생
		Generic2<String, String> g2 =new Generic2<String,String>();
		g2.set("홍길동", "T1234"); 
		k = g2.getKey();
		String s = g2.getName();
		System.out.println(k + "=" + s);
	}
}
