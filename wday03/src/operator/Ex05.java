package operator;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		// 단항 연산 : 1개의 항에 대해 연산을 수행하는 연산자
		// 이항 연산 : 2개의 항에 대해 연산을 수행하는 연산자
		// 삼항 연산 : 3개의 항에 대해 연산을 수행하는 연산자
		
		// 논리값(boolean)에 따라 서로 다른 값을 결정하는 연산자
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		// (1항: 조건식) : 2항 : 3항
		// 1항이 참이면 2항으로 값을 결정하고, 1항이 거짓이면 3항으로 값을 결정한다
		
		String result = (num % 2 == 0) ? "짝수" : "홀수";
		System.out.printf("%d는 %s입니다\n", num, result);
		
		sc.close();
	}
}





