package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {

		// 모든 클래스의 부모는 object 클래스이다.
		Goods camera = new Goods();
		camera.hashCode(); // 부모 object클래스의 메소드

		Object obj = new Object();
		System.out.println(obj.getClass()); // class java.lang.Object, 클래스 정보
		System.out.println(obj.toString()); // java.lang.Object + @ + 28a418fc, 출력정보
		System.out.println(obj.hashCode()); // 681842940, 주소라고 인지(스택영역)
		System.out.println(obj.equals(camera)); // false, 두개가 같은가?
		
	}

}
