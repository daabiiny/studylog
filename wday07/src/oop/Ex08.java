package oop;

// static : 정적 요소에 명시한다
// 여기서 정적 요소란 고정되어 있는 요소를 말한다
// 객체마다 서로 다른 값이 아니라 클래스에 고정되어 있다
// 자바는 소스코드를 불러올 때 클래스의 정보를 먼저 불러온 후 main을 실행하여 객체들을 생성한다
// 순서상 클래스가 먼저 불러와지기 때문에
// static요소와 non-static요소끼리 참조하려면 순서를 잘 생각해야 한다

class Test8 {
	int n1 = 10;
	static int n2 = 20;
	
	// non-static함수가 non-static필드를 참조 
	// (가능, 둘다 객체에 속해 있다. 함수가 실행될때 값이 이미 준비되어 있다)
	void function1() 		{	System.out.println(n1); }
	
	// static함수가 static필드를 참조
	// (가능, 둘다 클래스에 속해 있다. 클래스만 불러와진 상태라면 둘다 참조 가능)
	static void function2() {	System.out.println(n2); }
	
	// non-static함수가 static필드를 참조
	// (가능, static이 먼저 만들어지기 때문에, 함수가 실행되는 시점에서는 이미 값이 만들어져 있다)
	void function3()		{ 	System.out.println(n2); }
	
	// static함수가 non-static필드를 참조
	// (불가능, 함수는 객체가 없는 상황에서도 호출이 가능하지만, 이때 n1은 아직 생성되지 않았을 수 있다)
	// Cannot make a static reference to the non-static field n1
//	static void function4()	{ 	System.out.println(n1); }
	
	// static요소는 static끼리 참조시킨다
	// non-static요소는 non-static끼리 참조시킨다
	// static 함수는 객체가 생성되지 않아도 호출할 수 있다 (static이 먼저 만들어진다)
}

public class Ex08 {
	static int add1(int n1, int n2) {
		return n1 + n2;
	}
	int add2(int n1, int n2) {
		return n1 + n2;
	}
	public static void main(String[] args) {
		System.out.println("Ex08");
		// 자바의 main함수는 반드시 static으로 설정해야 한다
		// 별도의 객체를 생성하지 않더라도, 클래스만 로드되면 곧바로 실행할 수 있어야 한다
		
		int num1 = add1(10, 20);
//		int num2 = add2(20, 30);
		// Cannot make a static reference to the non-static method add2(int, int) from the type Ex08
		// 메인함수가 static이기 때문에, static에서 객체 생성없이 다른 함수를 바로 호출하려면
		// 대상 함수도 static이여야 한다 (static끼리 참조시킨다)
	}
}







