package kosa.relation;

public class Main {

	public static void main(String[] args) {
		Course c1 = new Course("전산학  개론");
		Course c2 = new Course("기초통계학");
		Course c3 = new Course("빅데이터 개론");
		
		Student s1 = new Student("홍길동");
		Student s2= new Student("박길동");
		
		s1.register(c1);
		s1.register(c2);
		
		s2.register(c2);
		s2.register(c3);
		
		s1.printMember();
		System.out.println();
		s2.printMember();
		
		System.out.println("=================");
		
		c2.printCourse();
	}
	
}
