package loop;

public class Quiz1 {
	public static void main(String[] args) {
		
//		1) 자신의 이름을 5회 반복하여 출력하세요
		
		String name = "정다빈";
		int num1 = 0;
		
		while(num1 <= 5) {
			num1++;
			System.out.printf("%s\n", name);
		}
		
//		2) 0부터 5까지 한줄에 출력하세요
		
		int num2 = 0;
		
		while(num2 <= 5) {
			System.out.printf("%s ", num2);
			num2++;
		}
		System.out.println();
		
//		3) 5부터 0까지 한줄에 출력하세요
		
		int num3 = 5;
		
		while(num3 >= 0) {
			System.out.print(num3 + " ");
			--num3;
		}
		System.out.println();
		
//		4) 1부터 100까지의 합계를 구하여 출력하세요
		
		int num4 = 1;
		int sum = 0;			// 덧셈에 대한 항등원은 0 (1 + n = 1)		*0을 넣어줘야함!
		
		while(num4 <= 100) {
			sum += num4;
			num4++;
		}
		System.out.println(sum);
		
//		5) 1부터 100사이의 정수 중 7의 배수만 한줄에 출력하세요
		
		int num5 = 1;
		while (num5 <= 100) {
			num5++;
			if (num5 % 7 == 0) {
			System.out.print(num5 + " ");
			}
		}
		System.out.println();
		
		int num6 = 1;
		while (num6 <= 100) {			// 숫자를 반복하여 증가시킬 조건
			if (num6 % 7 == 0) {		// 변화하는 숫자의 값이 7로 나누어 떨어지면 출력
				System.out.print(num6 + " ");
			}
			num6++;
		}
		System.out.println();
		
		int num7 = 7;
		while(num7 < 101) {
			System.out.print(num7 + " ");
			num7 += 7;
		}
		
	}
}
