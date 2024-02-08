package function;

public class Ex02 {
	public static void main(String[] args) {
		// 문제) 두 정수를 전달받아서, 두 정수 사이의 값을 모두 합한 값을 구하기
		// 1) 함수를 사용하지 않는다면
		// 1에서 10 사이의 합계
		int total = 0;
		for(int i = 1; i <= 10; i++) {
			total += i;
		}
		System.out.println(total);
		
		// 11에서 20사이의 합계
		total = 0;
		for(int i = 11; i <= 20; i++) {
			total += i;
		}
		System.out.println(total);
		
		// 2) 함수를 정의하여 미리 만들어두고, 만들어진 함수를 호출하여 풀기
		// 함수 정의는 main함수 바깥쪽에 작성해야 한다
		total = summary(1, 1000);	// y = f(x)
		
		System.out.println("1부터 1000까지 합계 : " + total);
		System.out.println("25부터 75까지 합계 : " + summary(25, 75));
		
	} 	// end of main()
	
	// 함수를 실행할 때 전달해야 하는 값이 있는가? 있다면 어떤 값을 몇개 전달하는가?	x
	// 함수의 이름은 어떻게 지정할 것인가? 의미를 쉽게 전달할 수 있고 간결한 이름인가?	f
	// 함수를 실행하고 나면 마지막에 어떤 형태의 값이 만들어지게 할 것인가?			y
	// y = f(x)
	static int summary(int from, int to) {
		int total = 0;
		for(int i = from; i <= to; i++) {
			total += i;
		}
		return total;
	}
	
	
}	// end of class
