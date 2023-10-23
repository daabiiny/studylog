package string;

public class Quiz1 {
	public static void main(String[] args) {
//		주어진 문자열에서 알파벳만 가져와서 새로 구성된 문자열 s2를 출력하세요
//		무조건 다시 풀어보기!
		
//		String s1 = "a1B2c3D4e5";
//		char [] arr = s1.toCharArray();
//		
//		for(int i = 0; i < arr.length; i++) {
//			char ch = arr[i];
//			if((ch >= 'a' || ch <= 'z') && (ch >= 'A' || ch <= 'Z')) {
//				System.out.print(ch);
//			}
//		}
		
		String s1 = "a1B2c3D4e5";
		String s2 = "";			// 정수 덧셈에 대한 항등원이 0이라면
								// 문자열 덧셈에 대한 항등원은 ""이다 (아무것도 더하지 않았을때의 값)
		
		for(int i = 0; i < s1.length(); i++) {	// 전체 글자 중에서
			char ch = s1.charAt(i);				// 각 글자를 ch라고 할때
			if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {	// ch가 알파벳이라면
				s2 += ch;	// ch(알파벳인 글자)를 최종결과 묶음 s2에 더한다
			}
		}
		System.out.println("s2 : " + s2);
		
	}
}
