package array;

public class Ex06 {
	public static void main(String[] args) {
		// 배열 : 같은 자료형의 여러 변수를 연속으로 배치하여 관리하는 형태
		// 단일 변수를 여러개 만들면 일괄작업을 처리할 수 없다
		int n1 = 2, n2 = 3, n3 = 1;
		int max = Integer.MIN_VALUE;
		
		if(max < n1) 	max = n1;
		if(max < n2) 	max = n2;
		if(max < n3) 	max = n3;
		
		System.out.println("max : " + max);
		
//		for(int i = 1; i <= 3; i++) {	// 변수 이름이 유사할 뿐, 실제로 일괄처리는 할 수 없다
//			if(max < ni) 	max = ni;
//		}
		
		int[] arr = { 2, 3, 1, 5, 4 };
		int max2 = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {	// 배열의 길이만큼 반복한다
			// 배열의 인덱스를 활용하여, 서로 다른 값에 접근할 수 있다
			// 배열의 인덱스는 항상 0부터 시작한다
			if(max2 < arr[i]) 	max2 = arr[i];
		}
		System.out.println("max2 : " + max2);
	}
	
}

