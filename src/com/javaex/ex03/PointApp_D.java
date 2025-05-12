package com.javaex.ex03;

public class PointApp_D {

	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		int c = 6;
		System.out.println(a == b); // true
		System.out.println(a == c); // false

		System.out.println("------------------");

		Point_D p01 = new Point_D(3, 6);
		Point_D p02 = new Point_D(3, 6);
		System.out.println(p01.hashCode()); // 798154996
		System.out.println(p02.hashCode());// 681842940
		System.out.println(p01 == p02); // false(798154996 == 681842940), 메모리의 공간이 다름.
		
		System.out.println(p01.equals(p02));
		/*
		Object.equals를 Point.equals로 바꿔서 메모리 공간 비교에서 매개변수 비교로 변경됨
		결과값이 false에서 true로 변경됨
		*/
		System.out.println("------------------");
		
		Point_D p03 = p01;
		System.out.println(p01.hashCode()); // 798154996
		System.out.println(p03.hashCode());// 798154996
		System.out.println(p03 == p01); // true(798154996 == 798154996), 메모리의 공간이 같음.
		
		
	}

}
