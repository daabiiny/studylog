package tutorial;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// Scanner 를 생성하여 입력받을 준비를 하세요
		Scanner sc = new Scanner(System.in);
		
		// 문자열형태의 이름, 정수형태의 나이, 실수형태의 키를 입력받으세요
		// 각각의 변수를 선언하고 변수 이름은 식별가능하게 자유롭게 작성하세요
		String name;
		int age;
		double height;
		
		System.out.print("이름 입력 : ");
		name = sc.next();
		
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		
		System.out.print("키 입력 : ");
		height = sc.nextDouble();
		
		// 입력이 모두 끝나면 입력된 값들을 한 문장으로 출력하세요
		// "홍길동님의 나이는 20살이고, 키는 175.2cm입니다" 형식으로 출력합니다
		System.out.println(name + "님의 나이는 " + age + "살이고, 키는 " + height + "cm입니다");
		
		// 모든 내용이 끝나면 Scanner를 닫아서 마무리합니다
		sc.close();
	}
}
