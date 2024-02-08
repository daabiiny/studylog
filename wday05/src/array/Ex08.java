package array;

public class Ex08 {
	public static void main(String[] args) {
		// 가변인자 : 함수를 호출할 때 전달하는 값의 개수가 일정하지 않고, 여러개를 전달할 수 있는 형식
		
		// 다음 출력함수에서 한 줄당 , 가 몇번 들어가는지 확인해보세요
		System.out.printf("%d\n", 10);					// 1번
		System.out.printf("%d %d\n", 10, 20);			// 2번
		System.out.printf("%d %d %d\n", 10, 20, 30);	// 3번
		System.out.println();
		
		// 개수가 일정하지 않은 정수의 합계를 반환하는 함수를 만들어보자
		System.out.println(getTotal(10));
		System.out.println(getTotal(10, 20));
		System.out.println(getTotal(10, 20, 30));
		
		// 가변인자는 함수 정의 때, 여러 인자들과 함께 사용할 수 있으나
		// 마지막에 한번만 지정할 수 있다 (가변인자는 길이가 정해져 있지 않기때문에)
	}
	
	static int getTotal(int... args) {	// 정수가 여러개 전달되는 함수
		int total = 0;
		for(int i = 0; i < args.length; i++) {
			total += args[i];
		}
		return total;
	}
}


