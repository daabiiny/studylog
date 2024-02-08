package casting;

public class Ex06 {
	public static void main(String[] args) {
		// 정수와 정수를 산술연산하면 그 결과는 정수형으로 나온다
		// 정수와 실수를 산술연산하면 그 결과는 실수형으로 나온다
		// 실수와 실수를 산술연산하면 그 결과는 실수형으로 나온다
		int score1 = 100;
		int score2 = 99;
		int score3 = 87;
		
		// 세 점수의 합계를 구하고, 평균을 구하여 출력하세요
		int total = score1 + score2 + score3;
		System.out.println("합계 : " + total);
		
//		double average = total / 3;			// 정수간의 연산이므로 결과도 정수형
//		double average = (double)total / 3;	// 강제형변환으로 자료형 변환
//		double average = total / (double)3;	// 리터럴도 형변환 가능
		double average = total / 3.0;
//		System.out.println("평균 : " + average);
		System.out.printf("평균 : %.2f\n", average);
		
	}
}
