package quiz;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		
		// 친구와 고기집에 갔다. 이 식당에서는 첫 주문에 최소 3인분을 주문해야하고
		// 이후에는 1인분씩 추가가 가능하다.
		// 돼지고기 삼겹살 1인분이 8500원이고
		// 소주 1병 (4500원), 맥주 1병(5000원)을 고정으로 주문했다.
		// 추가 주문한 삼겹살 양을 입력받아서
		// 총 결제해야 할 금액을 계산하고
		// 더치페이로 1인당 얼마를 내야하는지 계산하여 출력하는 프로그램을 작성하세요.
		
		int soju = 4500;
		int beer = 5000;
		int firstPig = 8500 * 3;
		int addPig;
		int finalPig;
		int dutchPay;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("삼겹살 추가(인분) : ");
		addPig = sc.nextInt();
		
		finalPig = firstPig + addPig * 8500;
		dutchPay = ( finalPig + beer + soju ) / 2;
		
		System.out.printf("최종 금액은 %,d원입니다\n", finalPig + beer + soju);
		System.out.printf("1인당 %,d원씩 내면 됨", dutchPay);
		
		sc.close();
	}
}
