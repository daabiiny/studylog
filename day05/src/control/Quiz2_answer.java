package control;

import java.util.Scanner;

public class Quiz2_answer {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int time = 0;
		int over;
		int fee = 3000;
		
		System.out.printf("탑승 시간을 입력하시오 : ", time);
		time = sc.nextInt();
		
		if(time > 30) {
		over = ((time - 30) / 10) * 500;
		
			if(time % 10 != 0) {
				over += 500;
			}
			fee += over;
			
		}
		System.out.printf("요금 : %,d원\n", fee);
		
	}
}
