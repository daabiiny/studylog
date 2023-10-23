package string;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s1 = "Hello";	
		String s2 = "Hello";
		String s3;	// 무엇을 입력할지 컴퓨터는 모름. 그래서 다른 위치를 가리킴
		
		System.out.print("Hello 라고 입력하세요 : ");
		s3 = sc.next();
		
		System.out.println("s1 == s2 : " + (s1 == s2));	// s1, s2 둘 다 리터럴변수로 입력
		System.out.println("s2 == s3 : " + (s2 == s3));
		System.out.println("s1 == s3 : " + (s1 == s3));
		System.out.println();
		
//		바라보는 위치가 같은 것이 아니고 그 위치의 내용이 같은지 알아봄
//		따라서, 문자열(첫글자가 대문자인 친구)은 비교연산자로 비교하지 않는다
		System.out.println("s1.equals(s2) : " + (s1.equals(s2)));
		System.out.println("s2.equals(s3) : " + (s2.equals(s3)));
		System.out.println("s1.equals(s3) : " + (s1.equals(s3)));
		System.out.println();
		
//		문자열의 내용 비교
//		1) A.equals(B)		: A와 B의 내용이 정확히 일치하는지
//		2) A.startsWith(B)	: A문자열이 B내용으로 시작하는가		(접두사 체크)
//		3) A.endsWith(B)	: A문자열이 B내용으로 끝나는가		(접미사 체크)
//		4) A.contains(B)	: A문자열이 B내용을 포함하는가		(검색어 포함)
		
		System.out.println("s1.startsWith(\"He\") : " + (s1.startsWith("He")));
		System.out.println("s1.endsWith(\"lo\") : " + (s1.endsWith("lo")));
		System.out.println("s1.contains(\"el\") : " + (s1.contains("el")));
		
		sc.close();	
	}
}
