package chap3;

public class OpEx8 {
	public static void main(String[] args) {
		System.out.println("8 << 2 :" + (8 << 2)); //32
		System.out.println("8 >> 2 :" + (8 >> 2)); //2
		System.out.println("8 >>> 2 :" + (8 >>> 2));//2
		System.out.println("-8 << 2 :" + (-8 << 2));//-32
		System.out.println("-8 >> 2 :" + (-8 >> 2));//-2
		System.out.println("-8 >>> 2 :" + (-8 >>> 2));//????
		System.out.println("8 :" + Integer.toBinaryString(8));
		System.out.println("-8 :" + Integer.toBinaryString(-8));
	}
}
