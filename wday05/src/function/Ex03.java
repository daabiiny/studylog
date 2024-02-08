package function;

public class Ex03 {
	public static void main(String[] args) {
		// 놀이기구 요금을 계산하기
		// 기본 요금 3천원, 이후 10분이 지날때 마다 추가요금이 500원씩 발생한다
		// 놀이기구 이용 시간을 전달받아서, 요금을 계산하는 코드를 작성하세요
		// 0 ~ 30	: 3000
		// 31 ~ 40	: 3500
		// 41 ~ 50	: 4000
		// ...		: ...
		
		// 원인/요인이 되는 값 : 시간
		// 기본요금구간인지 아닌지
		// 추가요금 계산하여 더하기
		System.out.printf("%d분에 대한 이용요금은 %,d원입니다\n", 30, getFee(30));
		System.out.printf("%d분에 대한 이용요금은 %,d원입니다\n", 35, getFee(35));
		System.out.printf("%d분에 대한 이용요금은 %,d원입니다\n", 40, getFee(40));
		System.out.printf("%d분에 대한 이용요금은 %,d원입니다\n", 45, getFee(45));
		System.out.printf("%d분에 대한 이용요금은 %,d원입니다\n", 50, getFee(50));
		System.out.printf("%d분에 대한 이용요금은 %,d원입니다\n", 51, getFee(51));
		
	}	// end of main()
	
	static int getFee(int time) {	// time을 전달받아서
		int fee = 3000;				// 요금을 계산하고
		int over = 1;
		if(time > 30) {
			if(time % 10 == 0) {
				over = 0;
			}
			fee += (((time - 30) / 10) + over) * 500;
		}
		return fee;					// 반환하는 함수
	}
	
}	// end of class


