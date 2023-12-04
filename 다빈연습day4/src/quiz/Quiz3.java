package quiz;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		
		// 서로 다른 세 정수를 입력받은 다음 가장 큰 수를 하나 출력하세요
		
		int num1;
		int num2;
		int num3;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하시오 : ");
		num1 = sc.nextInt();

		System.out.print("두번째 정수를 입력하시오 : ");
		num2 = sc.nextInt();
		
		System.out.print("세번째 정수를 입력하시오 : ");
		num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println(num1);
		}
		else if (num2 > num3 && num2 > num1) {
			System.out.println(num2);
		}
		else {
			System.out.println(num3);
		}
	}
}
