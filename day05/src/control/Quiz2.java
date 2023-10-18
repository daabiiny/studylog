package control;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		
		/*
		놀이공원에 있는 놀이기구에 대한 이용요금을 계산해야 한다
		이 놀이기구는 탑승하면 기본 3000원의 요금을 받고
		이용시간에 따라 추가 요금이 발생한다
		그 시간과 요금은 아래와 같다
		
		시간			요금
		0 ~ 30		3000
		31 ~ 40		3500
		41 ~ 50		4000
		...
		
		시간을 분으로 입력받아서, 요금을 출력하는 프로그램을 작성하세요
		*/

		Scanner sc = new Scanner(System.in);
		int minute = 0;
		int startPay = 3000;
		int addPay = 0;
		int section= 0;
		
		if((minute - 30) % 10 != 0) {		
			section = (minute - 30) % 10 + 1;	
			}
			else section = (minute - 30) % 10;	
				
		addPay = section * 500 + 3000;
		
		System.out.printf("탑승 시간을 입력하시오 : ", minute);
		minute = sc.nextInt();
		
		if (minute <= 30) {
			System.out.printf("내야할 금액은 %d원입니다.\n", startPay);
		}
		else if (minute > 30) {

		}
			
			System.out.printf("내야할 금액은 %d원입니다.\n", addPay);
			
			
		
		
		sc.close();
		
	}
}
