package function;

public class Ex02 {
	static int add(int n1, int n2) {
	int answer = 0;
	answer = n1 + n2;
	return answer;
//	return n1 + n2; 이렇게도 가능
	}
	
	static int getMinNumber(int n1, int n2, int n3) {
		int answer = 0;
			if (n1 < n2 && n1 < n3) {
				answer = n1;
			}
			else if (n2 < n1 && n2 < n3) {
				answer = n2;
			}
			else answer = n3;
		return answer;
	}
	
//	3) 내가 푼것
//	static String upperCase(String str) {
//		String answer = "";
//		
//		char arr[] = str.toCharArray();
//		
//		for(int i = 0; i < arr.length; i++) {
//			char ch = arr[i];
//			if (i == 0) {
//				if (ch >= 'a' && ch <= 'z') {
//					answer += (char)(ch - 32); 
//				}
//				else {
//					answer += ch;
//				}
//			}
//			else {
//				answer += arr[i];
//			}
//		}return answer;
//	}
	
	static String upperCase(String str) {
		String answer = "";
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(i == 0 && 'a' <= ch && ch <= 'z') {
				ch -= 32;	// 첫글자가 소문자이면 대문자로 바꿔서 넣어라
			}
			answer += ch;
		}
		return answer;
	}
	
	static String substring(String str, int n1, int n2) {
		String answer = "";
		for (int i = n1; i < n2; i++) {
			char ch = str.charAt(i);
			answer += ch;
		
//			answer += str.charAt(i);
		
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			if (n1 <= i && i < n2) {
//				answer += ch;
//			}
		}
		return answer;	
	}
		
		
	public static void main(String[] args) {
//		1) 두 정수의 덧셈을 반환하는 함수 add를 작성하세요.
		int result1 = add(20, 30);
		System.out.println("result1 : " + result1);
		
//		2) 세 정수를 전달받아서 가장 작은 수를 반환하는 함수 getMinNumber를 작성하세요	
		int result2 = getMinNumber(45, 23, 33);
		System.out.println("result2 : " + result2);
		
//		3) 문자열 하나를 전달받아서, 첫글자를 대문자로 변환하는 함수 upperCase를 작성하세요
		String result3 = upperCase("hello");
		System.out.println("result3 : " + result3);
		
		String result4 = upperCase("3 years later");
		System.out.println("result4 : " + result4);
		
//		4) 문자열 하나와 정수 두개를 전달받아서
//		문자열의 from번째 글자부터 to글자 이전까지의 글자를 잘라낸
//		새로운 문자열을 반환하는 함수 substring을 작성하세요
		String q4 = substring("Hello, world !!", 0, 5);	//Hello
		System.out.println("q4 : " + q4);
		
		String t4 = substring("Hello, world !!", 7, 12);//world
		System.out.println("t4 : " + t4);
		
		
		
		
		
		
		
		
		
	}
}
