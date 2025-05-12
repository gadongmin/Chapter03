package com.javaex.ex06;

public class Ex03 {

	public static void main(String[] args) {
		
		String s01 = new String("안녕하세요");
		String s02 = new String("안녕하세요");
		System.out.println(s01 == s02); // 메모리가 같지 않아서 false
		System.out.println(s01.equals(s02)); // equals를 사용, 메모리 내용이 같아서 true
		
		System.out.println("=================================");
		
		String s03 = "굿모닝";
		String s04 = "굿모닝";
		System.out.println(s03 == s04); // 메모리가 같아서 true
		System.out.println(s03.equals(s04)); // 메모리 내용 동일
		
		s03 = "굿이브닝"; // 메모리 속 내용 변경
		System.out.println(s03 == s04); // s03 메모리 내용이 변경되어 새로운 메모리 생성
		System.out.println(s03.equals(s04)); // equals를 사용, 메모리 내용이 달라서 false
		
		System.out.println("=================================");
		
		String s05 = "안녕";
		if(s05.equals("안녕")) {
			System.out.println("같다");
		}

		System.out.println("=================================");
		/*
		s05 = null; // 메모리가 없을때
		if(s05.equals("안녕")) {
			System.out.println("같다"); //메모리가 없어서 equals를 찾지못함
		}
		*/
		
		s05 = null;
		if("안녕".equals(s05)) { // null 오류를 피하는 방법(문자를 먼저쓴다)
			System.out.println("같다");
		}
	}

}
