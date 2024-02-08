package array;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		// 배열의 정렬 : 원소의 크기를 비교하여 배열 안에서 자리를 바꾸는 작업
		
		int[] arr = { 4, 8, 2, 7, 6 };
		
		// 이미 만들어진 함수를 활용하여 간단한 배열은 손쉽게 정렬할 수 있다
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		// 선택 정렬 알고리즘으로 직접 정렬하기
		arr = new int[] { 4, 8, 2, 7, 6 };
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < arr.length - 1; i++) {		// i번째 칸에 적합한 값을 선택한다
			for(int j = i + 1; j < arr.length; j++) {	// i 다음에 있는 나머지 칸을 비교한다
				if(arr[i] > arr[j]) {	// 부등호의 방향을 바꾸면 내림차순이 된다
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					System.out.println(Arrays.toString(arr));
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		int n1 = 10, n2 = 7;
		System.out.printf("n1 : %d, n2 : %d\n", n1, n2);
//		n1 = n2;
//		n2 = n1;
		int tmp = n1;	// 두 변수의 값을 교환하기 위해서 임시 변수를 활용한다
		n1 = n2;
		n2 = tmp;
		System.out.printf("n1 : %d, n2 : %d\n", n1, n2);
		
		
		// 선택정렬은 알고리즘의 효율이 높은 방식은 아니다
		// 그러나, 비교적 구현이 쉽고, 정렬의 핵심을 코드상에서 쉽게 파악할 수 있기 때문에
		// 정렬에 대한 개념을 학습하기 위해서 구현한다
		// 두 값의 크기를 비교하여 (차이를 계산하여) 자리를 바꾼다
	}
}







