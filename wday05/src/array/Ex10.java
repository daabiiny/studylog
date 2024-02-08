package array;

import java.util.Arrays;

public class Ex10 {
	public static void main(String[] args) {
		// 배열을 사용하는 이유?
		// 다수의 데이터를 일괄 처리하기 위해서
		
		// 요인이 여러개의 값일 때, 여러개의 결과를 만들기 위해 배열을 활용하기
		
		// 1) 여러 정수가 담긴 배열을 대상으로, 각 정수가 홀수인지 짝수인지 저장하여 결과를 문자열 배열로 출력
		int[] arr1 = new int[] { 1, 7, 24, 91, 55, 42, 31, 67, 72, 85 };
		String[] arr2 = new String[arr1.length];	// arr1과 길이가 같은 문자열 배열
		
		for(int i = 0; i < arr1.length; i++) {	// arr1과 arr2는 길이가 같다
			int num = arr1[i];					// 같은 인덱스로 접근하면 두개의 배열에 접근할 수 있다
			if(num % 2 == 0) {
				arr2[i] = "짝수";
			}
			else {
				arr2[i] = "홀수";
			}
		}
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.printf("%d는 %s입니다\n", arr1[i], arr2[i]);
		}
	}
}
