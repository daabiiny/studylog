package test;

import java.util.Random;

public class Quiz1 {

	static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}

	static int[] duplicate() {
		int[] arr = new int[6];
		Random ran = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
				}
			}
		}
		return arr;
	}

	static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1) {
				System.out.printf("%2d, ", arr[i]);
			} else
				System.out.printf("%2d", arr[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int[] arr1 = null;
		System.out.println("응시자 : 정다빈\n");

		for (int i = 0; i < 5; i++) {
			arr1 = duplicate();
			selectionSort(arr1);
			print(arr1);
		}
	}
}
