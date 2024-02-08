package array;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// 5개의 정수를 입력받아서 화면에 출력하기
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d번째 정수 입력 : ", i + 1);
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("[%d] ", i);
		}
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%3d ", arr[i]);
		}
		System.out.println();
		sc.close();
	}
}
