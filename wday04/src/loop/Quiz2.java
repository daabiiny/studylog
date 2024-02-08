package loop;

public class Quiz2 {
	public static void main(String[] args) {
		// 직접 계산할 수 있으나, 횟수가 많아서 일일이 하기에는 시간이 오래 걸리는 작업을
		// 컴퓨터가 빠르게 계산할 수 있도록 처리하는 것
		
		// 1) 1부터 100까지의 정수 중에서 홀수의 합과 짝수의 합을 각각 구하여 출력하세요
		// 어떤 코드를 반복문 안에 넣어야 하고, 어떤 코드를 반복문 이전/이후에 배치해야 하는지 생각
		int oddSum = 0, evenSum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0)		evenSum += i;
			else 				oddSum += i;
		}
		System.out.printf("홀수의 합 : %d, 짝수의 합 : %d\n", oddSum, evenSum);
		
		
		// 2) if를 사용하지 않고, 증감식을 변형하여 1부터 100사이의 6의 배수의 합을 구하세요
		// 시작값, 끝값, 증감식을 조절하여 원하는 형태의 반복문 만들기
		int total = 0;
		for(int i = 6; i <= 100; i += 6) {	// 반복횟수가 줄어든다. 더 빠른 처리 가능
			total += i;
		}
		System.out.println("1 ~ 100 사이 6의 배수의 합계 : " + total);
		
		// 3) 문자열 덧셈을 활용하여, 아래 도형을 for문으로 출력하세요
		/*
			#
			# #
			# # #
			# # # #
			# # # # #
		 */
		String s = "";
		for(int i = 0; i < 5; i++) {
			s += "# ";
			System.out.println(s);
		}
		
	}
}
