package control;

import java.util.Scanner;

//		이클립스 디버깅하기
//		1) 중단점을 설정한다 (Ctrl + shift + b) or 줄번호 왼쪽 클릭
//		2) F11을 눌러서 디버깅을 시작한다 (화면 구성을 바꿀건지 물어보면 yes)
//		3) F6번을 누를때마다 한줄씩 실행되고, 우측에서 변수의 값을 확인할 수 있다.

public class Quiz3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input;
		int num1;
		int num2;
		
		System.out.println("주민등록번호 13자리 입력 (xxxxxx-yyyyyyy)");
		System.out.print("입력 : ");
		input = sc.next();
		
		num1 = Integer.parseInt(input.split("-")[0]);
		num2 = Integer.parseInt(input.split("-")[1]);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println();
		
//		4자리의 출생연도, 2자리의 출생월, 2자리의 출생일
//		그리고 성별은 문자열로 준비하여 모두 출력하세요
		
		int year;
		int month;
		int day;
		int year1990;
		int year2000;
		String gender = "";
		
		day = num1 % 100;
		num1 = num1 / 100;
		month = num1 % 100;
		year = num1 / 100;
		
		switch (num2 / 1000000) {
		case 1:	case 2:
			year1990 = 1900 + year;
			//
			System.out.printf("%d년 %d월 %d일생입니다\n", year1990, month, day);	break;
//			System.out.printf("%4d-%02d-%2d\n", year1990, month, day); break;
			
		default:
			year2000 = 2000 + year;
			System.out.printf("%d년 %d월 %d일생입니다\n", year2000, month, day);
//			System.out.printf("%4d-%02d-%2d\n", year2000, month, day);
		}
		
		switch (num2 / 1000000) {
		case 1:	case 3:
			gender = "남성";
			System.out.printf("성별은 %s입니다\n", gender);	break;
			
		case 2:	case 4:
			gender = "여성";
			System.out.printf("성별은 %s입니다\n", gender);	
		
	}
		sc.close();
		
}
}
