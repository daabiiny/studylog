package input;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// Scanner의 함수별 기능과 특징
		
		// sc.next()			문자열을 입력받는다. 띄어쓰기 및 줄바꿈이 있으면 그 앞까지만 가져온다
		// sc.nextInt()			함수를 입력받는다. 아스키 코드 48 ~ 57범위의 연속된 값만 가져온다
		// sc.nextDouble()		실수를 입력받는다. 48 ~57 및 "." 글자 하나까지만 입력받는다
		// sc.nextLine()		줄 단위로 문자열을 입력받는다. 입력과정에서 개행문자는 제거된다
		
		// sc.nextBoolean()		true 혹은 false를 문자열이 아닌 boolean타입으로 받는다
		
		// 1) next() vs nextLine()
		// 둘다 문자열을 입력받지만, 구분자가 무엇이냐에 따라 달라진다
		// next()는 띄어쓰기 포함한 문장을 입력받을 수 없다
		
		Scanner sc = new Scanner(System.in);
		String s1;
		System.out.print("주소를 동까지 입력 : ");	// 부산광역시 수영구 광안동
		s1 = sc.next();							// "부산광역시" (첫번째 띄어쓰기 전까지 가져옴)
		
		String s2;
		s2 = sc.nextLine();						// "수영구 광안동" (나머지는 버퍼에 남아있다가 엔터이전의 값을 가져옴)
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		
	
		// 2) nextInt() vs Integer.parseInt(sc.nextLine())
		int n1, n2;
		char operator;
		System.out.println("n1 입력 : ");
		n1 = sc.nextInt();
		
		System.out.printf("연산자 입력 (+,-,*,/) : ");
		operator = sc.next().charAt(0);
		
		System.out.printf("n2 입력 : ");
		n2 = sc.nextInt();
		
		System.out.printf("%d %c %d = ?\n", n1, operator, n2);
		
		// 위 코드를 nextLine()으로 처리한 내용
		sc.nextLine();
		
		System.out.print("n1 입력 : ");
		n1 = Integer.parseInt(sc.nextLine());
		// 문자열형식으로 입력받고(엔터키는 정리되고) 문자열 내용을 숫자형식으로 변경하여 저장한다
		
		System.out.printf("연산자 입력 (+,-,*,/) : ");
		operator = sc.nextLine().charAt(0);	// 엔터앞에 글자가 없어서 추출할 수 없는 예외발생
		
		System.out.printf("n2 입력 : ");
		n2 = Integer.parseInt(sc.nextLine());
		
		System.out.printf("%d %c %d = ?\n", n1, operator, n2);
		
		sc.close();
		
		
		
		
		
		
		
		
	}
}
