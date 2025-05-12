package com.javaex.ex03;

public class Point_D {
	// 필드
	private int x;
	private int y;

	// 생성자
	public Point_D() {
	}

	public Point_D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 메소드-gs
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// 메소드-일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public boolean equals(Object obj) {
		// 전체적용을 위해 equals 매개변수를 Object 부모클래스 작성
		Point_D p = ((Point_D) obj);
		// ((Point_D) obj), Object를 Point로 속이는 방법
		// 부모클래스 안에 들어가는 Point를 p로 명시
		if (this.x == p.x && this.y == p.y) {
			return true;
		} else {
			return false;
		}
	}

}
