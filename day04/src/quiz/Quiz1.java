package quiz;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 두 정수를 입력받아서 더 큰수를 화면에 출력하세요

		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수를 입력하시오 : ");
		num1 = sc.nextInt();
		
		System.out.print("두번째 정수를 입력하시오 : ");
		num2 = sc.nextInt();

		if (num1 > num2) { // 만약에, num1의 값이 n2의 값보다 더 크면
			System.out.println(num1);
		} 
		else { // 아니면, num1의 값이 n2와 같거나 더 작으면
			System.out.println(num2);
		}
		sc.close();
	}
}
