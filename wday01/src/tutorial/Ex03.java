package tutorial;

// 파일의 이름과 public class의 이름은 일치해야 한다
// 파일이름 : Ex03.java
// public class Ex03
// 하나의 소스파일에는 하나의 public class만 만들 수 있다

public class Ex03 {
	public static void main(String[] args) {
		// data type (자료형)
		
		// 컴퓨터에서 사용하는 데이터는 메모리에 만들어져야 한다
		// 디스크에 저장된 파일도, 실행할 때는 메모리에 불러와서 사용한다
		// 메모리에서는 1과 0으로 모든 데이터를 표현한다
		// 하지만 사람은 정수, 실수, 문자열, 회원, 상품, 식당 등 여러 형태를 필요로 한다
		// 메모리에 있는 데이터를 어떤 형태로 변환해서 보여줄것인가에 대한 규칙이 자료형이다
		
		// 자바에서는 크게 2가지 형태로 나눈다
		// 1) 기본 자료형 (8가지)
		// 2) 참조 자료형 (클래스 및 배열 등)
		
		/*
		  	boolean		1바이트		논리값		true / false
		  	byte		1바이트		정수			-128 ~ +127
		  	short		2바이트		정수			-32768 ~ +32767
		  	char		2바이트		정수(글자)		0 ~ 65535
		  	int			4바이트		정수(★)		-21억 ~ +21억
		  	long		8바이트		정수			-922경 ~ +922경
		  	float		4바이트		실수			부동소수점 실수
		  	double		8바이트		실수(★)		부동소수점 실수
		 */
		
		// char가 정수를 저장하고, 글자를 표현하는 방식
		char c1 = 'A';
		char c2 = 65;
		
		System.out.println("c1 : " + c1);	// syso
		System.out.println("c2 : " + c2);
		
		char c3 = '가';
		char c4 = 44032;
		
		System.out.println("c3 : " + c3);
		System.out.println("c4 : " + c4);
		
		c2 += 1;	// 저장된 값을 1 증가시킨다
		c4 += 1;	// 저장된 값을 1 증가시킨다
		
		System.out.println("c2 : " + c2);
		System.out.println("c4 : " + c4);
		
		// 변수의 범위를 벗어나는 값을 저장하면, 표현가능한 범위의 값으로 바뀐다
		// byte는 -128 ~ +127까지 저장 가능
		byte by = (byte)128;
		System.out.println("by : " + by);
		
		int num = 128;
		System.out.println("num : " + num);
		
		// 정수에서 대표 자료형은 int이다
		// 실수에서 대표 자료형은 double이다
		
		// 메모리에는 변수가 아니면서 존재하는 값도 있다
		// 이런 값들은 상수(항상 같은 값) 혹은 리터럴이라고 한다
		// 변수뿐 아니라, 모든 데이터는 자료형이 필요하다
		// 정수이면서 대표자료형이 아닌 값은 별도 표기를 해주어야 한다(long)
		// 실수이면서 대표자료형이 아닌 값은 별도 표기를 해주어야 한다(float)
		
		// 변수선언시에만 예외적으로 허용한다(int보다 작은 정수만)
		short s1 = 30000;
		short s2 = (short)40000;	// 왼쪽과 오른쪽의 크기가 서로 다르기 때문에
									// 양쪽의 자료형을 맞추면 담을 수 있다
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2); // 강제로 담았으니 데이터의 손실은 감수해야 한다
		
		// 대입연산(=) : 우변의 값을 좌변의 공간에 복사하여 저장한다
		
	}
}









