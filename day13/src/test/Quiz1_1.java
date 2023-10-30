package test;

import java.util.Random;

public class Quiz1_1 {


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
		int[] arr1 = new int[6];
		int num = 0;
		Random ran = new Random();
		
		while(num < 6) {
			arr1[num] = ran.nextInt(45) + 1;
			num++;
			
			for (int i = 0; i < num; i++) {	
				for (int j = i + 1; j < num; j++) {
					if (arr1[i] == arr1[j]) {
					num--;
					}
				}
			}
		}
		return arr1;
	}
	
	static void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1) {
				System.out.printf("%2d, ", arr[i]);
			}
			else 
				System.out.printf("%2d",arr[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {

		int[] arr1 = null;
		System.out.println("응시자 : 정다빈\n");
		
		for(int i = 0; i < 5; i++) {
			arr1 = duplicate();
			selectionSort(arr1);
			print(arr1);
		}
	}


	
}
