package com.javaex.ex05;

public class Rectangle {
	// 필드
	private int x;
	private int y;

	// 생성자
	public Rectangle() {
		super();
	}

	public Rectangle(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	// 메소드gs
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

	// 메소드일반
	@Override
	public String toString() {
		return "Rectangle [x=" + x + ", y=" + y + "]";
	}

	public boolean equals(Object obj) {
		Rectangle r = ((Rectangle) obj);
		if (this.x * this.y == r.x * r.y) {
			return true;
		} else {
			return false;
		}

	}

}
