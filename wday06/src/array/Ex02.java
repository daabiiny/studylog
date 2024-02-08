package array;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[5];
		// 자바 자료형 
		// 1) primitive : 직접 값을 저장한다 (8개의 자료형 모두 소문자로 시작하고 기호를 쓰지 않는다)
		// 2) reference : class, array 값이 있는 위치를 참조하여 저장한다
		// class 타입의 자료형은 항상 대문자로 시작한다
		// array 타입은 [] 기호를 자료형에 포함한다
		// 참조 자료형의 변수에 값이 할당되지 않은 상태를 나타내기 위해서 null 개념을 사용한다
		
//		int num = null;		// 바라보는 대상, 참조하는 대상이 없다
		String str = null;	// 문자열을 저장할 수 있는 변수 str을 선언했지만 참조대상은 없다
		
		// 배열을 선언하면 배열의 멤버(원소)는 자료형에 따라 0에 맞는 값으로 자동으로 초기화된다
		// boolean : false, 정수 : 0, 실수 : 0.0, 문자열 및 참조자료형 : null
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d번째 문자열 : %s\n", i, arr[i]);
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("문자열 입력 : ");
			arr[i] = sc.nextLine();
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d번째 문자열 : %s\n", i, arr[i]);
		}
		sc.close();
	}
}
