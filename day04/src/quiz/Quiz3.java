package quiz;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		// 서로 다른 세 정수를 입력받은 다음 가장 큰 수를 하나 출력하세요
		
		int n1;
		int n2;
		int n3;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		n1 = sc.nextInt();
		
		System.out.print("두번째 정수를 입력하세요 : ");
		n2 = sc.nextInt();
		
		System.out.print("세번째 정수를 입력하세요 : ");
		n3 = sc.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			System.out.println(n1);
		}
		else if (n2 > n1 && n2 > n3) {
			System.out.println(n2);
		}
		else if (n3 > n1 && n3 > n2) {
			System.out.println(n3);
		}

		sc.close();
	}
}
