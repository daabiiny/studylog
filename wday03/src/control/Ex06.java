package control;

public class Ex06 {
	public static void main(String[] args) {
		// 제어문 (control statement)
		// 코드 진행의 흐름을 제어하는 구문

		// 1) 분기문 : 조건에 따라 서로 다른 코드를 수행할 수 있다
		//   		 조건에 따라 특정 코드를 수행하거나, 수행하지 않을 수 있다
		// 			if, if ~ else if ~ else, switch ~ case
		
		// 2) 반복문 : 조건에 따라 특정 코드를 반복 수행한다
		//			while, do ~ while, for
		
		// 3) 기타 제어문 : 코드의 흐름을 중단하거나, 다시 수행할 수 있다
		//			break, continue, return
		
		int cash = 10000;
		int card = 1;
		boolean byTaxi = (cash >= 10000) || (card != 0);
		
		// 삼항연산자를 이용한 처리
		// 1회 출력한다는 행위는 동일하고, 출력하는 값만 다르다
		// 조건에 따라 2개의 선택지만 존재한다
		System.out.println(byTaxi ? "택시를 타고 이동합니다" : "걸어서 이동합니다");
		
		// 제어문 if를 이용한 처리 (보다 상세한 코드를 작성할 수 있고, 행위의 내용이 달라도 상관없다)
		if(byTaxi) {
			System.out.println("택시를 타고 이동합니다");
			if(card != 0) {
				System.out.println("카드로 지불합니다");
			}
			else if(cash >= 10000) {
				System.out.println("현금으로 지불합니다");
			}
		}
		if(!byTaxi) {
			System.out.println("걸어서 이동합니다");
		}
		
		
		
		
		
		
		
		
		
	}
}
