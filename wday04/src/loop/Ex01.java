package loop;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// 반복문 : 조건에 따라, 내부 코드를 반복 수행한다
		int num = 10;
		System.out.println("num : " + num);
		
		num += 1;
		System.out.println("num : " + num);
		
		num += 1;
		num += 1;
		num += 1;
		num += 1;
		num += 1;
		System.out.println("num : " + num);
		System.out.println();
		
		// 여기서부터 반복문 사용
		num = 10;
		System.out.println("num : " + num);
		
		if(num < 16) {		// 조건이 참이면
			num += 1;		// {} 내부의 종속문장을 1회 실행한다
		}
		System.out.println("num : " + num);
		
		while(num < 16) {	// 조건이 참이면
			num += 1;		// {} 내부의 종속문장을 실행하고, 다시 조건을 체크한다
		}					// 조건이 거짓이면 반복을 중단하고 이후 코드를 수행한다
		System.out.println("num : " + num);
		
		// 1) while의 조건식은 반복을 수행하다보면, 결국 거짓이 되는 조건으로 설정해야 한다
		while(num > 0) {
			num += 1;
			System.out.println("무한반복 : " + num);
			if(num == 100) {
				break;	// switch, while, for에 대해 범위블럭 아래쪽으로 탈출한다
			}
		}
		System.out.println("num : " + num);
		
		// 2) 반복 횟수를 알수 없는 경우, 혹은 특정하기 힘든 경우 while조건에 true를 넣기도 한다
		int count = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
			count++;
			if(num % 10 == 0) {
				break;
			}
		}
		System.out.println("입력한 값 : " + num);
		System.out.println("반복횟수 : " + count);
		sc.close();
		
		// 3) 특정 횟수만큼 반복하고 싶으면, while 및 for문을 사용할 수 있다
		int i = 0;							// 1) 증감변수선언 및 초기화
		while(i < 5) {						// 2) 조건 판별
			System.out.println("Hello");	// 3) 종속 문장
			i++;							// 4) 변수 증감
		}	// 1 -> 2 -> 3 -> 4 -> 2 -> 3 -> 4 -> 2 -> 3 -> ...
		System.out.println("끝");
		
		//     [1]      [2]    [4]
		for(int j = 0; j < 5; j++) {
			System.out.println("Java");	// [3]
		}	// 1 -> 2 -> 3 -> 4 -> 2 -> 3 -> 4 -> 2 -> 3 -> ...
		System.out.println("끝");
	}
}







