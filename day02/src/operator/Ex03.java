package operator;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
		// 연산자. operator : 값을 계산하는데 사용되는 기호 및 단어
		
		/* 대입연산 : =
		 * 산술연산 : +, -, *, /, %
		 * 복합대입연산(배정대입연산) : +=, -=, *=, /=, %=
		 * 단항증감연산 : ++, --
		 * 비교연산 : >, <, >=, <=, ==, !=
		 * 논리연산 : &&, ||, !
		 * 비트연산 : &, |, <<, >>
		 * 삼항연산 : A ? B : C
		 * 기타연산 : [], (), instanceof
		 */
		
		// 산술 연산
		// +, -, *, /, %(나머지)
		int n1 = 10;
		int n2 = 3;
		System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
		System.out.printf("%d - %d = %d\n", n1, n2, n1 - n2);
		System.out.printf("%d * %d = %d\n", n1, n2, n1 * n2);
		System.out.printf("%d / %d = %d\n", n1, n2, n1 / n2);
		System.out.printf("%d %% %d = %d\n", n1, n2, n1 % n2);
		
		// 나머지(%) 연산의 용도
		// 1) 홀수/짝수, 약수/배수 관계를 파악하는데 사용
		System.out.println("n1이 n2로 나누어 떨어지는가 : " + (n1 % n2 == 0));
		System.out.println("124가 2로 나누어 떨어지는가 : " + (124 % 2 == 0));
		System.out.println();
				
		// 2) 정수의 자릿수를 구분하기 위해서 사용
		int idNumber = 931224;
		int date = idNumber % 100;	// 0의 개수만큼 오른쪽의 숫자를 가져온다
		idNumber = idNumber / 100;	// 0의 개수만큼 오른쪽의 숫자를 버린다
		int month = idNumber % 100;
		int year = idNumber / 100;
		System.out.printf("%d년 %d월 %d일\n\n", year, month, date);
		
		// 3) 난수(Random)의 범위를 제한하기 위해서 사용
		Random ran = new Random();
		int num = ran.nextInt();
		System.out.println("num : " + num);
		
		// 어떤 수를 6으로 나누면 그 나머지는 6미만의 범위를 가진다
		if(num <0) {				// 랜덤값이 0보다 작으면
			num = num * -1;			// -1을 곱해서 부호를 반전시킨다
		}
		int num2 = num % 6 + 1;						// 1을 더해주는 이유는 0,1,2,3,4,5를 1,2,3,4,5로 범위 만들게
		System.out.println("num2 : " + num2);
		
		int num3 = ran.nextInt(6) +1;
		System.out.println("num3 : " + num3);
		
		
		
	}
}
