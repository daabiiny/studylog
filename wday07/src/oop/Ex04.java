package oop;

// 필드에 private
// 메서드에 public

class Test4 {
	// 클래스로 단일 데이터의 형태를 나타낼 때 속성을 저장할 필드는 private을 설정한다
	private String name;
	private int age;
	
	// 필드에 private을 설정하면, 값을 가져오거나, 값을 새로 대입할 수 없기 때문에
	// 참조 및 값 변경에 대한 메서드를 만들어주어야 한다
	// private이더라도, 클래스 내부에서는 자유롭게 접근이 가능하다
	public void setName(String name) {	// name 필드에 값을 대입하는 함수
		this.name = name;	
	}
	public String getName() {			// name필드의 값을 외부로 반환하는 함수
		return name;
	}
	public void setAge(int age) {		// age 필드에 값을 대입하는 함수
		this.age = age;
	}
	public int getAge() {				// age필드의 값을 외부로 반환하는 함수
		return age;
	}
}

public class Ex04 {
	public static void main(String[] args) {
		Test4 ob1 = new Test4();
		// ob1.name = "찬혁";
		// ob1.age = 25;
		ob1.setName("찬혁");
		ob1.setAge(25);
		
//		System.out.printf("%s님의 나이는 %d살입니다\n", ob1.name, ob1.age);
		System.out.printf("%s님의 나이는 %d살입니다\n", ob1.getName(), ob1.getAge());
		
	}
}
