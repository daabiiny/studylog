package stdout;

public class Ex03 {
	public static void main(String[] args) {
		// 서식제어문자의 종류와 기능
		
		//	%s	string			문자열			String			
		// 	%d	decimal			정수(10진수)		int, long, byte...
		// 	%c	character		단일문자			char
		// 	%f	floating number	부동소수점 실수		float, double
		
		// 1) %다음에 정수로 자릿수를 지정할 수 있다
		System.out.printf("%10s\n", "apple");
		System.out.printf("%10s\n", "banana");
		System.out.printf("%10s\n", "car");
		System.out.printf("%10s\n", "dinosour");
		System.out.println();
		
		System.out.printf("%d x %d = %2d ", 4, 2, 4 * 2);
		System.out.printf("%d x %d = %2d ", 4, 3, 4 * 3);
		System.out.println();
		System.out.printf("%d x %d = %2d ", 5, 2, 5 * 2);
		System.out.printf("%d x %d = %2d ", 5, 3, 5 * 3);
		System.out.println();
		
		// 2) %d를 이용하여 정수를 출력할 때는 자릿수 앞에 0을 작성하여 빈칸을 0으로 채울 수 있다
		int year = 2024;
		System.out.printf("%d-%02d-%02d\n", year, 1, 1);
		System.out.printf("%d-%02d-%02d\n", year, 1, 31);
		System.out.printf("%d-%02d-%02d\n", year, 12, 1);
		System.out.printf("%d-%02d-%02d\n", year, 12, 31);
		System.out.println();
		
		// 3) %d를 이용하여 정수를 출력할 때, %와 d사이에 ,를 적어서 천단위 구분기호를 넣을 수 있다
		System.out.printf("가격 : %,10d원\n", 100);
		System.out.printf("가격 : %,10d원\n", 1200);
		System.out.printf("가격 : %,10d원\n", 13900);
		System.out.printf("가격 : %,10d원\n", 289000);
		System.out.printf("가격 : %,10d원\n", 1249000);
		System.out.printf("가격 : %,10d원\n", 25749000);
		System.out.println();
		
		// 4) %f를 이용하여 실수를 출력하면, 기본은 소수점 이하 6자리까지 출력한다
		System.out.printf("%f\n", 1.0);
		System.out.printf("%f\n", 2.1);
		System.out.printf("%f\n", 3.14);
		System.out.println();
		
		System.out.printf("%.0f\n", 1.0);
		System.out.printf("%.1f\n", 2.1);
		System.out.printf("%.3f\n", 3.14);
		System.out.println();
		
		// 5) %c는 단일 글자 (char)를 출력할 때 사용할 수 있다
		// char는 정수형이므로, int로 바꿔서 정수형을 출력할 수도 있다
		char ch = '원';
		System.out.printf("ch : %c\n", ch);
		System.out.printf("ch : %d\n", (int)ch);
		System.out.println();
		
		// 6) 자바의 모든 값(data)은 문자열 형식(String)으로 변환 가능하다
		// 특정 서식을 지정하지 않는다면, 모든 값을 %s로 출력할 수 있다
		String name = "홍길동";
		int age = 25;
		double height = 182.5;
		
		System.out.printf("%s님의 나이는 %s살이고, 키는 %s입니다\n", name, age, height);
		
		// 7) 서식 제어문자를 이용하여 화면에 바로 출력하는 대신
		// 서식을 지정하여 값을 문자열 형태로 만들어 변수에 저장해두었다가
		// 필요할 때 출력하는 방법도 있다
		String form = "이름 : %s, 나이 : %d, 키 : %.1f";
		String result = String.format(form, name, age, height);
		
		System.out.println("결과는 " + result + "입니다");
		
	}
}
