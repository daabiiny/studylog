package array;

public class Ex09 {
	public static void main(String[] args) {
		
		int[] arr = new int[] { 100, 52, 76, 49, 82 };
		
		// 배열의 각 원소의 합계와 평균을 구하세요 (반복문 활용하기)
		// 평균은 실수로 소수점 둘째자리까지 구하면 됩니다
		// 합계와 평균을 출력하세요
		
		int total = 0;
		double avg = 0;
		
		for(int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		avg = total / (double)arr.length;
		System.out.printf("합계 : %d, 평균 : %.2f\n", total, avg);
	}
}
