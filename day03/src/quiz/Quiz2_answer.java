package quiz;

import java.util.Scanner;

public class Quiz2_answer {
	public static void main(String[] args) {
		
		// 변수 선언 및 초기화
		Scanner sc = new Scanner(System.in);
		int totalPrice, dutchPay;
		int meatPrice = 8500;
		int soju = 4500, beer = 5000;
		int addmit;
		
		// 입력 받기
		System.out.println(" 우리 식당에서는 기본 삼겹살 3인분으로 시작합니다");
		System.out.println(" 삼겹살 3인분, 소주 1병, 맥주 1병 주문되었습니다");
		System.out.print(" 삼겹살 추가 주문량을 입력하세요 : ");
		addmit = sc.nextInt();

		// 연산하기
		totalPrice = ( meatPrice * 3 ) + ( soju * 1 ) + ( beer * 1 );
		totalPrice += addmit * meatPrice;
		dutchPay = totalPrice / 2;
		
		// 출력받기
		System.out.printf(" 총 금액 : %,d원\n", totalPrice);
		System.out.printf(" 1인당 결제할 금액 : %,d원\n", dutchPay);
		
		// 마무리
		sc.close();
	
		// 출력할 값을 먼저 쓰고, 어떠한 변수가 필요한지 생각
		// 입력받을 값 생각하고 안내문 작성 후 연산 생각
		// 순서대로 할 필요 없음
		// 같은 범주인 애들끼리 단락 나누기!
		
	}
	
}
