package quiz;

import java.util.Scanner;

public class Quiz3_answer {
	public static void main(String[] args) {
		
		int n1, n2, n3, max;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n1 입력 : ");
		n1 = sc.nextInt();
		
		System.out.print("n2 입력 : ");
		n2 = sc.nextInt();
		
		System.out.print("n3 입력 : ");
		n3 = sc.nextInt();
		
		if(true)		max = n1;	// 값이 없으니 일단 n1을 대입해둔다
		if(max < n2)	max = n2;	// 최대값보다 n2가 더 크면 n2를 최대값으로 지정한다
		if(max < n3)	max = n3;	// 최대값보다 n3가 더 크면 n3를 최대값으로 지정한다
		
		System.out.println("가장 큰 수 : " + max);
		
		sc.close();
		
			}
}
