package kosa.oop;

public class Member {

	private String name;
	private int age;
	
	public Member() {}

	public Member(String name, int age) {
		this.name=name;
		this.age=age;
		
	}
	
	public void printMember() {
		System.out.println("�̸�: "+name);
		System.out.println("����: "+age);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
}
