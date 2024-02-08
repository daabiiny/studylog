package operator;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// Scanner를 이용하여 문자열 이름과, 정수 나이를 입력받으세요 (1. 변수 선언 및 초기화)
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		String adult;
		
		System.out.print("이름 입력 : ");	// (2. 입력)
		name = sc.nextLine();
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		
		// 나이가 20이상이면 "성인", 아니면 "미성년자" 값을 삼항연산으로 결정해서 변수에 담으세요
		// (3. 연산 or 계산)
		adult = (age >= 20) ? "성인" : "미성년자";
		
		// 이름과 나이, 성인/미성년자 여부를 한 문장으로 printf()를 이용하여 출력하세요 (4. 결과 처리)
		System.out.printf("%s님의 나이는 %d살이고, %s입니다\n", name, age, adult);
		
		// Scanner 객체는 close() 처리해야 합니다 (5. 마무리)
		sc.close();
	}
}
