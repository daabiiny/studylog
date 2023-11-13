package inheritance;

class People{
	String name;
	int age;
	
	public void printMyself() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}

class Student extends People{
	int korean;
	int math;
	int english;
	
	public Student(String name, int age, int korean, int math, int english) {
		super.name = name;	// 부모 필드
		super.age = age;	// 부모 필드
		this.korean = korean;
		this.math = math;
		this.english = english;
	}
	
	public void printScore() {
		System.out.println("국어성적 : " + korean);
		System.out.println("수학성적 : " + math);
		System.out.println("영어성적 : " + english);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Student st = new Student("정다빈", 19, 100, 95, 90);
		st.printMyself();
		st.printScore();
		
		
	}
}
