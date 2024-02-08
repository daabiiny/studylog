package function;

public class Ex01 {
	public static void main(String[] args) {
		// 함수 : 특정 작업을 수행하는 코드를 묶어서 이름을 부여하고
		// 필요할 때 마다 이름을 지정하여 호출하고, 실행할 수 있는 요소
		
		// 일정한 형태의 작업이 자주 실행될 때, 실행내용을 묶어서 정리해두면
		// 매번 같은 코드를 적어야할 필요가 없어서 코드 진행이 편리해진다
		
		// 1) 두 수의 덧셈
		System.out.printf("%d + %d = %d\n", 1, 2, 1 + 2);
		System.out.printf("%d + %d = %d\n", 2, 4, 2 + 4);
		System.out.printf("%d + %d = %d\n", 3, 7, 3 + 7);
		System.out.println();
		
		for(int i = 1; i <= 2; i++) {
			System.out.printf("%d + %d = %d\n", i, i * 2, i + i * 2);
			// 3 + 7은 일정한 규칙으로 나타나는 식이 아니기 때문에
			// 반복문 내부에서 처리하기 까다롭다 (연속적이고 규칙적인 형태의 코드는 아님)
		}
		System.out.println();
		
		System.out.println(plusString(1, 2));
		System.out.println(plusString(2, 4));
		System.out.println(plusString(3, 7));
		
	}	// end of main()
	
	// 함수의 정의 : 함수 만들기, 전달받는 값과 처리 내용, 반환값에 대한 규칙을 설정한다
	static String plusString(int n1, int n2) {		// 어떤 두 정수 n1, n2를 전달받아서
		String str = "%d + %d = %d";				// 덧셈식의 서식을 설정하고
		str = String.format(str, n1, n2, n1 + n2);	// 서식의 빈 칸에 각 값을 넣고
		return str;									// 결과물(str)을 반환한다(돌려준다)
	}
	
	static int plus(int n1, int n2) {	// 두 정수 n1, n2를 전달받아서
		int answer = n1 + n2;			// answer 변수에 두 정수의 합계를 저장하고
		return answer;					// 그 합계를 반환한다
	}
	/*
		[반환자료형] [함수이름] (매개변수) {	// 매개변수에 어떤 값을 전달받아서
			...함수내용...				// 정해진 내용대로 코드를 실행하고
			return [반환값]				// 마지막에 만들어진 값을 돌려준다
		}								// 반환값의 자료형은 반환자료형과 일치해야 한다
	 */
	
}	// end of class



