package com.javaex.ex03;

public class Person {
	
	//필드
	private String name;
	private String hp;
	private String company;
	
	
	//생성자
	public Person() {
		
	}
	
	public Person(String name, String hp, String company) {
		super();
		this.name = name;
		this.hp = hp;
		this.company = company;
	}

	

	
	//메소드-일반
	public void showInfo() {
		System.out.println("이름: "+ name);
		System.out.println("핸드폰: "+ hp);
		System.out.println("회사: "+ company);
		System.out.println("");
	}

}