package com.javaex.ex01;

public class Goods {
	// 필드
	private String name;
	private int piace;

	// 생성자
	public Goods() {
	}

	public Goods(String name, int piace) {
		this.name = name;
		this.piace = piace;
	}

	// 메소드-gs
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPiace() {
		return piace;
	}

	public void setPiace(int piace) {
		this.piace = piace;
	}

	// 메소드-일반
	@Override
	public String toString() {
		return "Goods [name=" + name + ", piace=" + piace + "]";
	}

}
