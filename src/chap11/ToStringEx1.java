package chap11;
//예제[11-6]
class Animal {
	String name;
	int age;
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class ToStringEx1 {
	public static void main(String[] args) {
		Animal a1 = new Animal("호랑이",20);
		System.out.println(a1);
	}
}
