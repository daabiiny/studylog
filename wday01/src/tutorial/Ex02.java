package tutorial;

public class Ex02 {
	// main
	public static void main(String[] args) {
		// syso
		System.out.println("Hello, world !!");
		
		// ctrl + space : 자동완성
		// 1) 시간 단축
		// 2) 오타 방지
		
		System.out.println(1234);
		System.out.println(3.14);
		System.out.println('가');
		System.out.println("안녕");
		
		// 숫자는 따옴표로 묶지 않는다
		// 숫자가 아닌 요소는 따옴표로 묶어서 표현해야 한다
		// 홑따옴표는 단일 문자를 나타내기 위해서 사용한다
		// 쌍따옴표는 문자열(여러글자)을 나타내기 위해서 사용한다
		
		// 만약, 영단어를 따옴표로 묶지 않고 출력한다면, 
		// 그 이름에 맞는 변수를 찾아서 출력하는 구문이다
		
		String apple = "사과";		// 변수 : 특정값을 저장하는 요소
		System.out.println(apple);
		
		int banana = 3500;			// 정수형 변수: 정수만 저장할 수 있다
		System.out.println(banana);
		
		double orange = 5500;		// 실수형 변수: 실수만 저장할 수 있다
		System.out.println(orange);
		
		// 변수는 어떤 값을 저장해두었다가
		// 나중에 그 값을 다시 사용하기 위해서 만든다 (컴퓨터 메모리에 저장됨)
		
		// 어떤 형태의 값을 저장하냐에 따라, 자료의 형태를 지정해야 한다
		// 자료형 (dataType)이 달라지면, 계산(연산)이 원하는대로 수행되지 않는다
		
		System.out.println(10 + 20);
		String n1 = "10";
		String n2 = "20";
		System.out.println(n1 + n2);
		
		// 자바에는 총 8가지의 기본 자료형이 있다
		// Ctrl + m (maximize, 최대화)
	}
}






