package array;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// 배열의 길이를 지정하여 생성했을 때 초기값 확인하기
		boolean[] arr1 = new boolean[5];
		int[] arr2 = new int[5];
		double[] arr3 = new double[5];
		String[] arr4 = new String[5];
		Scanner[] arr5 = new Scanner[5];
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
		System.out.println();
		
		// 배열 자체는 모두 reference 타입이므로, null로 초기화 가능하다
		int[] test = null;
		
		System.out.println(test);
		System.out.println(Arrays.toString(test));
		
		// 배열의 멤버 자료형이 reference type이면 NullPointerException을 주의해야 한다
		arr4[0] = "apple";
		arr4[1] = "banana";
		arr4[4] = "eagle";
		
		System.out.println(Arrays.toString(arr4));
		for(int i = 0; i < arr4.length; i++) {
			// 배열 안에 각 문자열이 있으니, 문자열의 길이를 확인해보고 싶다
			// .연산자 앞의 값이 null이면 NullPointerException이 발생한다
			// 참조하는 대상이 없는데, 대상의 속성이나 기능에 접근하려고 시도했다
			// 철수에게 여자친구의 나이를 물어보았다 (철수는 여자친구가 없다)
			// .연산자는 소유격 조사 "~의" 에 해당한다
			if(arr4[i] != null) {	// i번째 멤버의 값이 null이 아닌 경우에만 실행
				System.out.printf("%s의 길이는 %d\n", arr4[i], arr4[i].length());
			}
		}
		
		// 배열 자체도 reference타입이므로 null일 수 있다
		for(int i = 0; test != null && i < test.length; i++) {
			System.out.println(test[i]);
		}
		
		System.out.println("끝");
	}
}
