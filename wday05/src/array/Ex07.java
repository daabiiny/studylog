package array;

import java.util.Arrays;

public class Ex07 {
	public static void main(String[] args) {
		// 배열의 선언
		// 배열은 자료형 뒤에 [] 를 지정하여 선언한다
		// 배열을 선언할 때 우변에 {} 를 지정하고 {} 안에 값을 순서대로 콤마로 구분하여 지정한다
		int[] arr1 = { 1, 2, 3, 4, 5 };
		
		// 값을 지정하지 않고, 일정 개수의 빈칸을 생성할 때는 배열의 길이를 명시하면 된다
		// 이때, 각 빈칸의 값은 자료형에 따라 0에 맞는 값으로 자동으로 초기화된다
		int[] arr2 = new int[5];	// { 0, 0, 0, 0, 0 }
		
		// new int[] 형태로 값을 지정할 수도 있다
		int[] arr3 = new int[] { 10, 20, 30, 40, 50 };
		
		// 단, 값과 길이를 동시에 지정하면 에러가 발생한다
		// int[] arr4 = new int[5] { 5, 4, 3, 2, 1 }; (X)
		
		// 선언된 배열은 지정한 자료형의 변수가 여러개 만들어진것과 같다
		// index를 이용하여 특정 데이터 하나에 접근할 수 있다
		// 이 값은 일반변수와 동일하게 취급하면 된다
		arr3[0] = 70;					// num = 70;
		int n1 = arr3[1];				// int n1 = num;
		System.out.println(arr3[2]);	// System.out.println(num);
		
		// 이미 선언된 배열변수에 새로운 배열을 지정하려면 new 연산자를 사용해야 한다
		// arr3 = { 11, 22, 33, 44, 55 };	// 실행할 수 없음. new 연산자가 없다
		arr3 = new int[] { 11, 22, 33, 44, 55 };	// 실행가능. 기존 배열은 소멸한다
		
		// 배열은 그대로 출력하면 값을 보여주지 않는다
		System.out.println(arr1);
		
		// 배열의 내용을 전체 출력하는 방법 1 (반복문 활용)
		for(int i = 0; i < arr1.length; i++) {	// 모든 배열은 배열의 길이를 자체적으로 저장하고 있다
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		// 배열의 내용을 전체 출력하는 방법 2 (함수 활용, 문자열 형태로 바꿔서 출력하기)
		System.out.println(Arrays.toString(arr2));
		
		
		// 배열은 같은 자료형의 데이터만 저장할 수 있다
		// arr3[0] = 3.2;		// int 형 배열에 double 타입의 값을 저장할 수 없다
		
		String[] arr4 = new String[] { "Hello", "world", "Java", "ITBANK" };
		double[] arr5 = new double[] { 1.2, 2.3, 3.4, 4.5, 5.6 };
		
		// 배열의 인덱스는 항상 0부터 시작한다
		// 배열의 인덱스는 항상 길이 - 1 까지 존재한다
		// 배열의 인덱스에 접근할 때, 범위를 초과하면 예외가 발생한다
		
		System.out.println(arr4[0]);	// 0부터 시작
		System.out.println(arr4[1]);
		System.out.println(arr4[2]);
		System.out.println(arr4[3]);	// (길이 - 1) 까지 접근할 수 있다
		
//		System.out.println(arr4[4]);	// 길이를 벗어나면 예외가 발생한다
		
		
		
	}
}
