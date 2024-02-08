package oop;

import java.util.Scanner;

class Test {	// 클래스의 이름은 항상 첫글자를 대문자로 작성해야 한다
				// 클래스는 객체를 생성하기 위한 자료형이다
	// 멤버 필드 : 생성된 객체가 값을 저장할 수 있는 변수
	String name;	// 배열과 마찬가지로 reference 타입이기 때문에 멤버 필드는 0에 맞는 값으로 자동 초기화
	int age;
	
	// 멤버 메서드 : 생성된 객체가 호출하여 실행할 수 있는 함수
	void show() {	// 메서드에서는 필드에 자유롭게 접근이 가능하다
		System.out.printf("%s : %d살\n", name, age);
	}
	boolean isAdult() {
		return age >= 20;
	}
	
	// 생성자 : 객체를 생성할 때 초기 작동을 설정하는 특수 함수
	// 생성자는 반환형을 명시하지 않고, 클래스의 이름과 동일한 이름을 사용하는 함수이다
	Test() {
		// 클래스를 작성할 때, 생성자를 작성하지 않으면 매개변수가 없는 기본 생성자가 자동으로 만들어진다
		// 자바에서는 생성자를 통해서만 객체를 생성할 수 있다
	}
	Test(String name, int age) {	// 생성자를 호출할 때 값을 전달해서
		this.name = name;			// 객체 생성 시 필드에 초기값을 바로 지정할 수도 있다
		this.age = age;
	}
	// 메서드 오버로딩 (함수 오버로딩) : 같은 이름으로 함수 여러개를 정의할 수 있는 특성
	// 이름은 같아도 매개변수의 개수, 자료형은 달라야한다
	
	// 접근제한자 : 객체 내부 요소에 대한 접근을 제어하는 요소
}

public class Ex08 {
	public static void main(String[] args) {
		// Object Oriented Programming (객체 지향 프로그래밍)
		// 프로그램상의 모든 데이터를 객체로 취급하여, 객체와 객체간의 상호작용으로 프로그램진행을 서술하는 방식
		
		// 객체(Object)는 모든 사물 및 개념을 나타낸다
		// 사물마다, 개념마다 모두 형태와 기능이 다르기 때문에
		// 내가 원하는 객체의 형태를 지정하기 위한 문법이 필요하다 -> class
		// 자바 소스 코드의 기본 단위는 class
		
		Scanner sc = new Scanner(System.in);
		
		Test ob1 = new Test();	// [자료형] [변수이름] = new [생성자호출]
		ob1.show();
		ob1.name = "이지은";
		ob1.age = 30;
		ob1.show();
		System.out.println(ob1.isAdult());
		
		Test ob2 = new Test();
		ob2.name = "홍진호";
		ob2.age = 42;
		ob2.show();
		System.out.println(ob2.isAdult());
		
		Test ob3 = new Test("나단비", 5);
//		ob3.name = "나단비";
//		ob3.age = 5;
		ob3.show();
		System.out.println(ob3.isAdult());
		
		sc.close();
	}
}
