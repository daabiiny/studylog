package loop;

public class Ex06 {
	public static void main(String[] args) {
		// for : 반복횟수가 일정한 경우 주로 사용한다
		// 이후, 배열 및 리스트와 연계하여 다수의 데이터를 처리하기 위해 사용한다
		
		for(int i = 0; i < 5; i++) {
			System.out.println(i + " : Hello");
		}
//		System.out.println(i); 	// for문 내부에서 선언한 변수는 for문 안에서만 참조 가능하다
		System.out.println();
		
		// 이미 반복에 사용할 변수가 선언되어 있다면, 자료형을 빼고 작성한다
		int cnt = 0;
		for(cnt = 0; cnt < 3; cnt++) {
			System.out.println("Hello");
		}
		System.out.println();
		
		// 증감식 부분에 복합대입연산자를 활용할 수 있다
		for(int i = 0; i < 10; i += 3) {
			System.out.println(i);
		}
		System.out.println();
		
		for(int i = 1; i < 2000; i *= 2) {
			System.out.println(i);
		}
		System.out.println();
		
		// 변수 선언 및 초기화, 반복조건, 증감식은 각각 생략할 수 있다
		for(int i = 0 ; ; ) {	// while(true)
			System.out.println("무한 반복 : " + i);
			break;
		}
		
		// 반복문 내부에 또다른 반복문을 배치하거나, 분기문(if)을 사용할 수 있다
		for(int i = 0; i < 100; i++) {
			int num = i + 1;
			if(num % 13 == 0) {
				System.out.print(num + " ");
			}
		}
		System.out.println();
		
		// 문자열, 배열, 리스트 등 여러 데이터를 묶어놓은 형식에 대해 반복을 수행한다
		String str = "Microsoft에서 개발한 신규 운영체제로, "
				+ "Windows 10의 후속작으로서 2021년 6월 24일에 공개됐고, "
				+ "동년 10월 4일에 출시됐다.";
		String result = "";
		
		for(int i = 0; i < str.length(); i++) {	// str의 길이만큼 반복한다
			char ch = str.charAt(i);	// str의 i번째 글자를 char로 가져온다
			if('a' <= ch && ch <= 'z') {// 만약, ch가 영어 소문자라면
				ch -= 32;	// 'A' : 65, 'a' : 97
			}
			result += ch;
		}
		System.out.println(result);
		
		// 여러 데이터를 처리하는 for문에서 i값이 필요없다면 (순번에 상관없이 반복을 수행한다면)
		// 각 데이터를 직접 가리키는 형태도 사용할 수 있다 (향상된 for문)
		result = "";
		for(char ch : str.toCharArray()) {	// 글자 배열의 각 글자를 ch라고 할때
			if('0' <= ch && ch <= '9') {	// ch가 0과 9사이에 포함된다면 (정수글자라면)
				ch = '*';					// * 글자로 바꾸고
			}
			result += ch;	// 글자를 결과 문자열에 더한다
		}
		System.out.println(result);
		
		
		
		
		
		
		
		
	}
}
