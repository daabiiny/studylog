package loop;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) throws Exception {
		// for 활용 예시
		// 1) 1부터 10까지 한줄에 출력하기
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 2) 5부터 0까지 한줄씩 출력하기
		for(int i = 5; i >= 0; i--) {
			System.out.println(i + " !!");
//			Thread.sleep(1000); 	// 출력 이후 1초 대기한다
		}
		System.out.println("발사 !!");
		
		// 3) 두개의 변수를 활용하여 for문 진행하기
		for(int i = 0, j = 1; i < 5; i += 1, j *= 2) {
			System.out.printf("i : %d, j : %d\n", i, j);
		}
		System.out.println();
		
		// 4) 입력받은 만큼 반복하기
		Scanner sc = new Scanner(System.in);
		// ㅂ 한자키
		String ruler = "┌┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┐\n"
					 + "│    │    │    │    │    │    │";
		int distance;
		
		System.out.print("정수 입력 : ");
		distance = sc.nextInt();
		
		System.out.println(ruler);
		for(int i = 0; i < distance; i++) {
			System.out.print(" ");
		}
		System.out.println("↑");	// ㅁ 한자키
		sc.close();
		
	}
}
