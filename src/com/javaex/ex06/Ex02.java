package com.javaex.ex06;

public class Ex02 {
	public static void main(String[] args) {

		String a = " abcd";
		String b = ",efg ";

		System.out.println(a.concat(b)); // a문자열에 b문자열 합
		System.out.println(a + b); // 위와 동일
		System.out.println(b.concat(a)); // b문자열에 a문자열 합
		System.out.println(b + a); // 위와 동일

		System.out.println("--------------------------------");

		a = a.concat(b); // a문자열에 b문자열 합
		System.out.println(a);

		System.out.println("--------------------------------");

		a = a.trim(); // a의 문자열의 좌우 공백제거(중간에 있는 공백은 제거안됨)
		System.out.println(a);

		System.out.println("--------------------------------");

		a = a.replace("ab", "12"); // a의 문자열에 "ab"를 "12"로 변경
		System.out.println(a);

		System.out.println("--------------------------------");

		String[] sArr = a.split(","); // a문자열을 ","로 나눔(다른 문자가 들어갈 경우 해당 문자로 나눔)
		for (int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
		System.out.println("--------------------------------");

		String str = "Hello JAVA!";
		String result01 = str.substring(3); // 문자열(배열) 3부터 끝까지
		System.out.println(result01); // 문자열(배열) 3번째부터 출력		
		
		String result02 = str.substring(1,7); // 문자열(배열) 1부터 까지
		System.out.println(result02); // 문자열(배열) 1부터 까지 출력	
		
		char c = str.charAt(10);
		System.out.println(c); // 문자열(배열) 10번째 출력
		
		
	}
}
