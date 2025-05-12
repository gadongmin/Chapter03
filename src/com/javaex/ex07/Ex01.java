package com.javaex.ex07;

// Wrapper class(기본데이트형 8개)

public class Ex01 {
	// 메소드 일반
	public static void main(String[] args) {
		int a = 3; // 메모리 주소에 3을 바로입력(unboxing 형태)
		System.out.println(a); // boxing이 안되서 "."을 찍어도 메소드 안나옴

		Integer i = new Integer(3); // 메모리 기본주소를 갖고 데이터에 3을 입력(boxing 형태)
		System.out.println(i.toString());

		Integer sum = new Integer(3) + new Integer(3); // boxing 형태로 중간선 생김
		;
		System.out.println(sum);

		Integer v01 = 3; // new Integer(3)를 자동으로 입력(boxing)
		System.out.println(v01.toString()); // 자동으로 boxing처리 "." 찍으면 연동 메소드가 나옴

		Integer i01 = new Integer(999); // boxing 형태
		int b = i01; // boxing → unboxing 형태로 변경
		System.out.println(b); // 연동메소드 안나옴

		System.out.println("-------------------------");
		// 문자열 → 정수
		Integer r01 = 99; // 의미없는 99(정수) 변수
		int result = r01.parseInt("12345"); // 문자열 "12345" → 숫자 12345 로 바꿈(산수가능), 문자열에 문자가 들어가면 숫자로 변경불가
		System.out.println(result + 3); // 12345 + 3 == 12348

		// 문자열 → 정수 좋은방식으로 변경
		int result01 = Integer.parseInt("12345"); // 의미없는 변수를 없애고, 메소드를 사용하여 변수선언
		System.out.println(result01 + 1); // 12345 + 1

		System.out.println("-------------------------");
		// 정수, 실수 → 문자열
		String s = new String("안녕하세요"); // 의미없는 "안녕하세요(문자열)" 변수
		String sNum = s.valueOf(12345); // 정수를 문자열로 변환
		System.out.println(sNum + 1); // 12345 + 1 == 123451

		// 정수, 실수 → 문자열 좋은방식으로 변경
		String sNum2 = String.valueOf(12345); // 의미없는 변수를 제거 메소드에 바로 변수선언(정수,실수 → 문자열)
		System.out.println(sNum2 + 1); // 12345 + 1 == 123451

		String sNum3 = String.valueOf(12345.3343); // 실수 → 문자열
		System.out.println(sNum3 + 1); // 12345.3343 + 1 == 12345.334331
		
		// 정수, 실수 → 문자열 가장 편한 방식
		String sNum4 = 12345 + ""; // 숫자를 문자열로 자동 형변환 방법
		System.out.println(sNum4); // 문자열 12345로 출력
	}

}
