package oop;

class Test6 {
	// static 속성은 필드 및 메서드에 지정하여 대상을 객체가 아닌 클래스에 소속시킨다
	// 클래스는 자료형, 객체는 클래스에 의해 생성된 실물 데이터
	// 보통 객체마다 서로 다른 값을 가지고 있으나, 어떤 값은 자료형에 각인되어 있다
	// 예를 들어, 서로 다른 사람의 이름과 나이는 속성을 다르게 설정해야 하지만
	// 모든 사람은 2개의 눈을 가지고 있기 때문에
	// 특정 객체를 지목하지 않아도 자료형만으로도 알수 있는 값이 있다
	// 이런 값은 static 속성으로 지정한다
	// static 속성이 부여된 값은 객체로 접근하지 않고, 클래스로 접근한다
	
	String name;
	int age;
	static int eyeCount = 2;
	
	public Test6(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void show() {
		System.out.printf("%s, %d살\n", name, age);
	}
}

public class Ex06 {
	public static void main(String[] args) {
		Test6 ob1 = new Test6("찬혁", 27);
		Test6 ob2 = new Test6("수현", 24);
		
		ob1.show();	// 객체마다 서로 다른 값을 가진다
		ob2.show();
		
//		ob1.eyeCount = 3;	// 찬혁의 눈 개수를 3으로 설정한다
//		위 코드를 주석해제하여 실행하면, 찬혁 객체 뿐 아니라 수현 객체의 값도 같이 변경된다
//		객체마다 서로 다른 값을 가지는 것이 아니고, 해당 클래스의 모든 객체가 하나의 변수를 참조한다

		// The static field Test6.eyeCount should be accessed in a static way
		// 정적 변수 Test6.eyeCount는 static 방식으로 접근되어야 합니다
		// (객체를 통해서 접근하는것보다 클래스를 통해서 접근하는 것이 더 권장되는 방식이다)
		System.out.println(ob1.name + "의 눈은 " + ob1.eyeCount + "개");
		System.out.println(ob2.name + "의 눈은 " + ob2.eyeCount + "개");
		System.out.println("Test6의 eyeCount값은 " + Test6.eyeCount);
		
		// static속성이 부여되면, 같은 클래스의 서로 다른 객체가 공유하는 값이 된다
	}
}


