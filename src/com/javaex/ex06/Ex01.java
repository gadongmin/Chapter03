package com.javaex.ex06;

public class Ex01 {
	public static void main(String[] args) {
		String s00 = new String("안녕하세요"); // "new"를 작성하면 메모리를 따로 만든다.
		String s01 = new String("안녕하세요");

		System.out.println(s00.toString());
		System.out.println(s01.toString());

		System.out.println(s00 == s01); // 메모리 주소의 값이 같지 않아 false가 나옴
		System.out.println(s00.equals(s01)); // "equals"를 사용 메모리 안으로 들어가 글자의 값이 같아 true가 나옴

		String str00 = "hi";
		String str01 = "굿모닝"; // 약식으로 작성했을때는 같은 메모리를 사용
		String str02 = "굿모닝"; // str01 같은 메모리를 사용

		System.out.println(str00.toString());
		System.out.println(str01.toString());
		System.out.println(str02.toString());

		System.out.println(str01 == str02); // 같은 메모리를 사용하여 true가 나옴
		System.out.println(str01.equals(str02));

		str01 = "굿이브닝"; // 글이 바뀌면서 새로운 메모리가 생김 
		System.out.println(str01 == str02); // 메모리가 변경되면서 true 에서 false로 바뀜
		System.out.println(str01.toString());
		System.out.println(str02.toString());
	}
}
