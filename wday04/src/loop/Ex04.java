package loop;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// 업다운 게임 만들기
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int start = 1;
		int end = 1000;
		int answer = ran.nextInt(end) + start;
		int user;		// 사용자가 입력하는 정수
		int count = 0;
		
		while(true) {	// 사용자가 몇번만에 정답을 맞출지 코드에서 미리 예측할 수 없다
			count += 1;
			System.out.printf("정수 입력 (%d ~ %d) : ", start, end);
			user = sc.nextInt();
			
			if(user < answer) 		System.out.println("UP");
			else if(user > answer) 	System.out.println("DOWN");
			else 					break;
		}
		System.out.printf("축하합니다. %d회 만에 정답을 맞췄습니다\n", count);
		sc.close();
		
	}
}
