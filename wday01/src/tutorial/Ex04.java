package tutorial;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// 8개의 기본자료형 외에 많이 쓰는 자료형
		// 1) 문자열 (String)
		String s1 = "Hello";
		String s2 = "world";
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		
		// 숫자의 덧셈은 계산을 수행하지만  (plus)
		// 문자열의 덧셈은 이어붙이기가 된다 (append)
		// 숫자와 문자열의 덧셈이면 이어붙이기로 처리한다
		
		int n1 = 100;
		int n2 = 39800;
		String won = "원";
		
		System.out.println(n1 + n2);
		System.out.println(n1 + won);
		System.out.println(n2 + won);
		System.out.println(n1 + n2 + won);
		
		// 2) Scanner : 키보드 입력 및 파일 입력을 수행할 수 있는 클래스
		Scanner sc = new Scanner(System.in);
		
		// 정수 입력받기
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		
		// 실수 입력받기
		System.out.print("실수 입력 : ");
		double num2 = sc.nextDouble();
		
		// 문자열 입력받기
		System.out.print("문자열 입력 : ");
		String str1 = sc.next();	// 띄어쓰기 혹은 엔터 이전까지 글자를 가져온다
		
		// 문자열 입력받기 (2. 띄어쓰기 포함 입력받기/줄 단위 입력받기)
		sc.nextLine();	// 이전에 입력했지만 저장되지 않은 값을 모두 날린다
		System.out.print("문자열 입력 : ");
		String str2 = sc.nextLine();// 엔터 이전까지 글자를 가져온다
		
		// 입력받은 값 출력하기
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		
		sc.close(); // 스캐너 사용이 모두 끝나면 반드시 닫아줘야 한다
	}
}





