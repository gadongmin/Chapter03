package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		Point p01 = new Point();
		p01.setX(5);
		p01.setY(10);

		System.out.println(p01.toString());
		System.out.println(p01); // print(), println()은 toString()을 찾아서 실행한다.
		
		// 부모클래스
		System.out.println(p01.getClass()); // 현재 사용중인 클래스
		System.out.println(p01.hashCode()); // 클래스 주소로 인지

		System.out.println("-----------------------------------");

	}

}
