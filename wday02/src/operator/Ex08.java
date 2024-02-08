package operator;

import java.util.Random;

public class Ex08 {
	public static void main(String[] args) {
		// 연산자 : 값을 계산하기 위한 기호 혹은 단어
		// 산술, 대입, 비교, 논리, 비트, 삼항, 기타
		
		// 산술연산 (+, -, *, /, %)
		
		int n1 = 10;
		int n2 = 3;
		
		System.out.printf("%d + %d = %2d\n", n1, n2, n1 + n2);
		System.out.printf("%d - %d = %2d\n", n1, n2, n1 - n2);
		System.out.printf("%d * %d = %2d\n", n1, n2, n1 * n2);
		System.out.printf("%d / %d = %2d\n", n1, n2, n1 / n2);
		System.out.printf("%d %% %d = %2d\n", n1, n2, n1 % n2);
		
		// [+] : 양쪽 값의 자료형에 따라 다른 결과가 나타날 수 있다
		// 정수 + 정수 	(plus)
		// 정수 + 실수		(plus)
		// 정수 + 문자열	(append)
		
		// [-] : 덧셈과 달리 문자열에 대한 연산을 수행할 수 없다
		
		// [/] : 실수를 포함하면 결과가 실수, 아니면 정수 (몫)
		
		// [%] : 정수형태의 나눗셈에서 나머지를 구한다
		// 1) 홀수/짝수, 약수/배수 등을 구할때 사용한다
		int t1 = 10;
		int t2 = 21;
		System.out.println("t1은 짝수이다 : " + (t1 % 2 == 0));
		System.out.println("t2는 짝수이다 : " + (t2 % 2 == 0));
		
		System.out.println("t1은 3의 배수이다 : " + (t1 % 3 == 0));
		System.out.println("t2은 3의 배수이다 : " + (t2 % 3 == 0));
		
		// 2) 정수의 자릿수를 나눌 수 있다
		String data = "040609";
		int birth = Integer.valueOf(data);
		int year, month, date;
		date = birth % 100;		// 10의 n승 수로 나눌때
		birth = birth / 100;	// 0의 개수만큼
		month = birth % 100;	// 뒤에서 정수를 떼어낸다
		year = birth / 100;
		year += year > 24 ? 1900 : 2000;
		String form = "%d년 %d월 %d일";
		form = String.format(form, year, month, date);
		System.out.println("생일은 " + form + "입니다");
		System.out.println();
		
		// 3) 난수(랜덤한 수)의 범위를 제한할 수 있다
		// 어떤 수 n을 m으로 나누었을 때, 그 나머지는 m보다 작다
		// 100을 6으로 나누었을 때, 그 나머지는 6보다 작다 (0, 1, 2, 3, 4, 5)
		
		Random ran = new Random();
		int ran1 = ran.nextInt();
		ran1 = ran1 > 0 ? ran1 : -ran1;
		System.out.println("ran1 : " + ran1);
		
		int ran2 = ran1 % 6;
		System.out.println("ran2 : " + ran2);
		
		int ran3 = ran2 + 1;
		System.out.println("ran3 : " + ran3);
	}
}









