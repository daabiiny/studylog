package stdout;

public class Ex01 {
	public static void main(String[] args) {
		// 자바 출력 함수
		
		System.out.println("A");	// 기본 출력. 출력 후 한줄 바꿈
		System.out.print("B");		// 별도 줄바꿈 처리 없음. 	
		System.out.printf("C");		// 특정 서식에 맞춰 출력. 줄바꿈 처리 없음
		
		// println() 함수는 값을 지정하지 않으면 줄만 바꿔준다
		System.out.println();
		System.out.println();
		
		// println() 함수와 print() 함수는 여러 값을 출력하지 않고, 하나의 값을 출력한다
		// println() 함수와 print() 함수는 내부에 콤마를 이용하여 여러 값을 나열할 수 없다
		
		int price = 39800;
		System.out.println(price + "원");
		// price와 "원"이라는 값을 이어붙인 다음 하나의 값으로 만들어서 그 값을 출력한다
		
		System.out.printf("%s : %d원\n", "가격", price);
		// System.out.printf(문자열서식, 순서대로값을 나열한다);
		// 첫번째는 반드시 문자열이 와야하고, 서식문자를 포함할 수 있다
		// 두번째부터는 서식에 있는 제어문자의 개수만큼 순서대로 값을 나열하면 된다
		
		
	}
}
