package array;

import java.util.Arrays;

public class Ex06 {
	public static void main(String[] args) {
		// 문자열도 크기 비교가 가능하다
		String s1 = "apple";
		String s2 = "banana";
		
		System.out.println("s1을 기준으로 s2의 크기를 비교 : " + s1.compareTo(s2));
		System.out.println("s2를 기준으로 s1의 크기를 비교 : " + s2.compareTo(s1));
		
		// 문자열을 구성하는 각 글자는 char타입이며, 글자는 정수로 처리된다
		char ch1 = 'a';
		char ch2 = 'b';
		System.out.printf("%c : %d\n", ch1, (int)ch1);
		System.out.printf("%c : %d\n", ch2, (int)ch2);
		
		System.out.println("ch1 > ch2 : " + (ch1 > ch2));
		System.out.println("ch1 - ch2 > 0 : " + (ch1 - ch2 > 0));
		
		// A.compareTo(B) 함수는 개념적으로 A - B 의 형태라고 생각하기
		
		String[] arr = {"car", "dinosour", "apple", "eagle", "banana"};
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr.length; j++) {
//				if(arr[i] > arr[j]) {
//				if(arr[i] - arr[j] > 0) {
				if(arr[i].compareTo(arr[j]) > 0) {	// 두 값의 차이가 0보다 큰지 작은지 판별
					String tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
	}
}
