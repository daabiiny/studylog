package function;

import java.util.Scanner;

public class Ex02_1 {
	public static void main(String[] args) {

//		이름과 생년월일을 입력받아서
//		이름, 올해나이, 생일을 yyyy-MM-dd형식으로 출력하는 코드를 작성하기	

		Scanner sc = new Scanner(System.in);
		String name;
		String birth;

		System.out.print("이름 입력 : ");
		name = sc.nextLine();
		
		int age = 0, year = 0, month = 0, date = 0;

		while (true) {
			System.out.print("생년월일 입력 (yyMMdd) : ");
			birth = sc.nextLine();


			boolean flag = true;
			for (int i = 0; i < birth.length(); i++) {
				char ch = birth.charAt(i);
				if (ch < '0' || ch > '9') {
					flag = false;
					break;
				}
			}
			if (birth.length() == 6 && flag) {
				break;
			}

			System.err.print("생년월일은 6자리의 정수로 입력해주세요");
			
		}
		
		year = Integer.parseInt(birth.substring(0, 2));
		year += (23 < year) ? 1900 : 2000;
		month = Integer.parseInt(birth.substring(2, 4));
		date = Integer.parseInt(birth.substring(4));
		age = 2023 - year;
		
		System.out.printf("%s님은 %d살이고, %4d-%02d-%02d 출생입니다.", name, age, year, month, date);
		sc.close();

	}
}
