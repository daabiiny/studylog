package quiz;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		
		// 두 정수를 입력받아서 더 큰수를 화면에 출력하세요
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1을 입력 하시오 : ");
		num1 = sc.nextInt();
		
		System.out.print("정수2을 입력 하시오 : ");
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1);
		}
		else {
			System.out.println(num2);
		}
		sc.close();
	}
}
