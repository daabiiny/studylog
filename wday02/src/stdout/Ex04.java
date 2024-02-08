package stdout;

public class Ex04 {
	public static void main(String[] args) {
		// 이스케이프 시퀀스
		
		// 출력문에서 글자형태로 보이지는 않지만, 특수한 기능을 수행하는 글자를 말한다
		
		char lineFeed = '\n';		// 커서를 다음줄로 이동시킨다
		char carrigeReturn = '\r';	// 커서를 현재 줄의 왼쪽끝으로 이동시킨다
		char tab = '\t';			// 커서를 탭 크기(4 or 8)만큼 오른쪽으로 이동시킨다
		char backspace = '\b';		// 커서를 왼쪽으로 한칸 이동시킨다
		
		System.out.print("ABC");
		System.out.print(backspace);	
		System.out.print("DEF");
		System.out.print(lineFeed);
		System.out.println();
		
		// \r과 \n은 모두 엔터키의 값으로 지정되어 있다
		// 따라서 둘중 하나만 나타나도 줄바꿈을 처리하는 것이 일반적이다
		System.out.println("IT" + carrigeReturn + "BANK");
		System.out.println("IT" + lineFeed + "BANK");
		
		System.out.println("IT\r\nBANK");
		System.out.println();
		
		System.out.println(1 + "\t" + "A");
		System.out.println(12 + "\t" + "A");
		System.out.println(123 + "\t" + "A");
		System.out.println(1234 + "\t" + "A");
		System.out.println(12345 + "\t" + "A");
		System.out.println(123456 + "\t" + "A");
		System.out.println(1234567 + "\t" + "A");
		System.out.println(12345678 + "\t" + "A");
		System.out.println();
		// 이스케이프 시퀀스를 표현하기 위해서는 backslash('\')를 사용한다
		// 백슬래시를 글자로 출력하고 싶으면 \\ 연속으로 두번입력한다
		
		System.out.println("backslash : \\");
		
		// 쌍따옴표를 화면에 출력하고 싶으면 \" 형태로 출력한다
		System.out.println("quotation : \"");
		
		// println(), print() 에서는 %를 정상적으로 출력할 수 있다
		System.out.println("120%");
		
		// printf() 에서는 %가 서식제어문자를 출력하는 역할을 가지기 때문에 바로 출력할 수 없다
		// %는 글자를 출력하려면 %% 로 출력한다
		System.out.printf("percent : %%\n");
		
		System.out.println("tab : [" + tab + "]");
	}
}
